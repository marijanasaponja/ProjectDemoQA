package DemoQA.DemoQATests;

import DemoQA.DemoQABase.DemoQABaseTest;
import DemoQA.DemoQAPages.LinksPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class LinksTest extends DemoQABaseTest {

    @BeforeMethod
    public void linksTestSetUp() {
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(linksURL);
        linksPage= new LinksPage();
    }


    @Test(priority = 10)
    public void userCanClickOnHomeLink(){
        linksPage.clickOnHome();
        String originalWindow= driver.getWindowHandle();
        wdwait.until(numberOfWindowsToBe(2));
        for(String windowHandle: driver.getWindowHandles()){
            if(!originalWindow.contentEquals(windowHandle)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        Assert.assertEquals(driver.getCurrentUrl(), homeURL);
    }

    @Test(priority = 20)
    public void userCanClickOnHomeixyLiLink(){
        linksPage.clickOnHomen63R7Link();
        String originalWindow= driver.getWindowHandle();
        wdwait.until(numberOfWindowsToBe(2));
        for(String windowHandle: driver.getWindowHandles()){
            if(!originalWindow.contentEquals(windowHandle)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        Assert.assertEquals(driver.getCurrentUrl(), homeURL);
    }

    @Test(priority = 30)
    public void userCanSendApiCallWithCreatedLink(){
        linksPage.clickOnCreatedLink();
        String expectedMessage= "Link has responded with staus 201 and status text Created";
        waitForVisibility(linksPage.linkResponse);
        scrollToElement(linksPage.linkResponse);

        Assert.assertEquals(linksPage.linkResponse.getText(), expectedMessage);
    }

    @Test(priority = 40)
    public void userCanSendApiCallWithNoContentLink(){
        linksPage.clickOnNoContentLink();
        String expectedMessage= "Link has responded with staus 204 and status text No Content";
        waitForVisibility(linksPage.linkResponse);
        scrollToElement(linksPage.linkResponse);

        Assert.assertEquals(linksPage.linkResponse.getText(), expectedMessage);
    }

    @Test(priority = 50)
    public void userCanSendApiCallWithMovedLink(){
        linksPage.clickOnMovedLink();
        String expectedMessage= "Link has responded with staus 301 and status text Moved Permanently";
        waitForVisibility(linksPage.linkResponse);
        scrollToElement(linksPage.linkResponse);

        Assert.assertEquals(linksPage.linkResponse.getText(), expectedMessage);
    }

    @Test(priority = 60)
    public void userCanSendApiCallWithBadRequestLink(){
        linksPage.clickOnBadRequestLink();
        String expectedMessage= "Link has responded with staus 400 and status text Bad Request";
        waitForVisibility(linksPage.linkResponse);
        scrollToElement(linksPage.linkResponse);

        Assert.assertEquals(linksPage.linkResponse.getText(), expectedMessage);
    }

    @Test(priority = 70)
    public void userCanSendApiCallWithUnauthorizedLink(){
        linksPage.clickOnunauthorizedLink();
        String expectedMessage= "Link has responded with staus 401 and status text Unauthorized";
        waitForVisibility(linksPage.linkResponse);
        scrollToElement(linksPage.linkResponse);

        Assert.assertEquals(linksPage.linkResponse.getText(), expectedMessage);
    }

    @Test(priority = 80)
    public void userCanSendApiCallWithForbiddenLink(){
        linksPage.clickOnForrbidenLink();
        String expectedMessage= "Link has responded with staus 403 and status text Forbidden";
        waitForVisibility(linksPage.linkResponse);
        scrollToElement(linksPage.linkResponse);

        Assert.assertEquals(linksPage.linkResponse.getText(), expectedMessage);
    }

    @Test(priority = 90)
    public void userCanSendApiCallWithNotFoundLink(){
        linksPage.clickOnNotFoundLink();
        String expectedMessage= "Link has responded with staus 404 and status text Not Found";
        waitForVisibility(linksPage.linkResponse);
        scrollToElement(linksPage.linkResponse);

        Assert.assertEquals(linksPage.linkResponse.getText(), expectedMessage);
    }


    @AfterMethod
    public void tearDownLinksTest() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
