package DemoQA.DemoQATests;

import DemoQA.DemoQABase.DemoQABaseTest;
import DemoQA.DemoQAPages.WebTablesPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebTablesTest extends DemoQABaseTest {

    @BeforeMethod
    public void webTablesTestSetUp() {
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(webTablesURL);
        webTablesPage= new WebTablesPage();
    }

    @Test(priority = 10)
    public void verifyThatTableHeaderIsDisplayed(){

        Assert.assertEquals(webTablesPage.header.get(0).getText(), "First Name");
        Assert.assertEquals(webTablesPage.header.get(1).getText(), "Last Name");
        Assert.assertEquals(webTablesPage.header.get(2).getText(), "Age");
        Assert.assertEquals(webTablesPage.header.get(3).getText(), "Email");
        Assert.assertEquals(webTablesPage.header.get(4).getText(), "Salary");
        Assert.assertEquals(webTablesPage.header.get(5).getText(), "Department");

    }

    @Test(priority = 20)
    public void verifyUserCanAddNewTableRow(){
     webTablesPage.clickOnAddButton();
     webTablesPage.insertFirstName("Pera");
     webTablesPage.insertLastName("Peric");
     webTablesPage.insertEmail("p.p@example.com");
     webTablesPage.insertAge("30");
     webTablesPage.insertSalary("85000");
     webTablesPage.insertDepartment("Finance");
     webTablesPage.clickOnSubmitButton();

     String expectedText= "Pera\n" +
        "Peric\n" +
        "30\n" +
        "p.p@example.com\n" +
        "85000\n" +
        "Finance";
        Assert.assertEquals(webTablesPage.entireRow.get(3).getText(), expectedText);
    }

    @Test(priority = 30)
    public void verifyUserCanUpdateFullName(){
        webTablesPage.update.get(0).click();
        webTablesPage.insertFirstName("Pera");
        webTablesPage.clickOnSubmitButton();

        String expectedText= "Pera\n" +
                "Vega\n" +
                "39\n" +
                "cierra@example.com\n" +
                "10000\n" +
                "Insurance";
        Assert.assertEquals(webTablesPage.entireRow.get(0).getText(), expectedText);
    }

    @Test(priority = 40)
    public void verifyUserCanUpdateLastName(){
        webTablesPage.update.get(0).click();
        webTablesPage.insertLastName("Peric");
        webTablesPage.clickOnSubmitButton();

        String expectedText= "Cierra\n" +
                "Peric\n" +
                "39\n" +
                "cierra@example.com\n" +
                "10000\n" +
                "Insurance";
        Assert.assertEquals(webTablesPage.entireRow.get(0).getText(), expectedText);
    }

    @Test(priority = 50)
    public void verifyUserCanUpdateAge(){
        webTablesPage.update.get(0).click();
        webTablesPage.insertAge("40");
        webTablesPage.clickOnSubmitButton();

        String expectedText= "Cierra\n" +
                "Vega\n" +
                "40\n" +
                "cierra@example.com\n" +
                "10000\n" +
                "Insurance";
        Assert.assertEquals(webTablesPage.entireRow.get(0).getText(), expectedText);
    }

    @Test(priority = 60)
    public void verifyUserCanUpdateEmail(){
        webTablesPage.update.get(0).click();
        webTablesPage.insertEmail("cierra39@example.com");
        webTablesPage.clickOnSubmitButton();

        String expectedText= "Cierra\n" +
                "Vega\n" +
                "39\n" +
                "cierra39@example.com\n" +
                "10000\n" +
                "Insurance";
        Assert.assertEquals(webTablesPage.entireRow.get(0).getText(), expectedText);
    }

    @Test(priority = 70)
    public void verifyUserCanUpdateSalaryAmount(){
        webTablesPage.update.get(0).click();
        webTablesPage.insertSalary("12000");
        webTablesPage.clickOnSubmitButton();

        String expectedText= "Cierra\n" +
                "Vega\n" +
                "39\n" +
                "cierra@example.com\n" +
                "12000\n" +
                "Insurance";
        Assert.assertEquals(webTablesPage.entireRow.get(0).getText(), expectedText);
    }

    @Test(priority = 80)
    public void verifyUserCanUpdateDepartment(){
        webTablesPage.update.get(0).click();
        webTablesPage.insertDepartment("Finance");
        webTablesPage.clickOnSubmitButton();

        String expectedText= "Cierra\n" +
                "Vega\n" +
                "39\n" +
                "cierra@example.com\n" +
                "10000\n" +
                "Finance";
        Assert.assertEquals(webTablesPage.entireRow.get(0).getText(), expectedText);
    }

    @Test(priority = 90)
    public void verifyUserCanDeleteTableRow(){
        webTablesPage.delete.get(0).click();

        String expectedText="Alden\n" +
                "Cantrell\n" +
                "45\n" +
                "alden@example.com\n" +
                "12000\n" +
                "Compliance";
        Assert.assertEquals(webTablesPage.entireRow.get(0).getText(), expectedText);
    }

    @Test(priority = 100)
    public void userCanDeleteAllRows(){
        webTablesPage.deleteAllRows();
        Assert.assertTrue(webTablesPage.noRowsMessage.isDisplayed());
    }


    @AfterMethod
    public void tearDownWebTablesTest() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }

}
