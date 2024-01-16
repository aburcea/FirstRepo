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
}
