package BtnActionsTests;

import Browser.BrowserSetup;
import model.BtnActions.BtnActionsMap;
import model.BtnActions.BtnActionsSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollingTest {
  WebDriver driver;
  JavascriptExecutor js = (JavascriptExecutor) driver;

  @BeforeTest
  public void setup() {

    driver = BrowserSetup.createChromeDriver("https://qa-practice.netlify.app/");
  }

  @Test
  public void ScrollTest() {
    WebElement BtnActions = BtnActionsMap.Btn(driver);
    BtnActionsSteps.btnClick(BtnActions);
    WebDriverWait wait = BrowserSetup.createWebDriverWait(driver, 2);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("scrolling")));
    WebElement scrollBtn = BtnActionsMap.scrolling(driver);
    BtnActionsSteps.btnClick(scrollBtn);
    String script =
        "var element = document.evaluate(\"//*[contains(text(), 'THE END')]\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;"
            + "if (element) {"
            + "    element.scrollIntoView();"
            + "}";
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript(script);
  }
}
