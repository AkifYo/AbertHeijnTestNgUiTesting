package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US01_TC_01 {

    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void testCase01() {

        //1 go to home page
        Driver.getDriver().get(ConfigReader.getProperty("ahUrl"));
        WebElement cookiesBtn = Driver.getDriver().findElement(By.id("decline-cookies"));
        cookiesBtn.click();

        //2 move to log in button
        // albertHeijnHomePage.logInBtn.click();


        WebElement logInBtn = Driver.getDriver().findElement(By.xpath("//a[@aria-owns='menu_mijn']"));
        // logInBtn.click();
        //inloggen button
        ReusableMethods.waitPlease(2);
        actions.moveToElement(logInBtn).perform();
        ReusableMethods.waitPlease(2);
        // click the log in button to reach the login page
        WebElement logInBtn2 = Driver.getDriver().findElement(By.xpath("(//span[text()='Inloggen'])[2]"));
        ReusableMethods.waitPlease(2);
        logInBtn2.click();
        // locate the email taxt box end send your mail
        WebElement mailTextBox = Driver.getDriver().findElement(By.id("username"));
        ReusableMethods.waitPlease(1);

        mailTextBox.sendKeys("akyor06@hotmail.com");
        ReusableMethods.waitPlease(2);

        WebElement mailPassword = Driver.getDriver().findElement(By.id("password"));
        ReusableMethods.waitPlease(1);
        mailPassword.sendKeys("233134");
        WebElement loginBtn3 = Driver.getDriver().findElement(By.xpath(("(//span[@class='button-or-anchor_label__6neDw'])[2]")));
        ReusableMethods.waitPlease(1);
        loginBtn3.click();


    }
}
