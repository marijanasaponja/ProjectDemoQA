package DemoQA.DemoQAPages;

import DemoQA.DemoQABase.DemoQABaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadAndDownloadPage extends DemoQABaseTest {
    public UploadAndDownloadPage() {
        PageFactory.initElements(driver, this);
    }

    public @FindBy(id="downloadButton")
    WebElement downloadButton;

    public @FindBy(id="uploadFile")
    WebElement uploadFileButton;

    public @FindBy(className="form-file-label")
    WebElement downloadLink;

    public @FindBy(id="uploadedFilePath")
    WebElement uploadedFile;



    //------------------------------

    public void clickOnDownloadButton(){
        downloadButton.click();
        }

    public void uploadFile(){
        uploadFileButton.sendKeys("C:\\Users\\HP\\Desktop\\nature.jpg");
    }

}

