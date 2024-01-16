package TableTests;

import Browser.BrowserSetup;
import model.Tables.TablesMap;
import model.Tables.TablesSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DynamicTableTest {
  WebDriver driver;

  @BeforeTest
  public void setup() {

    driver = BrowserSetup.createChromeDriver("https://qa-practice.netlify.app/");
  }

  @Test
  public void DynamicTest() {
    WebElement tablesButton = TablesMap.Tables(driver);
    TablesSteps.tableClick(tablesButton);
    WebElement dynamicTableDropdown = TablesMap.dynamicTable(driver);
    WebDriverWait wait = BrowserSetup.createWebDriverWait(driver, 2);
    wait.until(
        ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//a[@href='/dynamic-table' and text()='Dynamic Table']")));
    TablesSteps.tableClick(dynamicTableDropdown);
    System.out.println(TablesMap.dynamicTableContent(driver));
  }
}
