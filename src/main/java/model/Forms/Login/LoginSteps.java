package model.Forms.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginSteps {


  public static void loginClick(WebElement element) {
    element.click();
  }

  public static void enterEmail(WebElement element, String email) {
    element.sendKeys(email);
  }

  public static void enterPassword(WebElement element, String password) {
    element.sendKeys(password);
  }

  public static void submitClick(WebElement element) {
    element.click();
  }

  public static void addToCartAction(WebElement element) {
    element.click();
  }

  public static void proceedToCheckoutAction(WebElement element) {
    element.click();
  }

  public static void enterPhoneNumber(WebElement element, String phone) {
    element.sendKeys(phone);
  }

  public static void enterStreet(WebElement element, String street) {
    element.sendKeys(street);
  }

  public static void enterCity(WebElement element, String city) {
    element.sendKeys("Bucuresti");
  }

  public static void selectCountryFromDropdown(WebDriver driver, String tara) {
    WebElement dropdown = LoginMap.dropDownSD(driver);
    Select select = new Select(dropdown);
    select.selectByVisibleText(tara);
  }

  public static void submitOrderClick(WebElement element) {
    element.click();
  }

  public static void registerClick(WebElement element) {
    element.click();
  }
}
