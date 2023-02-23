package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.awt.*;

public class JumboTestPage {
    public JumboTestPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (id ="onetrust-reject-all-handler" )
    public WebElement cookiBtn;

    @FindBy (xpath ="//span[text()='Mijn Jumbo']")
    public WebElement mijnJumboBtn;

    @FindBy (xpath =" //a[@class='item-link']")
    public WebElement inlogBtn;

    @FindBy (id ="username")
    public WebElement usernameTextbox;
    @FindBy (id ="password")
    public WebElement passwordTextbox;
    @FindBy (id ="submit")
    public WebElement submitBtn;
    //products menu
    @FindBy (xpath="//a[normalize-space()='Producten']")
    public WebElement products;
    @FindBy (xpath="//a[normalize-space()='Aardappelen, groente en fruit']")
    public WebElement patatoes;

    @FindBy (xpath="(//button[@data-testid='jum-button'])[12]")
    public WebElement addBtn;


    @FindBy (xpath="//button[@data-label='[object Object][object Object]']")
    public WebElement basketIcon;
    @FindBy (xpath="(//button[@class='jum-button button is-quantity success'])[2]")
    public WebElement numberIcon;
    @FindBy (xpath="//form[@analytics-tag='search']//input[@placeholder='Waar ben je naar op zoek?']")
    public WebElement searchBar;

    @FindBy (xpath="//a[@class='link']")
    public WebElement firstProduct;
    @FindBy (xpath="//h1[@data-testid='jum-heading']")
    public WebElement firstProductText;
    @FindBy (xpath="(//*[name()='path'])[2]")
    public WebElement jumboLogo;
    @FindBy (xpath="//label[@data-testid='jum-input-label']")
    public WebElement productCategoryCola;

    //@FindBys(xpath="//h1[@data-testid='jum-heading']")
    //public WebElement jumboHeading;
}
