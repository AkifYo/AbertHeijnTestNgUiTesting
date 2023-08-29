package tests;

import com_jumbo_pages.BasePage;
import com_jumbo_pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utilities.ConfigReader;

import java.io.File;
import java.io.IOException;

public class BaseTest {
    protected BasePage basePage;
    protected HomePage homePage;
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
  }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
    @BeforeMethod
    public void loadApp(){
        driver.get(ConfigReader.getProperty("jumUrl"));
        basePage= new BasePage();
        basePage.setDriver(driver);
        homePage= new HomePage();

    }

    @AfterMethod
    public void takeScreenshotForFailures(ITestResult testResult) {
        if (ITestResult.FAILURE == testResult.getStatus()) {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            File destination = new File(System.getProperty("user.dir") +
                    "/resources/screenshots/" +
                    testResult.getName() + ".png");

            try {
                FileHandler.copy(source, destination);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}
