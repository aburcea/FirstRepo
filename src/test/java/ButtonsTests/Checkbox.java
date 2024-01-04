package ButtonsTests;

import Browser.BrowserSetup;
import model.Buttons.ButtonsSteps;
import model.Buttons.Checkboxes.CheckboxesMap;
import model.Buttons.Checkboxes.CheckboxesSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Checkbox {
  WebDriver driver;

  @BeforeTest
  public void setup() {

    driver = BrowserSetup.createChromeDriver("https://qa-practice.netlify.app/");
  }

  @Test
  public void CheckBoxTest() {
    WebDriverWait wait = BrowserSetup.createWebDriverWait(driver, 2);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("buttons")));
    ButtonsSteps.clickButtons(ButtonsSteps.buttons(driver));
    WebElement buttons = CheckboxesMap.checkboxes(driver);
    CheckboxesSteps.clickCheckboxes(buttons);
    WebElement check1 = CheckboxesMap.checkbox1(driver);
    CheckboxesSteps.clickCheck1(check1);
    WebElement check2 = CheckboxesMap.checkbox2(driver);
    CheckboxesSteps.clickCheck2(check2);
    WebElement check3 = CheckboxesMap.checkbox3(driver);
    CheckboxesSteps.clickCheck3(check3);
    WebElement reset = CheckboxesMap.resetBtn(driver);
    CheckboxesSteps.clickReset(reset);
  }
}
