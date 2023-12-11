package FormsTests;

import Browser.BrowserSetup;
import model.Forms.FormsSteps;
import model.Forms.Register.RegisterMap;
import model.Forms.Register.RegisterSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register {
  WebDriver driver;

  @BeforeTest
  public void setup() {

    driver = BrowserSetup.createChromeDriver("https://qa-practice.netlify.app/");
  }
  @Test
  public void RegisterTest(){
    WebElement formsDropdown = FormsSteps.formsDropdown(driver);
    FormsSteps.formsClick(formsDropdown);
    WebDriverWait wait=BrowserSetup.createWebDriverWait(driver,2);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("register")));
    WebElement register= RegisterMap.register(driver);
    RegisterSteps.clickRegister(register);
    WebElement firstName=RegisterMap.firstNameRF(driver);
    RegisterSteps.enterFirstName(RegisterMap.firstNameRF(driver),"Andrei");
    WebElement lastName=RegisterMap.lastNameRF(driver);
    RegisterSteps.enterLastName(lastName,"Ciprian");
    WebElement phoneNumber=RegisterMap.phoneNumberRF(driver);
    RegisterSteps.enterPhoneNumber(phoneNumber,"1239012390");
    RegisterSteps.selectCountryFromDropdown(driver,"Romania");
    WebElement emailAddress=RegisterMap.emailAddressRF(driver);
    RegisterSteps.enterEmailAddress(emailAddress,"Test@test.com");
    WebElement password=RegisterMap.passwordRF(driver);
    RegisterSteps.enterPassword(password,"abcdefgh");
    WebElement checkBox=RegisterMap.checkboxRF(driver);
    RegisterSteps.checkBox(checkBox);
    WebElement Register=RegisterMap.registerBtnRF(driver);
    RegisterSteps.clickRegister(Register);

  }
}
