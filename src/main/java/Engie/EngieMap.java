package Engie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EngieMap {
  public static WebElement acceptCookies(WebDriver driver) {
    WebElement accCookies =
        driver.findElement(By.cssSelector("button[title=\"Acceptă toate\"].nj-btn--primary"));
    return accCookies;
  }

  public static WebElement email(WebDriver driver) {
    WebElement emailInput = driver.findElement(By.id("username"));
    return emailInput;
  }
  public static WebElement password(WebDriver driver){
      WebElement passInput=driver.findElement(By.id("password"));
      return passInput;
  }
  public static WebElement login(WebDriver driver){
      WebElement loginButton = driver.findElement(By.className("form-buttons"));
      return loginButton;
  }
}
