package model.RecoverPassword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RecoverPasswordMap {
    public static WebElement recoverPassword(WebDriver driver){
        WebElement recoverPass=driver.findElement(By.id("recover-password"));
        return recoverPass;
    }
    public static WebElement recoverPasswordEmail(WebDriver driver){
        WebElement recoverPassEmail=driver.findElement(By.id("email"));
        return recoverPassEmail;
    }
    public static WebElement recoverPassBtn(WebDriver driver){
        WebElement recoverBtn=driver.findElement(By.className("btn-primary"));
        return recoverBtn;
    }
    public static String  recoverMessage(WebDriver driver){
        String recoverMsg=driver.findElement(By.id("message")).getText();
        return recoverMsg;
    }

}
