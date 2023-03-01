package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.JumboTestPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_Jum_TC05 {
    @Test
    public void test01() {
        JumboTestPage jumboTestPage = new JumboTestPage();
        // An user should be able to filter by category by clicking on the filter button
        // first you need to navogate to home page
        ReusableMethods.cookiesHandleJumbo();
        // to search a product send keys in the search box
        jumboTestPage.searchBar.sendKeys("kola"+ Keys.ENTER);
        //locate the catories and have them write
        //System.out.println(jumboTestPage.productCategoryCola.getText());
        // assert that the category menus is displayed
        //
        ReusableMethods.waitPlease(2);
        //to do that you need to click first the categories
        jumboTestPage.productCategoryCola.click();
        ReusableMethods.waitPlease(2);
        // the locate an category element and then assert that it is displayed
        Assert.assertTrue(jumboTestPage.productCategoryCola.isEnabled());
        System.out.println(jumboTestPage.productCategoryCola.getText());
        //create expected result
        String expectedValue = "Cola";
        String actualValue = jumboTestPage.productCategoryCola.getText();
        Assert.assertTrue(actualValue.contains(expectedValue));
        // we can see the categories
        Driver.quitDriver();
    }
}
