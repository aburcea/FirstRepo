package model.Register;

import model.Login.LoginMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterSteps {
  public static void clickRegister(WebElement element) {
    element.click();
  }

  public static void enterFirstName(WebElement element, String firstName) {
    element.sendKeys(firstName);
  }

  public static void enterLastName(WebElement element, String lastName) {
    element.sendKeys(lastName);
  }

  public static void enterPhoneNumber(WebElement element, String phoneNumber) {
    element.sendKeys(phoneNumber);
  }

  public static void selectCountryFromDropdown(WebDriver driver, String tara) {
    WebElement dropdown = RegisterMap.dropdownRF(driver);
    Select select = new Select(dropdown);
    select.selectByVisibleText(tara);
  }

  public static void enterEmailAddress(WebElement element, String email) {
    element.sendKeys(email);
  }

  public static void enterPassword(WebElement element, String password) {
    element.sendKeys(password);
  }

  public static void checkBox(WebElement element) {
    element.click();
  }
}
