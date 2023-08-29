package com_jumbo_pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
    private By inLoggen= By.xpath("//a[@aria-owns='menu_mijn']");
    private LoginPage clickInloggenPage(){
        click(inLoggen);
        return new LoginPage();
    }
}
