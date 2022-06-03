package DemoWebsite;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class DressSectionTest extends CommonAPI {

    @Test
    public void HoverOverDressAndClickOnCasualDress() {

        hoverOver("//*[@id=\"block_top_menu\"]/ul/li[2]/a");
        hoverOver("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a");
        click("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a");

    }

    @Test
    public void HoverOverDressAndClickOnEveningDress() {

        hoverOver("//*[@id=\"block_top_menu\"]/ul/li[2]/a");
        hoverOver("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a");
        click("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[2]/a");

    }
    @Test
    public void HoverOverDressAndClickOnSummerDress() {

        hoverOver("//*[@id=\"block_top_menu\"]/ul/li[2]/a");
        hoverOver("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a");
        click("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a");

    }



}
