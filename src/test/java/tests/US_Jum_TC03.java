package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.JumboTestPage;
import utilities.ReusableMethods;

public class US_Jum_TC03 {
    @Test
    public void test01() {
        JumboTestPage jumboTestPage= new JumboTestPage();
        //An user can able to reach the product which he searched for

        ReusableMethods.cookiesHandleJumbo();
        // go to home page and locate the search bar
        jumboTestPage.searchBar.sendKeys("turkse yogurt"+ Keys.ENTER);
        // search for turkse yogurt


    }

}
