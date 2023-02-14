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

public class TextBoxTest extends DemoQABaseTest {

    @BeforeMethod
    public void textBoxTestSetUp() {
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(textBoxURL);
        homePage = new HomePage();
        sidebarPage = new SidebarPage();
        textBoxPage = new TextBoxPage();

        isDisplayed(textBoxPage.emptyOutput);
    }


    @Test(priority = 10)
    public void userCanCreateTextBoxWithAllInputs() {
      textBoxPage.insertFullName("Marijana Saponja");
      textBoxPage.insertEmail("marijana.saponja@gmail.com");
      textBoxPage.insertCurrentAddress("Oslobodjenja 35");
      textBoxPage.insertPermanentAddress("Petra Djurkovica 32");
      scrollToElement(textBoxPage.submitButton);
      waitForClickability(textBoxPage.submitButton);
      textBoxPage.clickOnSubmitButton();

     Assert.assertTrue(textBoxPage.output.isDisplayed());
     Assert.assertTrue(textBoxPage.output.getText().contains("Name:Marijana Saponja"));
     Assert.assertTrue(textBoxPage.output.getText().contains("Email:marijana.saponja@gmail.com"));
     Assert.assertTrue(textBoxPage.output.getText().contains("Current Address :Oslobodjenja 35"));
     Assert.assertTrue(textBoxPage.output.getText().contains("Permananet Address :Petra Djurkovica 32"));

    }

    @Test(priority = 20)
    public void userCanCreateTextBoxWithFullName() {
        textBoxPage.insertFullName("Marijana Saponja");
        scrollToElement(textBoxPage.submitButton);
        waitForClickability(textBoxPage.submitButton);
        textBoxPage.clickOnSubmitButton();

        Assert.assertTrue(textBoxPage.output.isDisplayed());
        Assert.assertTrue(textBoxPage.output.getText().contains("Name:Marijana Saponja"));

    }

    @Test(priority = 30)
    public void userCanCreateTextBoxWithEmail() {
        textBoxPage.insertEmail("marijana.saponja@gmail.com");
        scrollToElement(textBoxPage.submitButton);
        waitForClickability(textBoxPage.submitButton);
        textBoxPage.clickOnSubmitButton();

        Assert.assertTrue(textBoxPage.output.isDisplayed());
        Assert.assertTrue(textBoxPage.output.getText().contains("Email:marijana.saponja@gmail.com"));

    }

    @Test(priority = 40)
    public void userCanCreateTextBoxWithCurrentAddress() {
        textBoxPage.insertCurrentAddress("Oslobodjenja 35");
        scrollToElement(textBoxPage.submitButton);
        waitForClickability(textBoxPage.submitButton);
        textBoxPage.clickOnSubmitButton();

        Assert.assertTrue(textBoxPage.output.isDisplayed());
        Assert.assertTrue(textBoxPage.output.getText().contains("Current Address :Oslobodjenja 35"));

    }

    @Test(priority = 50)
    public void userCanCreateTextBoxWithPermanentAddress() {
        textBoxPage.insertPermanentAddress("Petra Djurkovica 32");
        scrollToElement(textBoxPage.submitButton);
        waitForClickability(textBoxPage.submitButton);
        textBoxPage.clickOnSubmitButton();

        Assert.assertTrue(textBoxPage.output.isDisplayed());
        Assert.assertTrue(textBoxPage.output.getText().contains("Permananet Address :Petra Djurkovica 32"));

    }






    @AfterMethod
    public void tearDownTextBoxTest() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }


}
