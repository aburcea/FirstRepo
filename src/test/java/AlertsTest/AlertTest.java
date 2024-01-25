package AlertsTest;

import Browser.BrowserSetup;
import model.Alerts.AlertsMap;
import model.Alerts.AlertsSteps;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertTest {
    WebDriver driver;

    @Test
    public void alertTest(){
        driver = BrowserSetup.createChromeDriver("https://qa-practice.netlify.app/");
        AlertsSteps.alertCLick(AlertsMap.alert(driver));
        AlertsSteps.alertCLick(AlertsMap.alertBtn(driver));
        Alert alert=driver.switchTo().alert();
        String alertText=alert.getText();
        System.out.println("Text from alert box is:-> "+ alertText);
        alert.accept();
    }
    @Test
    public void confirmTest(){
        driver = BrowserSetup.createChromeDriver("https://qa-practice.netlify.app/");
        AlertsSteps.alertCLick(AlertsMap.alert(driver));
        AlertsSteps.alertCLick(AlertsMap.confirmBtn(driver));
        Alert alert=driver.switchTo().alert();
        alert.accept();


    }
}
