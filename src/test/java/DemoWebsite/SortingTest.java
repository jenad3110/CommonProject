package DemoWebsite;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class SortingTest extends CommonAPI {


    @Test
    public void SpectialsFunctionDropDownMenuandSorting(){

        //lowest price first
        click(" #block_various_links_footer > ul > li:nth-child(1) > a");
        selectFromDropdown("#selectProductSort","Price: Lowest first");

    }
}

