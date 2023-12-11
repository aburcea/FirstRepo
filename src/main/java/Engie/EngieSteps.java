package Engie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EngieSteps {
  public static void clickCookies(WebElement element) {
    element.click();
  }

  public static void enterEmail(WebElement element, String email) {
    element.sendKeys(email);
  }

  public static void enterPassword(WebDriver driver, String password) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
    passwordField.sendKeys(password);
  }

  public static void clickLogin(WebElement element) {
    element.click();
  }
}
