package DemoWebsite;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchBarTest extends CommonAPI {


    @Test
    public void searchBarFunction(){

        type("#search_query_top","Dress");
        click("#searchbox > button");

    }

    @Test
    public void NegativesearchBarFunctionTest(){

        String text = "aaaaa";
        type("#search_query_top", text);
        click("#searchbox > button");
        waitFor(5);
        String NoresultsFound = driver.findElement(By.cssSelector("#center_column > p")).getText();
        Assert.assertEquals(NoresultsFound,"No results were found for your search "+"\""+text+"\"");



    }


}
