package DemoQA.DemoQATests;

import DemoQA.DemoQABase.DemoQABaseTest;
import DemoQA.DemoQAPages.HomePage;
import DemoQA.DemoQAPages.SidebarPage;
import DemoQA.DemoQAPages.TextBoxPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ElementsTest extends DemoQABaseTest {

    @BeforeMethod
    public void elementsSetUp() {
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(homeURL);
        homePage = new HomePage();
        sidebarPage = new SidebarPage();
        textBoxPage = new TextBoxPage();
    }


    @Test(priority = 10)
    public void userCanClickOnTextBox() {
        scrollToElement(homePage.elements.get(0));
        homePage.clickOnElements();
        sidebarPage.sideBarElements.get(0).click();

        Assert.assertEquals(driver.getCurrentUrl(), textBoxURL);
        Assert.assertTrue(textBoxPage.fullName.isDisplayed());
        Assert.assertTrue(textBoxPage.email.isDisplayed());

    }

    @Test(priority = 20)
    public void userCanClickOnCheckBox() {
        scrollToElement(homePage.elements.get(0));
        homePage.clickOnElements();
        sidebarPage.sideBarElements.get(1).click();

        Assert.assertEquals(driver.getCurrentUrl(), checkBoxURL);

    }

    @Test(priority = 30)
    public void userCanClickOnRadioButton() {
        scrollToElement(homePage.elements.get(0));
        homePage.clickOnElements();
        sidebarPage.sideBarElements.get(2).click();

        Assert.assertEquals(driver.getCurrentUrl(), radioButtonURL);

    }

    @Test(priority = 40)
    public void userCanClickOnWebTables() {
        scrollToElement(homePage.elements.get(0));
        homePage.clickOnElements();
        sidebarPage.sideBarElements.get(3).click();

        Assert.assertEquals(driver.getCurrentUrl(), webTablesURL);

    }

    @Test(priority = 50)
    public void userCanClickOnButtons() {
        scrollToElement(homePage.elements.get(0));
        homePage.clickOnElements();
        sidebarPage.sideBarElements.get(4).click();

        Assert.assertEquals(driver.getCurrentUrl(), buttonsURL);

    }

    @Test(priority = 60)
    public void userCanClickOnLinks() {
        scrollToElement(homePage.elements.get(0));
        homePage.clickOnElements();
        scrollToElement(sidebarPage.sideBarElements.get(5));
        sidebarPage.sideBarElements.get(5).click();

        Assert.assertEquals(driver.getCurrentUrl(), linksURL);

    }

    @Test(priority = 70)
    public void userCanClickOnBrokenLinksAndImages() {
        scrollToElement(homePage.elements.get(0));
        homePage.clickOnElements();
        scrollToElement(sidebarPage.sideBarElements.get(6));
        sidebarPage.sideBarElements.get(6).click();

        Assert.assertEquals(driver.getCurrentUrl(), brokenLinksURL);

    }

    @Test(priority = 80)
    public void userCanClickOnUploadAndDownload() {
        scrollToElement(homePage.elements.get(0));
        homePage.clickOnElements();
        scrollToElement(sidebarPage.sideBarElements.get(7));
        sidebarPage.sideBarElements.get(7).click();

        Assert.assertEquals(driver.getCurrentUrl(), uploadAndDownloadURL);

    }

    @Test(priority = 90)
    public void userCanClickOnDynamicProperties() {
        scrollToElement(homePage.elements.get(0));
        homePage.clickOnElements();
        scrollToElement(sidebarPage.sideBarElements.get(8));
        sidebarPage.sideBarElements.get(8).click();

        Assert.assertEquals(driver.getCurrentUrl(), dynamicPropertiesURL);

    }


    @AfterMethod
    public void tearDownElementsTest() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
