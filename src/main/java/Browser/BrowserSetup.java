package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BrowserSetup {
  public static WebDriver createChromeDriver(String url) {
    System.setProperty(
        "webdriver.chrome.driver",
        System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--start-maximized");
    WebDriver driver = new ChromeDriver(options);
    driver.get(url);
    return driver;
  }

  public static WebDriverWait createWebDriverWait(WebDriver driver, long seconds) {
    return new WebDriverWait(driver, Duration.ofSeconds(seconds));
  }
}
// TO DO
//  public  void afterTest() {
//    driver.quit();
//  }
// }
