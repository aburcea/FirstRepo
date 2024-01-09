package ButtonsTests;

import Browser.BrowserSetup;
import model.Buttons.ButtonsSteps;
import model.Buttons.Checkboxes.CheckboxesMap;
import model.Buttons.RadioButtons.RadioButtonsMap;
import model.Buttons.RadioButtons.RadioButtonsSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RadioTest {
    WebDriver driver;

    @BeforeTest
    public void setup() {

        driver = BrowserSetup.createChromeDriver("https://qa-practice.netlify.app/");
    }
    @Test
    public void RadioButtonsTest(){
        ButtonsSteps.clickButtons(ButtonsSteps.buttons(driver));
        WebDriverWait wait = BrowserSetup.createWebDriverWait(driver, 2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("radio-buttons")));
        WebElement radio= RadioButtonsMap.radio(driver);
        RadioButtonsSteps.clickRadioButtons(radio);
        WebElement radio1=RadioButtonsMap.radiobtn1(driver);
        RadioButtonsSteps.clickRadioButtons(radio1);
        WebElement radio2=RadioButtonsMap.radiobtn2(driver);
        RadioButtonsSteps.clickRadioButtons(radio2);
        RadioButtonsSteps.checkRadioBtn(driver);
    }
}
