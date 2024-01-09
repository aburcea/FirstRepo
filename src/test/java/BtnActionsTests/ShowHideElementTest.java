package BtnActionsTests;

import Browser.BrowserSetup;
import model.BtnActions.BtnActionsMap;
import model.BtnActions.BtnActionsSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ShowHideElementTest {
  WebDriver driver;

  @BeforeTest
  public void setup() {

    driver = BrowserSetup.createChromeDriver("https://qa-practice.netlify.app/");
  }

  @Test
  public void ShowHideTest() {
    WebElement BtnActions = BtnActionsMap.Btn(driver);
    BtnActionsSteps.btnClick(BtnActions);
    WebElement showHide = BtnActionsMap.showHide(driver);
    WebDriverWait wait = BrowserSetup.createWebDriverWait(driver, 2);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("show-hide-elements")));
    BtnActionsSteps.btnClick(showHide);
    if (BtnActionsMap.showHideMsg(driver).equals("This text will be hidden")) {
      System.out.println("Butonul este deja apasat");
      WebElement showHideButton = BtnActionsMap.showHideBtn(driver);
      BtnActionsSteps.btnClick(showHideButton);
      System.out.println("Am apast butonul");

    } else {
    }
  }
}
