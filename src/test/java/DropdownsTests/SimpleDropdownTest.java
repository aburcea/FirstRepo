package DropdownsTests;

import Browser.BrowserSetup;
import model.Dropdowns.DropdownsMap;
import model.Dropdowns.DropdownsSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleDropdownTest {
  WebDriver driver;

  @BeforeTest
  public void setup() {

    driver = BrowserSetup.createChromeDriver("https://qa-practice.netlify.app/");
  }

  @Test
  public void simpleDropTest() {
    WebElement dropdownmenu = DropdownsMap.dropdownMenu(driver);
    DropdownsSteps.dropClick(dropdownmenu);
    Select dropdown = new Select(DropdownsMap.dropdown(driver));
    dropdown.selectByVisibleText("Romania");
    WebElement dropDownButton = DropdownsMap.dropdownBtn(driver);
    DropdownsSteps.dropClick(dropDownButton);
    WebElement button = DropdownsMap.someAction(driver);
    DropdownsSteps.dropClick(button);
    System.out.println("Clicked on Some Action");
    DropdownsSteps.dropClick(dropDownButton);
    WebElement button1 = DropdownsMap.someOtherAction(driver);
    DropdownsSteps.dropClick(button1);
    System.out.println("Clicked on Some other Action");
  }
}
