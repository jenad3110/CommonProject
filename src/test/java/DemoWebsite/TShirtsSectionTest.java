package DemoWebsite;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TShirtsSectionTest extends CommonAPI {


    @Test
    public void TShirtSection() {
        String TshirtPage = getPageTitle();
        click("#block_top_menu > ul > li:nth-child(3) > a");
        Assert.assertEquals(TshirtPage,"My Store");
        type("#selectProductSort","In stock");
    }

    @Test
    public void AddToCart() {

        click("#block_top_menu > ul > li:nth-child(3) > a");
        // click("#center_column > ul > li > div > div.left-block > div > a.product_img_link > img");
        hoverOver("#center_column > ul > li > div > div.right-block > span > span");
        click("#center_column > ul > li > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");
        waitFor(2);
        String AddedToCartSuccessfully = driver.findElement(By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_product.col-xs-12.col-md-6 > h2")).getText();
        Assert.assertEquals(AddedToCartSuccessfully,"Product successfully added to your shopping cart");

    }

    @Test
    public void ShoppingCartSummary() {

        click("#block_top_menu > ul > li:nth-child(3) > a");
        // click("#center_column > ul > li > div > div.left-block > div > a.product_img_link > img");
        hoverOver("#center_column > ul > li > div > div.right-block > span > span");
        click("#center_column > ul > li > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");
        waitFor(2);
        click("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span");
        String shoppingcartsummary = driver.findElement(By.cssSelector("#cart_title")).getText();
        Assert.assertEquals(shoppingcartsummary,"SHOPPING-CART SUMMARY\n" +
                "Your shopping cart contains: 1 Product");
    }





}


