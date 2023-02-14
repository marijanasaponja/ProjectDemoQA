package DemoQA.DemoQAPages;

import DemoQA.DemoQABase.DemoQABaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckBoxPage extends DemoQABaseTest {
    public CheckBoxPage() {
            PageFactory.initElements(driver, this);
    }

    public @FindBy(className ="rct-checkbox")
    List<WebElement> check;
    public @FindBy(className = "text-success")
    List<WebElement>notification;
    public @FindBy(css = ".rct-collapse.rct-collapse-btn")
    List<WebElement>expandText;


}
