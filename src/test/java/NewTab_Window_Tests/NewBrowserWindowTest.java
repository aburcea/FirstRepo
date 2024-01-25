package NewTab_Window_Tests;

import Browser.BrowserSetup;
import model.NewTab_Window.NewBrowserWindowMap;
import model.NewTab_Window.NewTab_Window_Map;
import model.NewTab_Window.NewTab_Window_Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewBrowserWindowTest {
    WebDriver driver;

    @BeforeTest
    public void setup() {

        driver = BrowserSetup.createChromeDriver("https://qa-practice.netlify.app/");
    }

    @Test
    public void newBrowserWindowTest(){
        WebElement newTabWindow = NewTab_Window_Map.newTab(driver);
        NewTab_Window_Steps.clickElementsNewTab(newTabWindow);
        WebElement newBrowserWindow= NewBrowserWindowMap.newBrowserWindow(driver);
        WebDriverWait wait=BrowserSetup.createWebDriverWait(driver,2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("browser-window")));
        NewTab_Window_Steps.clickElementsNewTab(newBrowserWindow);
        WebElement newWindowBtn=NewBrowserWindowMap.pressMeBtn(driver);
        NewTab_Window_Steps.clickElementsNewTab(newWindowBtn);

    }

}
