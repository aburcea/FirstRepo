package FileUploadTests;

import Browser.BrowserSetup;
import model.FileUpload.FileUploadMap;
import model.FileUpload.FileUploadSteps;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploadTest {
    String filePath="C:\\Users\\Skorpi\\Desktop\\test.txt";
    WebDriver driver;

    @BeforeTest
    public void setup() {

        driver = BrowserSetup.createChromeDriver("https://qa-practice.netlify.app/");
    }
    @Test
    public void upload(){
        FileUploadSteps.elementClick(FileUploadMap.fileUploadMenu(driver));
        FileUploadMap.chooseFile(driver).sendKeys(filePath);
        FileUploadSteps.elementClick(FileUploadMap.submitFile(driver));
    }

}
