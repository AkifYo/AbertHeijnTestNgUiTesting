package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com_jumbo_pages.JumboTestPage;
import utilities.ReusableMethods;

public class US_Jum_TC04 {
    @Test
    public void test1() {
        //when you navigate to the jumbo main page as a user you can see the logo of the company
        JumboTestPage jumboTestPage= new JumboTestPage();
        // first navigate to the jumbo main page
        ReusableMethods.cookiesHandleJumbo();
        // locate the logo of the company and assert that the logo is displayed
        Assert.assertTrue(jumboTestPage.jumboLogo.isDisplayed());
        System.out.println( jumboTestPage.jumboLogo.isDisplayed());


    }
}
