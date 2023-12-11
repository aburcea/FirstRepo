package FormsTests;

import Browser.BrowserSetup;
import model.Forms.Login.LoginMap;
import model.Forms.Login.LoginSteps;
import model.Forms.FormsSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SubmitOrder {
  WebDriver driver;

  @BeforeTest
  public void setup() {

    driver = BrowserSetup.createChromeDriver("https://qa-practice.netlify.app/");
  }

  @Test
  public void SubmitTest() {
    WebElement formsDropdown = FormsSteps.formsDropdown(driver);
    FormsSteps.formsClick(formsDropdown);
    WebElement login = LoginMap.login(driver);
    LoginSteps.loginClick(login);
    WebElement emailElement = LoginMap.email(driver);
    LoginSteps.enterEmail(emailElement, "admin@admin.com");
    WebElement password = LoginMap.password(driver);
    LoginSteps.enterPassword(password, "admin123");
    WebElement submitBtn = LoginMap.submit(driver);
    LoginSteps.submitClick(submitBtn);
    WebElement addToCart = LoginMap.addToCart(driver);
    LoginSteps.addToCartAction(addToCart);
    WebElement proceedToCheckout = LoginMap.proceedToCheckout(driver);
    LoginSteps.proceedToCheckoutAction(proceedToCheckout);
    WebElement phoneNumber = LoginMap.phoneNumberSD(driver);
    LoginSteps.enterPhoneNumber(phoneNumber, "123456789");
    WebElement Street = LoginMap.StreetSD(driver);
    LoginSteps.enterStreet(Street, "Valea lunga 14");
    WebElement City = LoginMap.CitySD(driver);
    LoginSteps.enterCity(City, "Bucuresti");
    LoginSteps.selectCountryFromDropdown(driver, "Romania");
    WebElement submitOrder = LoginMap.submitOrderSD(driver);
    LoginSteps.submitOrderClick(submitOrder);
  }
}
