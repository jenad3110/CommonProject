package DemoWebsite;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class SocialMediaSectionTest extends CommonAPI {


    @Test
    public void SocialMedia()
    {
        //facebook
        click("#social_block > ul > li.facebook > a");
        //twitter
        click("#social_block > ul > li.twitter > a");
        //youtube
        click("#social_block > ul > li.youtube > a");
        //google+
        click("#social_block > ul > li.google-plus > a");
    }



}
