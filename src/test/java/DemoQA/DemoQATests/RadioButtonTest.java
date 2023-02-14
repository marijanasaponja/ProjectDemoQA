package DemoQA.DemoQATests;

import DemoQA.DemoQABase.DemoQABaseTest;
import DemoQA.DemoQAPages.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class RadioButtonTest extends DemoQABaseTest {

    @BeforeMethod
    public void radioButtonTestSetUp() {
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(radioButtonURL);
        radioButtonPage=new RadioButtonPage();
    }


    @Test(priority = 10)
    public void userCanClickOnYes(){
        radioButtonPage.clickOnYesRadioButton();
        Assert.assertTrue(radioButtonPage.message.get(0).isDisplayed());
    }

    @Test(priority = 20)
    public void userCanClickOnImpressiveRadioButton(){
        radioButtonPage.clickOnImpressiveRadioButton();
        Assert.assertTrue(radioButtonPage.message.get(0).isDisplayed());

    }

    @Test(priority = 30)
    public void userCanNotClickOnNoRadioButton(){
        radioButtonPage.clickOnNoRadioButton();
        String actualMousePointer = radioButtonPage.noRadioButton.getCssValue("cursor");
        Assert.assertEquals(actualMousePointer, "not-allowed");

    }


    @AfterMethod
    public void tearDownRadioButtonTest() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }


}
