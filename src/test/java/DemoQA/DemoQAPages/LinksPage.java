package DemoQA.DemoQAPages;

import DemoQA.DemoQABase.DemoQABaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinksPage extends DemoQABaseTest {
    public LinksPage() {
        PageFactory.initElements(driver, this);
    }

    public @FindBy (id="simpleLink")
    WebElement homeLink;

    public @FindBy (id = "dynamicLink")
    WebElement homen63R7Link;

    public @FindBy(id="created")
    WebElement createdLink;

    public @FindBy(id="no-content")
    WebElement noContentLink;

    public @FindBy(id="moved")
    WebElement movedLink;
    public @FindBy(id="bad-request")
    WebElement badRequestLink;

    public @FindBy(id="unauthorized")
    WebElement unauthorizedLink;

    public @FindBy(id="forbidden")
    WebElement forbiddenLink;

    public @FindBy(id="invalid-url")
    WebElement notFoundLink;
    public @FindBy(id="linkResponse")
    WebElement linkResponse;

    //---------------------------

    public void clickOnHome(){
        homeLink.click();
    }
    public void clickOnHomen63R7Link(){
        homen63R7Link.click();
    }

    public void clickOnCreatedLink(){
        createdLink.click();
    }

    public void clickOnNoContentLink(){
        noContentLink.click();
    }

    public void clickOnMovedLink(){
        movedLink.click();
    }

    public void clickOnBadRequestLink(){
        badRequestLink.click();
    }

    public void clickOnunauthorizedLink(){
        unauthorizedLink.click();
    }

    public void clickOnForrbidenLink(){
        forbiddenLink.click();
    }
    public void clickOnNotFoundLink(){
        notFoundLink.click();
    }
}
