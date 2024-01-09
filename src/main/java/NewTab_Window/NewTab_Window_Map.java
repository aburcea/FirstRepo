package NewTab_Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewTab_Window_Map {
  public static WebElement newTab(WebDriver driver) {
    WebElement newTabDropDown =
        driver.findElement(
            By.xpath(
                "//a[@id='buttons' and text()='New Tab / Window' and @class='dropdown-toggle' and @data-toggle='collapse']"));
    return newTabDropDown;
  }
  public static WebElement newBrowserTab(WebDriver driver){
    WebElement newTab=driver.findElement(By.id("browser-tab"));
    return newTab;
  }
  public static WebElement pressMeBtn(WebDriver driver){
    WebElement pressBtn=driver.findElement(By.id("newTabBtn"));
    return pressBtn;
  }
  public static WebElement table(WebDriver driver){
    WebElement table=driver.findElement(By.id("peopleTable"));
    return table;

  }
  public static List<WebElement> elementsTD(WebDriver driver){
   return driver.findElements(By.tagName("td"));
  }
  public static List<WebElement> elementsTR(WebDriver driver){
    return driver.findElements(By.tagName("tr"));
  }

}
