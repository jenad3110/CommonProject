package DemoWebsite;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class WomenSectionSubMenuTest extends CommonAPI {

    @Test
    public void SelectSubMenuFromWomenSection() {
        hoverOver("#block_top_menu > ul > li:nth-child(1) > a");
        click("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[3]/a");
        waitFor(2);
        hoverOver("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.last-line.first-item-of-tablet-line.first-item-of-mobile-line.last-mobile-line > div > div.left-block > div > a.product_img_link > img");
        click("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span");


    }

    @Test
    public void SelectSubMenuFromWomenSection2() {

        hoverOver("#block_top_menu > ul > li:nth-child(1) > a");
        click("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[2]/a");
        hoverOver("#center_column > ul > li > div > div.left-block > div > a.product_img_link > img");
        click("#center_column > ul > li > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");

    }


    @Test
    public void SelectSubMenuFromWomenSection3() {

        hoverOver("#block_top_menu > ul > li:nth-child(1) > a");
        click("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a");
        hoverOver("#center_column > ul > li > div > div.left-block > div > a.product_img_link > img");
        click("#center_column > ul > li > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");
    }


    @Test
    public void SelectSubMenuFromWomenSection4() {

        hoverOver("#block_top_menu > ul > li:nth-child(1) > a");
        click("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[1]/a");
        hoverOver("#center_column > ul > li > div > div.left-block > div > a.product_img_link > img");
        click("#center_column > ul > li > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");
    }

    @Test
    public void SelectSubMenuFromWomenSection5() {

        hoverOver("#block_top_menu > ul > li:nth-child(1) > a");
        click("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[2]/a");
        hoverOver("#center_column > ul > li > div > div.left-block > div > a.product_img_link > img");
        click("#center_column > ul > li > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");
    }


}
