package tests;

import org.testng.annotations.Test;
import pages.JumboTestPage;
import utilities.Driver;
import utilities.ReusableMethods;


public class US_Jum_TC07 {
    @Test
    public void testTC07() {


        Driver.getDriver().get("jumurl");
        ReusableMethods.waitPlease(2);
        JumboTestPage jumboTestPage= new JumboTestPage();
        jumboTestPage.cookiBtn.click();
        ReusableMethods.waitPlease(2);
    }
}
