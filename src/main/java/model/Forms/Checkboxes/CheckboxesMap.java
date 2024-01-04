package model.Forms.Checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxesMap {
    public static WebElement checkboxes(WebDriver driver){
        WebElement checkbox=driver.findElement(By.id("checkboxes"));
        return checkbox;
    }
    public static WebElement checkbox1(WebDriver driver){
        WebElement checkbox1=driver.findElement(By.id("checkbox1"));
        return checkbox1;
    }
    public static WebElement checkbox2(WebDriver driver){
        WebElement checkbox2=driver.findElement(By.id("checkbox2"));
        return checkbox2;
    }
    public static WebElement checkbox3(WebDriver driver){
        WebElement checkbox3=driver.findElement(By.id("checkbox3"));
        return checkbox3;
    }
    public static WebElement resetBtn(WebDriver driver){
        WebElement reset=driver.findElement(By.className("btn-primary"));
        return reset;
    }

}
