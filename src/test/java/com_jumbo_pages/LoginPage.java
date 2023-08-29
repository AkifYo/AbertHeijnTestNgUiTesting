package com_jumbo_pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    public By userNameText =By.id("username");
    public By passwordText =By.id("password");
    public By submitBtn =By.id("submit");
    public void clickSubmitBtn(){
        click(submitBtn);
    }
}
