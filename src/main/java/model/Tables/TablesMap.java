package model.Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TablesMap {
  public static WebElement Tables(WebDriver driver) {
    WebElement tablesBtn = driver.findElement(By.xpath("//a[@id='forms' and @href=\"#tables\"]"));
    return tablesBtn;
  }

  public static String table(WebDriver driver) {
    String tableExample = driver.findElement(By.id("peopleTable")).getText();
    return tableExample;
  }

  public static WebElement table2(WebDriver driver) {
    WebElement peopleTable = driver.findElement(By.id("data-table"));
    return peopleTable;
  }

  public static WebElement staticTable(WebDriver driver) {
    WebElement staticTableBtn =
        driver.findElement(By.xpath("//a[@href='/web-table' and text()='Static Table']"));
    return staticTableBtn;
  }

  public static WebElement dynamicTable(WebDriver driver) {
    WebElement dynamicTableBtn =
        driver.findElement(By.xpath("//a[@href='/dynamic-table' and text()='Dynamic Table']"));
    return dynamicTableBtn;
  }

  public static String dynamicTableContent(WebDriver driver) {
    String dTableContent = driver.findElement(By.id("data-table")).getText();
    return dTableContent;
  }
}
