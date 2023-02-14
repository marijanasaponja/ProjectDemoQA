package DemoQA.DemoQAPages;

import DemoQA.DemoQABase.DemoQABaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrokenLinksPage extends DemoQABaseTest {

    public BrokenLinksPage() {
        PageFactory.initElements(driver,this);
    }

    public @FindBy(xpath = "//img[contains(@src,'/images/Toolsqa.jpg')]")
    WebElement validImage;

    public @FindBy(xpath = "//img[contains(@src,'/images/Toolsqa_1.jpg')]")
    WebElement brokenImage;

    public @FindBy(linkText = "Click Here for Valid Link")
    WebElement validLink;

    public @FindBy(linkText = "Click Here for Broken Link")
    WebElement brokenLink;

    public @FindBy(css="div[class='example'] p")
    WebElement errorMessage;

    //-------------------------------------------

    public void clickOnValidLink(){
        validLink.click();
    }

    public void clickOnBrokenLink(){
        brokenLink.click();
    }

}
