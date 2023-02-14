package DemoQA.DemoQAPages;

import DemoQA.DemoQABase.DemoQABaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SidebarPage extends DemoQABaseTest {
    public SidebarPage() {
        PageFactory.initElements(driver, this);
    }

    public @FindBy(className = "text")
    List<WebElement> sideBarElements;

    public void getElement(String name) {
        for (int i = 0; i < sideBarElements.size(); i++) {
            if (sideBarElements.get(i).getText().equals(name)) {
                sideBarElements.get(i);
                break;
            }
        }
    }

    //----------------------------------

    public void clickOnButton(String name) {
        for (int i = 0; i < sideBarElements.size(); i++) {
            if (sideBarElements.get(i).getText().equals(name)) {
                sideBarElements.get(i).click();
                break;
            }
        }
    }
}