package BtnActionsTests;

import Browser.BrowserSetup;
import model.BtnActions.BtnActionsMap;
import model.BtnActions.BtnActionsSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class MouseHoverTest {
    WebDriver driver;

    @BeforeTest
    public void setup() {

        driver = BrowserSetup.createChromeDriver("https://qa-practice.netlify.app/");
    }
    @Test
    public void mouseOverTest(){
        WebElement BtnActions= BtnActionsMap.Btn(driver);
        BtnActionsSteps.btnClick(BtnActions);
        WebElement mouseHover=BtnActionsMap.mouseHoverBtn(driver);
        WebDriverWait wait = BrowserSetup.createWebDriverWait(driver, 2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mouse-hover")));
        BtnActionsSteps.btnClick(mouseHover);
        Actions actions = new Actions(driver);
        WebElement hoverElement=BtnActionsMap.mouseHover(driver);
        actions.moveToElement(hoverElement).perform();
        String hoverMsg="I am shown when someone hovers over the text above.";
        assert BtnActionsMap.HoverMsg(driver).equals(hoverMsg):"Mesajul a aparut dupa Hover";



    }

}
