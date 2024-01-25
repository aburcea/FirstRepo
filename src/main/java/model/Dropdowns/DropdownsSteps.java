package model.Dropdowns;

import Browser.BrowserSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropdownsSteps {
  WebDriver driver;
  public DropdownsSteps(WebDriver driver){
    this.driver=driver;
  }

  public static void dropClick(WebElement element) {
    element.click();
  }

  public void specificLevelOption(String expectedSpecificLevelOption) {
    switch (expectedSpecificLevelOption) {
      case "Second level 1":
        WebElement firstOption = DropdownsMap.secondLevel1(driver);
        DropdownsSteps.dropClick(firstOption);
        break;
      case "Second level 2":
        WebElement secondOption = DropdownsMap.secondLevel2(driver);
        DropdownsSteps.dropClick(secondOption);
        break;
      case "Second level 3":
        WebElement thirdOption = DropdownsMap.secondLevel3(driver);
        DropdownsSteps.dropClick(thirdOption);
        break;
    }

  }
}
