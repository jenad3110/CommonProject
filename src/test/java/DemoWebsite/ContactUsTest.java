package DemoWebsite;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class ContactUsTest extends CommonAPI {

    @Test
    public void ContactUs() {

        click("#contact-link > a");

        type("#id_contact", "Webmaster");
        waitFor(5);

    }

    @Test
    public void ContactUs2() {

        click("#contact-link > a");

        type("#id_contact","Costumer service");
        waitFor(3);


    }



//    @Test
//    public void SelectSubMenuFromWomenSection2() {
//
//        hoverOver("#block_top_menu > ul > li:nth-child(1) > a");
//        click("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[2]/a");
//        hoverOver("#center_column > ul > li > div > div.left-block > div > a.product_img_link > img");
//        click("#center_column > ul > li > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");
//
//    }

//        @Test
//        public void SelectSubMenuFromWomenSection3() {
//
//            hoverOver("#block_top_menu > ul > li:nth-child(1) > a");
//            click("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a");
//            hoverOver("#center_column > ul > li > div > div.left-block > div > a.product_img_link > img");
//            click("#center_column > ul > li > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");
//        }
//            @Test
//            public void SelectSubMenuFromWomenSection4() {
//
//                hoverOver("#block_top_menu > ul > li:nth-child(1) > a");
//                click("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[1]/a");
//                hoverOver("#center_column > ul > li > div > div.left-block > div > a.product_img_link > img");
//                click("#center_column > ul > li > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");
//            }

//                @Test
//                public void SelectSubMenuFromWomenSection5() {
//
//                    hoverOver("#block_top_menu > ul > li:nth-child(1) > a");
//                    click("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[2]/a");
//                    hoverOver("#center_column > ul > li > div > div.left-block > div > a.product_img_link > img");
//                    click("#center_column > ul > li > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");
//                }





}
