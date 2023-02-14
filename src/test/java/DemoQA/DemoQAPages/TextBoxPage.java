package DemoQA.DemoQAPages;

import DemoQA.DemoQABase.DemoQABaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage extends DemoQABaseTest {
    public TextBoxPage() {
        PageFactory.initElements(driver, this);
    }

    public @FindBy(id = "userName")
    WebElement fullName;
    public @FindBy(id = "userEmail")
    WebElement email;
    public @FindBy(id = "currentAddress")
    WebElement currentAddress;
    public @FindBy(id = "permanentAddress")
    WebElement permanentAddress;
    public @FindBy(id = "submit")
    WebElement submitButton;

    public @FindBy(css = ".undefined.col-md-12.col-sm-12")
    WebElement emptyOutput;
    public @FindBy(css = ".border.col-md-12.col-sm-12")
    WebElement output;



    //---------------------------------------

    public void insertFullName(String name) {
        fullName.clear();
        fullName.sendKeys(name);
    }

    public void insertEmail(String email) {
        this.email.clear();
        this.email.sendKeys(email);
    }

    public void insertCurrentAddress(String caddress) {
        currentAddress.clear();
        currentAddress.sendKeys(caddress);
    }

    public void insertPermanentAddress(String paddress) {
        permanentAddress.clear();
        permanentAddress.sendKeys(paddress);
    }
    public void clickOnSubmitButton() {
      submitButton.click();
    }

}
