package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.UnitedAirlinesBasePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class UnitedAirlinesBaseTest {

    UnitedAirlinesBaseTest unitedAirlinesBaseTest;
    UnitedAirlinesBasePage unitedAirlinesBasePage;
    UnitedAirlinesTestCases unitedAirlinesTestCases;

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        unitedAirlinesBaseTest = new UnitedAirlinesBaseTest();
        unitedAirlinesBasePage = new UnitedAirlinesBasePage();
        driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("appURL"));
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void takedown(){
        Driver.quitDriver();

    }
}
