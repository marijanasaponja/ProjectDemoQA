package DemoQA.DemoQAPages;

import DemoQA.DemoQABase.DemoQABaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RadioButtonPage extends DemoQABaseTest {
    public RadioButtonPage() {
        PageFactory.initElements(driver, this);

    }


    public @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/label")
    WebElement yesRadioButton;

    public @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/label")
    WebElement impressiveRadioButton;

    public @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[4]/label")
    WebElement noRadioButton;

    public @FindBy (className="text-success")
    List<WebElement> message;

    //--------------------------------

    public void clickOnYesRadioButton(){
        yesRadioButton.click();
    }
    public void clickOnImpressiveRadioButton(){
        impressiveRadioButton.click();
    }
    public void clickOnNoRadioButton(){
        noRadioButton.click();
    }

}
