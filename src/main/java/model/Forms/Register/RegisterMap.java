package model.Forms.Register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterMap {
  public static WebElement register(WebDriver driver) {
    WebElement register = driver.findElement(By.id("register"));
    return register;
  }

  public static WebElement firstNameRF(WebDriver driver) {
    WebElement firstName = driver.findElement(By.id("firstName"));
    return firstName;
  }

  public static WebElement lastNameRF(WebDriver driver) {
    WebElement lastName = driver.findElement(By.id("lastName"));
    return lastName;
  }

  public static WebElement phoneNumberRF(WebDriver driver) {
    WebElement phoneNumber = driver.findElement(By.id("phone"));
    return phoneNumber;
  }

  public static WebElement dropdownRF(WebDriver driver) {
    WebElement dropdown = driver.findElement(By.id("countries_dropdown_menu"));
    return dropdown;
  }

  public static WebElement emailAddressRF(WebDriver driver) {
    WebElement emailAddress = driver.findElement(By.id("emailAddress"));
    return emailAddress;
  }

  public static WebElement passwordRF(WebDriver driver) {
    WebElement password = driver.findElement(By.id("password"));
    return password;
  }

  public static WebElement checkboxRF(WebDriver driver) {
    WebElement checkBox = driver.findElement(By.id("exampleCheck1"));
    return checkBox;
  }

  public static WebElement registerBtnRF(WebDriver driver) {
    WebElement registerBtn = driver.findElement(By.className("btn-primary"));
    return registerBtn;
  }
}
