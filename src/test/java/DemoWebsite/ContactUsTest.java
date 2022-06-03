package DemoWebsite;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class ContactUsTest extends CommonAPI {










    @Test
    public void SelectItemByColor() {

        click("#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.left-block > div > a.product_img_link > img");
        waitFor(4);
        click("#wishlist_button");
        //click("#thumb_4");
        hoverOver("#thumb_4");
//        waitFor(2);
//        click("#color_13");

    }
//    @Test
//    public void SelectItemBySize() {
//    click("#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.left-block > div > a.product_img_link > img");
//    waitFor(3);
//        type("#group_1", "S");
//

}
