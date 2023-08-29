package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import com_jumbo_pages.JumboTestPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_Jum_TC06 {
    @Test
    public void testTC06() {
        Actions action= new Actions(Driver.getDriver());
        JumboTestPage jumboTestPage= new JumboTestPage();
        // handle the cookies button
        ReusableMethods.cookiesHandleJumbo();
        // look  at the social media links
        // go to pagedown
        action.keyDown(Keys.END).perform();
        ReusableMethods.waitPlease(1);
        action.keyUp(Keys.END).perform();
        // locate the social media icons
        System.out.println(jumboTestPage.faceIcon.getText());
        //use the down bar
        Assert.assertTrue(jumboTestPage.faceIcon.isDisplayed());


    }
}
