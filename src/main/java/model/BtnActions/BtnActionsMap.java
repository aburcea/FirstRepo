package model.BtnActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BtnActionsMap {
  public static WebElement Btn(WebDriver driver) {
    WebElement btnAction = driver.findElement(By.id("actions"));
    return btnAction;
  }

  public static WebElement doubleClick(WebDriver driver) {
    WebElement doubleClick = driver.findElement(By.id("double-click"));
    return doubleClick;
  }

  public static WebElement doubleClickBtn(WebDriver driver) {
    WebElement doubleClickBtn = driver.findElement(By.id("double-click-btn"));
    return doubleClickBtn;
  }

  public static WebElement scrolling(WebDriver driver) {
    WebElement scrollingBtn = driver.findElement(By.id("scrolling"));
    return scrollingBtn;
  }

  public static WebElement mouseHoverBtn(WebDriver driver) {
    WebElement mouseOver = driver.findElement(By.id("mouse-hover"));
    return mouseOver;
  }
  public static WebElement mouseHover(WebDriver driver){
    WebElement mouseHover=driver.findElement(By.id("button-hover-over"));
    return mouseHover;
  }

  public static WebElement showHide(WebDriver driver) {
    WebElement showHideElement = driver.findElement(By.id("show-hide-elements"));
    return showHideElement;
  }
  public static WebElement showHideBtn(WebDriver driver){
    WebElement showHideBtn=driver.findElement(By.id("showHideBtn"));
    return showHideBtn;
  }

  public static String doubleClickMsg(WebDriver driver) {
    String messageDisplayed = driver.findElement(By.id("double-click-result")).getText();
    return messageDisplayed;
  }
  public static String HoverMsg(WebDriver driver){
    String HoverMsgDisplayed=driver.findElement(By.cssSelector("div.hide")).getText();
    return HoverMsgDisplayed;

  }
  public static String showHideMsg(WebDriver driver){
    String showHideMessage=driver.findElement(By.id("hiddenText")).getText();
    return showHideMessage;
  }


}
