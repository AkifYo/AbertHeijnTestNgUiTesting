package tests;

import com_jumbo_pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    LoginPage loginPage= new LoginPage();
@Test
    public void loginTest(){
   loginPage= homePage.clickInloggenPage();
   loginPage.clickSubmitBtn();
}
}
