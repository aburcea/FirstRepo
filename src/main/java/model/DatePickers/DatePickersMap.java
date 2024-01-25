package model.DatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePickersMap {
  public static String firstdate = "10";
  public static String seconddate = "20";

  public static WebElement datePicker(WebDriver driver) {
    WebElement databtn = driver.findElement(By.id("date-picker"));
    return databtn;
  }

  public static WebElement rangeDatePicker(WebDriver driver) {
    WebElement datePicker = driver.findElement(By.id("range-date-calendar"));
    return datePicker;
  }

  public static WebElement basicDatePicker(WebDriver driver) {
    WebElement basicPicker = driver.findElement(By.id("calendar"));
    return basicPicker;
  }

  public static String firstDateElement(WebDriver driver) {
    String firstDate =
        driver
            .findElement(
                By.xpath(
                    "//div[@class='drp-calendar left']//th[@colspan='5' and contains(@class, 'month')]"))
            .getText();
    return firstDate;
  }

  public static String secondDateElement(WebDriver driver) {
    String secondDate =
        driver
            .findElement(
                By.xpath(
                    "//div[@class='drp-calendar right']//th[@colspan='5' and contains(@class, 'month')]"))
            .getText();
    return secondDate;
  }

  public static WebElement nextArrow(WebDriver driver) {
    WebElement nextBtn = driver.findElement(By.xpath("//th[@class='next available']/span"));
    return nextBtn;
  }

  public static WebElement leftCalender(WebDriver driver) {
    WebElement leftCalendarMenu = driver.findElement(By.xpath("//div[@class='drp-calendar left']"));
    return leftCalendarMenu;
  }

  public static WebElement selectFirstDate(WebDriver driver) {
    WebElement firstDate =
        driver.findElement(
            By.xpath(
                "/html/body/div[2]/div[2]/div[1]/table/tbody//tr/td[contains(text(),"
                    + firstdate
                    + ")]"));
    return firstDate;
  }

  public static WebElement selectSecondDate(WebDriver driver) {
    WebElement firstDate =
        driver.findElement(
            By.xpath(
                "/html/body/div[2]/div[2]/div[1]/table/tbody//tr/td[contains(text(),"
                    + seconddate
                    + ")]"));
    return firstDate;
  }
  public static WebElement applyButton(WebDriver driver){
    WebElement applybtn=driver.findElement(By.xpath("/html/body/div[2]/div[4]/button[2]"));
    return applybtn;
  }
}
