package com_jumbo_pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
    public By inLoggen= By.xpath("//a[@aria-owns='menu_mijn']");
    public LoginPage clickInloggenPage(){
        click(inLoggen);
        return new LoginPage();
    }
}
