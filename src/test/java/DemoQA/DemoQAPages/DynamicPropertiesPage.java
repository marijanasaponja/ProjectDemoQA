package DemoQA.DemoQAPages;

import DemoQA.DemoQABase.DemoQABaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicPropertiesPage extends DemoQABaseTest {
    public DynamicPropertiesPage() {
        PageFactory.initElements(driver, this);
    }

    public @FindBy(id="enableAfter")
    WebElement enableAfterButton;

    public @FindBy(css="#colorChange")
    WebElement colorChangeButton;

    public @FindBy(id="visibleAfter")
    WebElement visibleAfterButton;


    //--------------------------

}
