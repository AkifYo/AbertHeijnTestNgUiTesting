package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import com_jumbo_pages.JumboTestPage;
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
        // then select the first product end get the text if it
        jumboTestPage.firstProduct.click();
        //create the expected result and actual result then compare both results
        String expectedResult= "Turkse";
        String actualResult=jumboTestPage.firstProductText.getText();
        System.out.println(jumboTestPage.firstProductText.getText());
        Assert.assertTrue(actualResult.contains(expectedResult));



    }

}
