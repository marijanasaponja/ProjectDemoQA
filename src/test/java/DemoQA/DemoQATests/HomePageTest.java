package DemoQA.DemoQATests;

import DemoQA.DemoQABase.DemoQABaseTest;
import DemoQA.DemoQAPages.HomePage;
import DemoQA.DemoQAPages.SidebarPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomePageTest extends DemoQABaseTest {

    @BeforeMethod
    public void homePageTestSetUp() {
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(homeURL);
        homePage = new HomePage();
        sidebarPage = new SidebarPage();
    }

        @Test(priority = 10)
        public void userCanClickOnElements() {
            scrollToElement(homePage.elements.get(0));
            homePage.clickOnElements();

            String expectedURL = excelReader.getStringData("URL", 1,1);
            Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
            Assert.assertTrue(sidebarPage.sideBarElements.get(0).getText().equals("Text Box"));
            Assert.assertTrue(sidebarPage.sideBarElements.get(1).getText().equals("Check Box"));
        }

    @Test(priority = 20)
    public void userCanClickOnForms() {
        scrollToElement(homePage.elements.get(1));
        homePage.clickOnForms();

        String expectedURL = excelReader.getStringData("URL", 1,2);
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
        Assert.assertTrue(sidebarPage.sideBarElements.get(9).getText().equals("Practice Form"));

    }

    @Test(priority = 30)
    public void userCanClickOnAlerts() {
        scrollToElement(homePage.elements.get(2));
        homePage.clickOnAlerts();

        String expectedURL = excelReader.getStringData("URL", 1,3);
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
        Assert.assertTrue(sidebarPage.sideBarElements.get(10).getText().equals("Browser Windows"));
        Assert.assertTrue(sidebarPage.sideBarElements.get(11).getText().equals("Alerts"));
    }

    @Test(priority = 40)
    public void userCanClickOnWidgets() {
        scrollToElement(homePage.elements.get(3));
        homePage.clickOnWidgets();

        String expectedURL = excelReader.getStringData("URL", 1,4);
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
        Assert.assertTrue(sidebarPage.sideBarElements.get(15).getText().equals("Accordian"));
        Assert.assertTrue(sidebarPage.sideBarElements.get(16).getText().equals("Auto Complete"));
    }

    @Test(priority = 50)
    public void userCanClickOnInteractions() {
        scrollToElement(homePage.elements.get(4));
        homePage.clickOnInteractions();

        String expectedURL = excelReader.getStringData("URL", 1,5);
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
        Assert.assertTrue(sidebarPage.sideBarElements.get(24).getText().equals("Sortable"));
    }

    @Test(priority = 60)
    public void userCanClickOnBookStore() {
        scrollToElement(homePage.elements.get(5));
        homePage.clickOnBookStore();

        String expectedURL = excelReader.getStringData("URL", 1,6);
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
        Assert.assertTrue(sidebarPage.sideBarElements.get(29).getText().equals("Login"));
    }


    @AfterMethod
    public void tearDownHomePageTest() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }

}
