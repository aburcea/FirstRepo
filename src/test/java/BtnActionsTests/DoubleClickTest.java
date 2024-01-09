package BtnActionsTests;

import Browser.BrowserSetup;
import model.BtnActions.BtnActionsMap;
import model.BtnActions.BtnActionsSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DoubleClickTest {
  WebDriver driver;

  @BeforeTest
  public void setup() {

    driver = BrowserSetup.createChromeDriver("https://qa-practice.netlify.app/");
  }
  @Test
  public void DoubleClickMeTest(){
      WebElement BtnActions= BtnActionsMap.Btn(driver);
      BtnActionsSteps.btnClick(BtnActions);
      WebElement DoubleClickBtn=BtnActionsMap.doubleClick(driver);
      BtnActionsSteps.btnClick(DoubleClickBtn);
      Actions actions=new Actions(driver);
      actions.doubleClick(BtnActionsMap.doubleClickBtn(driver)).perform();
      String message="Congrats, you double clicked!";
     assert BtnActionsMap.doubleClickMsg(driver).equals(message):"Mesajul nu este afisat, dublu click nu s-a intamplat corect";


  }
}
