package model.Buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonsSteps {
  public static WebElement buttons(WebDriver driver) {
    WebElement btns = driver.findElement(By.id("buttons"));
    return btns;
  }

  public static btnClick(WebElement element) {
    element.click();
  }
}
