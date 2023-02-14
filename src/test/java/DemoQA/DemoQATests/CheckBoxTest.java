package DemoQA.DemoQATests;

import DemoQA.DemoQABase.DemoQABaseTest;
import DemoQA.DemoQAPages.CheckBoxPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class CheckBoxTest extends DemoQABaseTest {

    @BeforeMethod
    public void checkBoxTestSetUp() {
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(checkBoxURL);
        checkBoxPage= new CheckBoxPage();

    }

    @Test(priority = 10)
    public void userCanCheckHomeCheckBox(){
        checkBoxPage.check.get(0).click();

        String message1= "home";
        String message2= "desktop";
        String message3= "documents";
        String message4="downloads";

        Assert.assertEquals(checkBoxPage.notification.get(0).getText(), message1);
        Assert.assertEquals(checkBoxPage.notification.get(1).getText(), message2);
        Assert.assertEquals(checkBoxPage.notification.get(4).getText(), message3);
        Assert.assertEquals(checkBoxPage.notification.get(14).getText(), message4);

    }

    @Test(priority = 20)
    public void userCanCheckDesktopCheckBox(){
        checkBoxPage.expandText.get(0).click();
        checkBoxPage.check.get(1).click();
        checkBoxPage.expandText.get(1).click();

        String message1= "desktop";
        String message2= "notes";
        String message3= "commands";

        Assert.assertEquals(checkBoxPage.notification.get(0).getText(), message1);
        Assert.assertEquals(checkBoxPage.notification.get(1).getText(), message2);
        Assert.assertEquals(checkBoxPage.notification.get(2).getText(), message3);

    }

    @Test(priority = 30)
    public void userCanCheckDocumentsCheckBox(){
        checkBoxPage.expandText.get(0).click();
        checkBoxPage.check.get(2).click();
        checkBoxPage.expandText.get(2).click();

        String message1= "documents";
        String message2= "workspace";
        String message3= "office";

        Assert.assertEquals(checkBoxPage.notification.get(0).getText(), message1);
        Assert.assertEquals(checkBoxPage.notification.get(1).getText(), message2);
        Assert.assertEquals(checkBoxPage.notification.get(5).getText(), message3);

    }

    @Test(priority = 40)
    public void userCanCheckDownloadsCheckBox(){
        checkBoxPage.expandText.get(0).click();
        checkBoxPage.check.get(3).click();
        checkBoxPage.expandText.get(3).click();

        String message1= "downloads";
        String message2= "wordFile";
        String message3= "excelFile";

        Assert.assertEquals(checkBoxPage.notification.get(0).getText(), message1);
        Assert.assertEquals(checkBoxPage.notification.get(1).getText(), message2);
        Assert.assertEquals(checkBoxPage.notification.get(2).getText(), message3);

    }

    @Test(priority = 50)
    public void userCanCheckNotesCheckBox(){
        checkBoxPage.expandText.get(0).click();
        checkBoxPage.expandText.get(1).click();
        checkBoxPage.check.get(2).click();

        String message1= "notes";
        Assert.assertEquals(checkBoxPage.notification.get(0).getText(), message1);

    }

    @Test(priority = 60)
    public void userCanCheckCommandsCheckBox(){
        checkBoxPage.expandText.get(0).click();
        checkBoxPage.expandText.get(1).click();
        checkBoxPage.check.get(3).click();

        String message1= "commands";
        Assert.assertEquals(checkBoxPage.notification.get(0).getText(), message1);

    }

    @Test(priority = 70)
    public void userCanCheckWorkspaceCheckBox(){
        checkBoxPage.expandText.get(0).click();
        checkBoxPage.expandText.get(2).click();
        checkBoxPage.expandText.get(3).click();
        checkBoxPage.check.get(3).click();

        String message1= "workspace";
        String message2= "react";
        String message3= "angular";

        Assert.assertEquals(checkBoxPage.notification.get(0).getText(), message1);
        Assert.assertEquals(checkBoxPage.notification.get(1).getText(), message2);
        Assert.assertEquals(checkBoxPage.notification.get(2).getText(), message3);
    }

    @Test(priority = 80)
    public void userCanCheckReactCheckBox(){
        checkBoxPage.expandText.get(0).click();
        checkBoxPage.expandText.get(2).click();
        checkBoxPage.expandText.get(3).click();
        checkBoxPage.check.get(4).click();

        String message1= "react";
        Assert.assertEquals(checkBoxPage.notification.get(0).getText(), message1);

    }

    @Test(priority = 90)
    public void userCanCheckVeuCheckBox(){
        checkBoxPage.expandText.get(0).click();
        checkBoxPage.expandText.get(2).click();
        checkBoxPage.expandText.get(3).click();
        checkBoxPage.check.get(6).click();

        String message1= "veu";
        Assert.assertEquals(checkBoxPage.notification.get(0).getText(), message1);

    }

    @Test(priority = 100)
    public void userCanCheckOfficeCheckBox(){
        checkBoxPage.expandText.get(0).click();
        checkBoxPage.expandText.get(2).click();
        checkBoxPage.expandText.get(3).click();
        checkBoxPage.expandText.get(4).click();
        checkBoxPage.check.get(7).click();

        String message1= "office";
        String message2= "public";
        String message3= "private";

        Assert.assertEquals(checkBoxPage.notification.get(0).getText(), message1);
        Assert.assertEquals(checkBoxPage.notification.get(1).getText(), message2);
        Assert.assertEquals(checkBoxPage.notification.get(2).getText(), message3);
    }

    @Test(priority = 110)
    public void userCanCheckPublicCheckBox(){
        checkBoxPage.expandText.get(0).click();
        checkBoxPage.expandText.get(2).click();
        checkBoxPage.expandText.get(3).click();
        checkBoxPage.expandText.get(4).click();
        checkBoxPage.check.get(8).click();

        String message1= "public";
        Assert.assertEquals(checkBoxPage.notification.get(0).getText(), message1);

    }

    @Test(priority = 120)
    public void userCanCheckPrivateCheckBox(){
        checkBoxPage.expandText.get(0).click();
        checkBoxPage.expandText.get(2).click();
        checkBoxPage.expandText.get(3).click();
        checkBoxPage.expandText.get(4).click();
        checkBoxPage.check.get(9).click();

        String message1= "private";
        Assert.assertEquals(checkBoxPage.notification.get(0).getText(), message1);

    }

    @Test(priority = 130)
    public void userCanCheckClassifiedCheckBox(){
        checkBoxPage.expandText.get(0).click();
        checkBoxPage.expandText.get(2).click();
        checkBoxPage.expandText.get(3).click();
        checkBoxPage.expandText.get(4).click();
        scrollToElement(checkBoxPage.check.get(10));
        checkBoxPage.check.get(10).click();

        String message1= "classified";
        Assert.assertEquals(checkBoxPage.notification.get(0).getText(), message1);

    }

    @Test(priority = 140)
    public void userCanCheckGeneralCheckBox(){
        checkBoxPage.expandText.get(0).click();
        checkBoxPage.expandText.get(2).click();
        checkBoxPage.expandText.get(3).click();
        checkBoxPage.expandText.get(4).click();
        scrollToElement(checkBoxPage.check.get(11));
        checkBoxPage.check.get(11).click();

        String message1= "general";
        Assert.assertEquals(checkBoxPage.notification.get(0).getText(), message1);

    }

    @Test(priority = 150)
    public void userCanCheckWordFileCheckBox(){
        checkBoxPage.expandText.get(0).click();
        checkBoxPage.expandText.get(3).click();
        checkBoxPage.check.get(4).click();

        String message1= "wordFile";
        Assert.assertEquals(checkBoxPage.notification.get(0).getText(), message1);

    }

    @Test(priority = 160)
    public void userCanCheckExcelFileCheckBox(){
        checkBoxPage.expandText.get(0).click();
        checkBoxPage.expandText.get(3).click();
        checkBoxPage.check.get(5).click();

        String message1= "excelFile";
        Assert.assertEquals(checkBoxPage.notification.get(0).getText(), message1);

    }


    @AfterMethod
    public void tearDownCheckBoxTest() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
