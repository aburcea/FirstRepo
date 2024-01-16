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

public class StaticTableTest {
  WebDriver driver;

  @BeforeTest
  public void setup() {

    driver = BrowserSetup.createChromeDriver("https://qa-practice.netlify.app/");
  }

  @Test
  public void TableTest() {
    WebElement tablesButton = TablesMap.Tables(driver);
    TablesSteps.tableClick(tablesButton);
    WebElement staticTableDropdown = TablesMap.staticTable(driver);
    WebDriverWait wait = BrowserSetup.createWebDriverWait(driver, 2);
    wait.until(
        ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//a[@href='/web-table' and text()='Static Table']")));
    TablesSteps.tableClick(staticTableDropdown);
    System.out.println(TablesMap.table(driver));
  }
}
