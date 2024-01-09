package model.Buttons.RadioButtons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonsSteps {
  public static void clickRadioButtons(WebElement element) {
    element.click();
  }

  public static void checkRadioBtn(WebDriver driver) {
    if (RadioButtonsMap.radiobtn1(driver).isSelected()) {
      System.out.println("Radio button 1 is selected");
    } else if (RadioButtonsMap.radiobtn2(driver).isSelected()) {
      System.out.println("Radio button 2 is selected");
    } else if (RadioButtonsMap.radiobtn3(driver).isSelected()) {
      System.out.println("Radio button 3 is selected");
    }else{
      System.out.println("No radio button is selected");
    }
  }
}
