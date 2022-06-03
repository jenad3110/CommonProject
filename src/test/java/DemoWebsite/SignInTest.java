package DemoWebsite;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends CommonAPI {

    @Test
    public void SigningUpUsingNewEmail() {
        click("#header > div.nav > div > div > nav > div.header_user_info > a");
        type("#email_create","pnt@gmail.com");
        click("#SubmitCreate > span");
        waitFor(2);
        String CreateAnAccount = getPageTitle();
        Assert.assertEquals(CreateAnAccount,"Login - My Store");

    }

    @Test
    public void SigninUsingWrongEmailAndPass() {

        click("#header > div.nav > div > div > nav > div.header_user_info > a");
        type("#email","hhhh@gmail.com");
        type("#passwd","hhhhh");
        click("#SubmitLogin > span");

        waitFor(2);
        String WrongEmailAndPass = driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger > ol > li")).getText();
        waitFor(2);
        Assert.assertEquals(WrongEmailAndPass,"Authentication failed.");



    }

    @Test
    public void SigningUpUsingAnExistingEmail() {
        click("#header > div.nav > div > div > nav > div.header_user_info > a");
        type("#email_create","test@gmail.com");

        click("#SubmitCreate > span");
        waitFor(2);
        String EmailAlreadyExist = driver.findElement(By.cssSelector("#create_account_error > ol > li")).getText();
        Assert.assertEquals(EmailAlreadyExist,"An account using this email address has already been registered. Please enter a valid password or request a new one.");


    }

}
