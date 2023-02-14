package DemoQA.DemoQAPages;

import DemoQA.DemoQABase.DemoQABaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends DemoQABaseTest{

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public @FindBy(className = "banner-image")
    WebElement bannerImage;

    public @FindBy(className = "card-body")
    List<WebElement> elements;


//-------------------------------------
    public void clickOnBanner(){
        bannerImage.click();
    }

    public void clickOnElements() {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getText().equals("Elements")) {
                elements.get(i).click();
                break;
            }
        }
    }

    public void clickOnForms() {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getText().equals("Forms")) {
                elements.get(i).click();
                break;
            }
        }
    }

    public void clickOnAlerts() {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getText().equals("Alerts, Frame & Windows")) {
                elements.get(i).click();
                break;
            }
        }
    }

    public void clickOnWidgets() {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getText().equals("Widgets")) {
                elements.get(i).click();
                break;
            }
        }
    }

    public void clickOnInteractions() {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getText().equals("Interactions")) {
                elements.get(i).click();
                break;
            }
        }

    }
    public void clickOnBookStore() {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getText().equals("Book Store Application")) {
                elements.get(i).click();
                break;
            }
        }

    }
}
