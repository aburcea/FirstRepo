package DropdownsTests;

import Browser.BrowserSetup;
import model.Dropdowns.DropdownsMap;
import model.Dropdowns.DropdownsSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultiLevelDropDownTest {
  WebDriver driver;

  @BeforeTest
  public void setup() {

    driver = BrowserSetup.createChromeDriver("https://qa-practice.netlify.app/");
  }

  @Test
  public void MultiLevelTest() {
    WebElement dropdownmenu = DropdownsMap.dropdownMenu(driver);
    DropdownsSteps.dropClick(dropdownmenu);
  }
}
