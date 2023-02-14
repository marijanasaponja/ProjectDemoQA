package DemoQA.DemoQABase;


import DemoQA.DemoQAPages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class DemoQABaseTest {
    public static WebDriver driver;
    public WebDriverWait wdwait;
    public ExcelReader excelReader;

    public String homeURL;
    public String textBoxURL;
    public String checkBoxURL;
    public String webTablesURL;
    public String radioButtonURL;
    public String buttonsURL;
    public String linksURL;
    public String brokenLinksURL;
    public String uploadAndDownloadURL;
    public String dynamicPropertiesURL;

    public HomePage homePage;
    public SidebarPage sidebarPage;
    public TextBoxPage textBoxPage;
    public CheckBoxPage checkBoxPage;
    public RadioButtonPage radioButtonPage;
    public WebTablesPage webTablesPage;
    public ButtonsPage buttonsPage;
    public LinksPage linksPage;
    public BrokenLinksPage brokenLinksPage;
    public UploadAndDownloadPage uploadAndDownloadPage;
    public DynamicPropertiesPage dynamicPropertiesPage;


    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        excelReader = new ExcelReader("src/test/java/DemoQA/TestFile.xlsx");
        homeURL = excelReader.getStringData("URL", 1, 0);
        textBoxURL = excelReader.getStringData("ElementsURL", 1, 0);
        checkBoxURL= excelReader.getStringData("ElementsURL", 1,1);
        radioButtonURL=excelReader.getStringData("ElementsURL", 1,2);
        webTablesURL=excelReader.getStringData("ElementsURL", 1, 3);
        buttonsURL=excelReader.getStringData("ElementsURL", 1,4);
        linksURL=excelReader.getStringData("ElementsURL", 1,5);
        brokenLinksURL=excelReader.getStringData("ElementsURL", 1,6);
        uploadAndDownloadURL=excelReader.getStringData("ElementsURL", 1, 7);
        dynamicPropertiesURL=excelReader.getStringData("ElementsURL", 1,8);
    }


    public void waitForVisibility(WebElement element) {
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForClickability(WebElement element) {
        wdwait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public boolean isDisplayed(WebElement element) {
        boolean webelement = false;
        try {
            webelement = element.isDisplayed();
        } catch (Exception e) {

        }
        return webelement;
    }

    public void doubleClickWithJS(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].dispatchEvent(new MouseEvent('dblclick', { bubbles: true }));", element);
    }



}
