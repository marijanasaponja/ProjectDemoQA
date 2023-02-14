package DemoQA.DemoQATests;

import DemoQA.DemoQABase.DemoQABaseTest;
import DemoQA.DemoQAPages.UploadAndDownloadPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;


public class UploadAndDownloadTest extends DemoQABaseTest {

    @BeforeMethod
    public void uploadAndDownloadTestSetUp() {
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(uploadAndDownloadURL);
        uploadAndDownloadPage= new UploadAndDownloadPage();

    }


    @Test(priority = 10)
    public void userCanDownloadImage(){
        waitForVisibility(uploadAndDownloadPage.downloadButton);
        uploadAndDownloadPage.clickOnDownloadButton();
         Assert.assertTrue(uploadAndDownloadPage.downloadLink.isDisplayed());
    }

    @Test(priority = 20)
    public void userCanUploadImage(){
        waitForVisibility(uploadAndDownloadPage.uploadFileButton);
        waitForClickability(uploadAndDownloadPage.uploadFileButton);
        uploadAndDownloadPage.uploadFile();
        String expectedMessage= "C:\\fakepath\\nature.jpg";
        Assert.assertEquals(uploadAndDownloadPage.uploadedFile.getText(), expectedMessage);
    }



    @AfterMethod
    public void tearDownUploadAndDownloadTest() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
