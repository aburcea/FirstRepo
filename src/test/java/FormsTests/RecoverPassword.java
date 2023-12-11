package FormsTests;

import Browser.BrowserSetup;
import model.Forms.FormsSteps;
import model.RecoverPassword.RecoverPasswordMap;
import model.RecoverPassword.RecoverPasswordSteps;
import model.Register.RegisterMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RecoverPassword {
  WebDriver driver;

  @BeforeTest
  public void setup() {

    driver = BrowserSetup.createChromeDriver("https://qa-practice.netlify.app/");
  }

  @Test
  public void RecoverTest() {
    WebElement formsDropdown = FormsSteps.formsDropdown(driver);
    FormsSteps.formsClick(formsDropdown);
    WebDriverWait wait=BrowserSetup.createWebDriverWait(driver,2);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("recover-password")));
    WebElement recover = RecoverPasswordMap.recoverPassword(driver);
    RecoverPasswordSteps.clickRecoverPassword(recover);
    WebElement enterEmail=RecoverPasswordMap.recoverPasswordEmail(driver);
    RecoverPasswordSteps.enterEmail(enterEmail,"test@test.com");
    String enteredEmail=enterEmail.getAttribute("value");
    WebElement clickRecover=RecoverPasswordMap.recoverPassBtn(driver);
    RecoverPasswordSteps.clickRecoverPassword(clickRecover);
    String recoverMsg="An email with the new password has been sent to "+enteredEmail+". Please verify your inbox!";
    assert  RecoverPasswordMap.recoverMessage(driver).equals(recoverMsg):"Mesajul nu este cel asteptat";
  }
}
