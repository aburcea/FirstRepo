package model.Forms.RecoverPassword;

import org.openqa.selenium.WebElement;

public class RecoverPasswordSteps {
  public static void clickRecoverPassword(WebElement element) {
    element.click();
  }

  public static void enterEmail(WebElement element, String mail) {
    element.sendKeys(mail);
  }

  public static void clickRecoverBtn(WebElement element) {
    element.click();
  }
}
