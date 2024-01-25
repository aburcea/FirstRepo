package model.FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadMap {
  public static WebElement fileUploadMenu(WebDriver driver) {
    WebElement fileUpload = driver.findElement(By.id("file-upload-item"));
    return fileUpload;
  }

  public static WebElement chooseFile(WebDriver driver) {
    WebElement chooseFileBtn = driver.findElement(By.id("file_upload"));
    return chooseFileBtn;
  }

  public static WebElement submitFile(WebDriver driver) {
    WebElement submitBtn =
        driver.findElement(
            By.xpath("//button[@class='btn btn-primary' and normalize-space()='Submit']"));
    return submitBtn;
  }

}
