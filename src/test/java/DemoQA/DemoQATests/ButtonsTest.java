package DemoQA.DemoQATests;

import DemoQA.DemoQABase.DemoQABaseTest;
import DemoQA.DemoQAPages.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ButtonsTest extends DemoQABaseTest {

    @BeforeMethod
    public void buttonsTestSetUp() {
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(buttonsURL);
        buttonsPage= new ButtonsPage();

    }

    @Test(priority = 10)
    public void userCanClickOnDoubleClickButton(){
        doubleClickWithJS(buttonsPage.button.get(0));
        Assert.assertTrue(buttonsPage.doubleClickMessage.isDisplayed());

    }

    @Test(priority = 20)
    public void userCanClickRightClickButton(){
        waitForVisibility(buttonsPage.rightClickButton);
        Actions a =new Actions(driver);
        a.moveToElement(buttonsPage.rightClickButton).contextClick().build().perform();
        Assert.assertTrue(buttonsPage.rightClickMessage.isDisplayed());
    }

    @Test(priority = 30)
    public void userCanClickOnClickMeButton(){
        buttonsPage.button.get(2).click();
        Assert.assertTrue(buttonsPage.dynamicClickMessage.isDisplayed());

    }


    @AfterMethod
    public void tearDownButtonsTest() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
