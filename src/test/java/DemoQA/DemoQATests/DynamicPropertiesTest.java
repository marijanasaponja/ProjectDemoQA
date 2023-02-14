package DemoQA.DemoQATests;

import DemoQA.DemoQABase.DemoQABaseTest;
import DemoQA.DemoQAPages.DynamicPropertiesPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class DynamicPropertiesTest extends DemoQABaseTest {

    @BeforeMethod
    public void dynamicPropertiesTestSetUp() {
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(dynamicPropertiesURL);
        dynamicPropertiesPage= new DynamicPropertiesPage();
    }


    @Test(priority = 10)
    public void verifyThatEnableAfterButtonWillBeEnabledAfterFiveSeconds() throws InterruptedException {
        Thread.sleep(5000);
       Assert.assertTrue(dynamicPropertiesPage.enableAfterButton.isDisplayed());
    }

    @Test(priority = 20)
    public void verifyThatColorChangeButtonChangeColorAfterFiveSeconds() throws InterruptedException {
        String beforeColor = dynamicPropertiesPage.colorChangeButton.getCssValue("color");
        String whiteColor="rgba(255, 255, 255, 1)";
        Assert.assertEquals(beforeColor, whiteColor);

        Thread.sleep(5000);
        String afterColor = dynamicPropertiesPage.colorChangeButton.getCssValue("color");
        String redColor="rgba(220, 53, 69, 1)";
        Assert.assertEquals(afterColor,redColor);
    }

    @Test(priority = 30)
    public void verifyThatEnableAfterButtonWillBeVisibleAfterFiveSeconds() throws InterruptedException {
        Assert.assertFalse(isDisplayed(dynamicPropertiesPage.visibleAfterButton));
        Thread.sleep(5000);
        Assert.assertTrue(dynamicPropertiesPage.visibleAfterButton.isDisplayed());
    }



    @AfterMethod
    public void tearDownDynamicPropertiesTest() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
