package model.Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropdownsMap {
  public static WebElement dropdownMenu(WebDriver driver) {
    WebElement dropdown = driver.findElement(By.id("dropdowns"));
    return dropdown;
  }

  public static WebElement dropdown(WebDriver driver) {
    WebElement dropdownSelect = driver.findElement(By.id("dropdown-menu"));
    return dropdownSelect;
  }

  public static WebElement dropdownBtn(WebDriver driver) {
    WebElement dropDownBtn = driver.findElement(By.id("multi-level-dropdown-btn"));
    return dropDownBtn;
  }

  public static WebElement someAction(WebDriver driver) {
    WebElement firstAction =
        driver.findElement(By.xpath("//li[@class='dropdown-item']/a[@href='#some-action']"));
    return firstAction;
  }

  public static WebElement someOtherAction(WebDriver driver) {
    WebElement secondAction =
        driver.findElement(By.xpath("//li[@class='dropdown-item']/a[@href='#some-other-action']"));
    return secondAction;
  }

  public static WebElement hoverFirstOption(WebDriver driver) {
    WebElement hoverBtn =
        driver.findElement(By.xpath("//a[@class='dropdown-item' and @href='#hover-me']"));
    return hoverBtn;
  }

  public static WebElement secondLevel1(WebDriver driver) {
    WebElement firstLevelBtn =
        driver.findElement(By.xpath("//a[@tabindex='-1' and @href='#second-level-1']"));
    return firstLevelBtn;
  }

  public static WebElement secondLevel2(WebDriver driver) {
    WebElement secondLevelBtn = driver.findElement(By.xpath("//a[@href='#2nd-level-2']"));
    return secondLevelBtn;
  }
  public static WebElement secondLevel3(WebDriver driver){
    WebElement thirdlevelBtn=driver.findElement(By.xpath("//a[@href='#2nd-level-3']"));
    return thirdlevelBtn;
  }
}
