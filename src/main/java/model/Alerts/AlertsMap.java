package model.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertsMap {
    public static WebElement alert(WebDriver driver){
        WebElement alertMenuBtn=driver.findElement(By.id("alerts"));
        return alertMenuBtn;
    }
    public static WebElement alertBtn(WebDriver driver){
        WebElement alertBtn=driver.findElement(By.id("alert-btn"));
        return alertBtn;
    }
    public static WebElement confirmBtn(WebDriver driver){
        WebElement confirm=driver.findElement(By.id("confirm-btn"));
        return confirm;

    }

}
