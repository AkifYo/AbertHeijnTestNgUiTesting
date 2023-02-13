package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.JumboTestPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_Jum_TC01 {
    Actions actions= new Actions(Driver.getDriver());
    @Test
    public void test01(){
        // go to jumbo homepage
        Driver.getDriver().get(ConfigReader.getProperty("jumUrl"));
        // locate the cookies btn end click it
        ReusableMethods.bekle(2);
        JumboTestPage jumboTestPage= new JumboTestPage();
        jumboTestPage.cookiBtn.click();
        ReusableMethods.bekle(2);
        //navigate to mijn jumbo menu button
        actions.moveToElement(jumboTestPage.mijnJumboBtn).perform();
        ReusableMethods.bekle(1);
        // then click it
        jumboTestPage.mijnJumboBtn.click();;
        // click to inlig btn to reach login page
        jumboTestPage.inlogBtn.click();
        //send the mail username textbox
        jumboTestPage.usernameTextbox.sendKeys(ConfigReader.getProperty("email"));
        ReusableMethods.bekle(1);
        // send the password to passwordtextbox
        jumboTestPage.passwordTextbox.sendKeys(ConfigReader.getProperty("password"));
        ReusableMethods.bekle(1);
        // click to login btn
        jumboTestPage.submitBtn.click();

    }
}
