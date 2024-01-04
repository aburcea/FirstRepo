package model.Buttons.RadioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonsMap {
  public static WebElement radio(WebDriver driver) {
    WebElement radiobtn = driver.findElement(By.id("radio-buttons"));
    return radiobtn;
  }
  public static WebElement radiobtn1(WebDriver driver){
    WebElement radiobtn1=driver.findElement(By.id("radio-button1"));
    return radiobtn1;
  }
  public static WebElement radiobtn2(WebDriver driver){
    WebElement radiobtn2=driver.findElement(By.id("radio-button2"));
    return radiobtn2;
  }
  public static WebElement radiobtn3(WebDriver driver){
    WebElement radiobtn3=driver.findElement(By.id("radio-button3"));
    return radiobtn3;
  }
  public static WebElement radiobtn4(WebDriver driver){
    WebElement radiobtn4=driver.findElement(By.id("radio-button4"));
    return radiobtn4;
  }
}
