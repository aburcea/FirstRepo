package DatePickersTests;

import Browser.BrowserSetup;
import model.DatePickers.DatePickersMap;
import model.DatePickers.DatePickersSteps;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePickTest {
  WebDriver driver;
  private final String expectedDate = "Jan 2024";
  public final String date="20";

  @BeforeTest
  public void setup() {

    driver = BrowserSetup.createChromeDriver("https://qa-practice.netlify.app/");
  }

  @Test
  public void dateTest() {
    DatePickersSteps.elementClick(DatePickersMap.datePicker(driver));
    DatePickersSteps.elementClick(DatePickersMap.rangeDatePicker(driver));
    while (true) {
      DatePickersMap.firstDateElement(driver);
      if (DatePickersMap.firstDateElement(driver).equals(expectedDate)) {
        break;
      } else {
        DatePickersMap.nextArrow(driver).click();
      }
    }
    System.out.println(DatePickersMap.firstDateElement(driver));
    DatePickersSteps.elementClick(DatePickersMap.selectFirstDate(driver));
    DatePickersSteps.elementClick(DatePickersMap.selectSecondDate(driver));
    DatePickersSteps.elementClick(DatePickersMap.applyButton(driver));
  }
}
