import Browser.BrowserSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoaderTest {
    WebDriver driver;

    @BeforeTest
    public void setup() {

        driver = BrowserSetup.createChromeDriver("https://qa-practice.netlify.app/");
    }

    @Test
    public void LoadTest(){
        WebElement loaderElement=driver.findElement(By.id("loader"));
        loaderElement.click();
        WebDriverWait wait=BrowserSetup.createWebDriverWait(driver,2);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"myDiv\"]")));
    }


}
