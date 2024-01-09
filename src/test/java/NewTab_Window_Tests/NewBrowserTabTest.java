package NewTab_Window_Tests;

import Browser.BrowserSetup;
import NewTab_Window.NewTab_Window_Map;
import NewTab_Window.NewTab_Window_Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;


import java.util.ArrayList;

public class NewBrowserTabTest {
  WebDriver driver;

  @BeforeTest
  public void setup() {

    driver = BrowserSetup.createChromeDriver("https://qa-practice.netlify.app/");
  }

  @Test
  public void NewBrowserTest() {
    WebElement newTabWindow = NewTab_Window_Map.newTab(driver);
    NewTab_Window_Steps.clickElementsNewTab(newTabWindow);
    WebElement newBrowserTab = NewTab_Window_Map.newBrowserTab(driver);
    NewTab_Window_Steps.clickElementsNewTab(newBrowserTab);
    WebElement pressMeBtn = NewTab_Window_Map.pressMeBtn(driver);
    NewTab_Window_Steps.clickElementsNewTab(pressMeBtn);
    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1));
    WebElement table = NewTab_Window_Map.table(driver);

    List<WebElement> rows = NewTab_Window_Map.elementsTD(driver);

    for (WebElement row : rows) {
      List<WebElement> columns = NewTab_Window_Map.elementsTR(driver);

      for (WebElement column : columns) {
        System.out.print(column.getText() + "\t");
      }

    }
  }
}
