package DemoQA.DemoQAPages;

import DemoQA.DemoQABase.DemoQABaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ButtonsPage extends DemoQABaseTest {

    public ButtonsPage() {
        PageFactory.initElements(driver, this);
    }

    public @FindBy (css = ".btn.btn-primary")
    List<WebElement>button;

    public @FindBy(id="rightClickBtn")
    WebElement rightClickButton;

    public @FindBy(id="dynamicClickMessage")
    WebElement dynamicClickMessage;

    public @FindBy(id="doubleClickMessage")
    WebElement doubleClickMessage;

    public @FindBy(id="rightClickMessage")
    WebElement rightClickMessage;


}
