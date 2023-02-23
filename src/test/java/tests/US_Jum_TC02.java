package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.JumboTestPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_Jum_TC02 {
    @Test
    public void  test01(){
        Actions actions= new Actions(Driver.getDriver());
        JumboTestPage jumboTestPage= new JumboTestPage();
        // A user should able to add an product to the basket
        // login to the jumbo website
        ReusableMethods.loginJumbo("akyor06@hotmail.com","Ny233134.");
        // select a category to select a product
        // navigate to products menu and click it
        //- locate the products web element end move to it
        ReusableMethods.waitPlease(2);
        actions.moveToElement(jumboTestPage.products).perform();
        //then select the first category and click it
        ReusableMethods.waitPlease(2);
        jumboTestPage.patatoes.click();
        //actions.moveToElement(jumboTestPage.addBtn).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.waitPlease(2);
        jumboTestPage.addBtn.click();
        // go to basket element and click it
        ReusableMethods.waitPlease(2);
        jumboTestPage.basketIcon.click();
        // get the value of how many items are in the basket

        String expectedValue="1";
        String actualValue= jumboTestPage.numberIcon.getText();
        System.out.println(actualValue);
        Assert.assertEquals(actualValue,expectedValue);


    }
}
