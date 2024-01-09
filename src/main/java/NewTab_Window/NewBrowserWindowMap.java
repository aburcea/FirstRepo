package NewTab_Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewBrowserWindowMap {
    public static WebElement newBrowserWindow(WebDriver driver){
        WebElement newBrowserWindow=driver.findElement(By.id("browser-window"));
        return newBrowserWindow;
    }
    public static WebElement pressMeBtn(WebDriver driver){
        WebElement pressMeBtn=driver.findElement(By.id("newWindowBtn"));
        return pressMeBtn;
    }
}
