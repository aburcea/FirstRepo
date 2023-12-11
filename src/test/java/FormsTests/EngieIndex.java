package FormsTests;

import Browser.BrowserSetup;
import Engie.EngieMap;
import Engie.EngieSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class EngieIndex {
    WebDriver driver;

    @BeforeTest
    public void setup() {

        driver = BrowserSetup.createChromeDriver("https://my.engie.ro/autentificare");
    }

    @Test
    public void inputIndex(){
        WebElement clickCookies= EngieMap.acceptCookies(driver);
        EngieSteps.clickCookies(clickCookies);
        WebElement email=EngieMap.email(driver);
        EngieSteps.enterEmail(email,"andreiburcea97@yahoo.com");
        WebElement password=EngieMap.password(driver);
        EngieSteps.enterPassword(driver,"P99mage123#");
        EngieSteps.enterPassword(driver,"P99mage123#");
        WebElement clickLogin=EngieMap.login(driver);
        EngieSteps.clickLogin(clickLogin);

    }
}

