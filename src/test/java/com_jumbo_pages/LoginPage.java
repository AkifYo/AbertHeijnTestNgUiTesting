package com_jumbo_pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private By userNameText =By.id("username");
    private By passwordText =By.id("password");
    private By submitBtn =By.id("submit");
    public void clickSubmitBtn(){
        click(submitBtn);
    }
}
