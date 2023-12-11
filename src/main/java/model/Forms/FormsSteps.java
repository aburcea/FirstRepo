package model.Forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormsSteps {
  public static WebElement formsDropdown(WebDriver driver) {
    WebElement forms = driver.findElement(By.id("forms"));
    return forms;
  }

  public static void formsClick(WebElement element) {
    element.click();
  }
}
