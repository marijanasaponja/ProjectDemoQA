package DemoQA.DemoQATests;

import DemoQA.DemoQABase.DemoQABaseTest;
import DemoQA.DemoQAPages.BrokenLinksPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;

public class BrokenLinksTest extends DemoQABaseTest {

    @BeforeMethod
    public void brokenLinksTestSetUp() {
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(brokenLinksURL);
        brokenLinksPage= new BrokenLinksPage();

    }


    @Test(priority = 10)
    public  void verifyThatImageIsValid() {

        Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete &&" +
                " typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", brokenLinksPage.validImage);

        if (!ImagePresent) {
            System.out.println("Image is not displayed.");
        } else {
            System.out.println("Image is displayed.");
        }
    }

    @Test(priority = 20)
    public  void verifyThatImageIsBroken() {

        Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete &&" +
                " typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", brokenLinksPage.brokenImage);

        if (!ImagePresent) {
            System.out.println("Image is not displayed.");
        } else {
            System.out.println("Image is displayed.");
        }
    }


    @Test(priority = 30)
    public void verifyThatLinkIsValid(){
        brokenLinksPage.clickOnValidLink();
        Assert.assertEquals(driver.getCurrentUrl(), homeURL);

    }

    @Test(priority = 40)
    public void verifyThatLinkIsBroken(){
        brokenLinksPage.clickOnBrokenLink();
        waitForVisibility(brokenLinksPage.errorMessage);

        String expectedURL= "http://the-internet.herokuapp.com/status_codes/500";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
        String expectedMessage= "This page returned a 500 status code.\n" +
                "\n" +
                "For a definition and common list of HTTP status codes, go here";
        Assert.assertEquals(brokenLinksPage.errorMessage.getText(), expectedMessage);
    }


    @AfterMethod
    public void tearDownBrokenImagesTest() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
