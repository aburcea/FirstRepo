package model.Forms.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginMap {


  public static WebElement login(WebDriver driver) {
    WebElement login = driver.findElement(By.id("login"));
    return login;
  }

  public static WebElement email(WebDriver driver) {
    WebElement emailBox = driver.findElement(By.id("email"));
    return emailBox;
  }

  public static WebElement password(WebDriver driver) {
    WebElement passwordBox = driver.findElement(By.id("password"));
    return passwordBox;
  }

  public static WebElement submit(WebDriver driver) {
    WebElement submitBtn = driver.findElement(By.id("submitLoginBtn"));
    return submitBtn;
  }

  public static WebElement addToCart(WebDriver driver) {
    WebElement addToCartBtn = driver.findElement(By.className("shop-item-button"));
    return addToCartBtn;
  }

  public static WebElement proceedToCheckout(WebDriver driver) {
    WebElement proceedToCheckoutBtn = driver.findElement(By.className("btn-purchase"));
    return proceedToCheckoutBtn;
  }

  public static WebElement phoneNumberSD(WebDriver driver) {
    WebElement phoneNumberBox = driver.findElement(By.id("phone"));
    return phoneNumberBox;
  }

  public static WebElement StreetSD(WebDriver driver) {
    WebElement streetBox = driver.findElement(By.xpath("//*[@id=\"shippingForm\"]/div[2]/input"));
    return streetBox;
  }

  public static WebElement CitySD(WebDriver driver) {
    WebElement cityBox = driver.findElement(By.xpath("//*[@id=\"shippingForm\"]/div[3]/input"));
    return cityBox;
  }

  public static WebElement dropDownSD(WebDriver driver) {
    WebElement dropDown = driver.findElement(By.id("countries_dropdown_menu"));
    return dropDown;
  }

  public static WebElement submitOrderSD(WebDriver driver) {
    WebElement submitOrderBtn = driver.findElement(By.id("submitOrderBtn"));
    return submitOrderBtn;
  }
}
