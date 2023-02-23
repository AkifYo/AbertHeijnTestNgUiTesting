package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.JumboTestPage;
import utilities.ReusableMethods;

public class Us_Jum_TC05 {
    @Test
    public void test01() {
        JumboTestPage jumboTestPage = new JumboTestPage();
        // An user should be able to filter by category by clicking on the filter button
        // first you need to navogate to home page
        ReusableMethods.cookiesHandleJumbo();
        // to search a product send keys in the search box
        jumboTestPage.searchBar.sendKeys("kola"+ Keys.ENTER);
        // assert that the category menus is displayed
        //to do that you need to print the categories

        // the locate an category element and then assert that it is displayed
    }
}
