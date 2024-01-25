package DropdownsTests;

import Browser.BrowserSetup;
import java.util.Scanner;
import model.Dropdowns.DropdownsMap;
import model.Dropdowns.DropdownsSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultiLevelDropDownTest {
  private static final String optionLevel="Second level 2";
  WebDriver driver;

  @BeforeTest
  public void setup() {

    driver = BrowserSetup.createChromeDriver("https://qa-practice.netlify.app/");
  }

  @Test
  public void MultiLevelTest() {

    WebElement dropdownmenu = DropdownsMap.dropdownMenu(driver);
    DropdownsSteps.dropClick(dropdownmenu);
    WebElement dropDownButton = DropdownsMap.dropdownBtn(driver);
    DropdownsSteps.dropClick(dropDownButton);
    Actions actions = new Actions(driver);
    Scanner scanner = new Scanner(System.in);
    WebElement hoverElement = DropdownsMap.hoverFirstOption(driver);
    actions.moveToElement(hoverElement).perform();
    DropdownsSteps dropdownsSteps=new DropdownsSteps(driver);
    dropdownsSteps.specificLevelOption(optionLevel);
  }
}
