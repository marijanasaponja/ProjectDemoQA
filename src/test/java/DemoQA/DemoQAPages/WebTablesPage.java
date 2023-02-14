package DemoQA.DemoQAPages;

import DemoQA.DemoQABase.DemoQABaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTablesPage extends DemoQABaseTest {
    public WebTablesPage() {
        PageFactory.initElements(driver, this);
    }

    public @FindBy(id="addNewRecordButton")
    WebElement addButton;

    public @FindBy(id="searchBox")
    WebElement searchBox;

    public @FindBy(css = ".rt-th.rt-resizable-header.-cursor-pointer")
    List<WebElement>header;

    public @FindBy(className = "rt-noData")
    WebElement noRowsMessage;
    public@FindBy(xpath = "//span[@title='Edit']")
    List<WebElement> update;

    public@FindBy(xpath="//span[@title='Delete']")
    List<WebElement> delete;

    public @FindBy(className = "rt-tr-group")
    List<WebElement> entireRow;

    public @FindBy(id="firstName")
    WebElement firstName;

    public @FindBy(id="lastName")
    WebElement lastName;

    public @FindBy(id="userEmail")
    WebElement email;

    public @FindBy(id="age")
    WebElement age;

    public @FindBy(id="salary")
    WebElement salary;

    public @FindBy(id="department")
    WebElement department;

    public @FindBy(id="submit")
    WebElement submitButton;


    //----------------------------------------------------

    public void deleteAllRows(){
    for (int i=delete.size()-1;i>=0;i--) {

        delete.get(i).click();
        }
    }
    public void clickOnAddButton() {
       addButton.click();
    }
    public void insertFirstName(String fname) {
        firstName.clear();
        firstName.sendKeys(fname);
    }

    public void insertLastName(String lname) {
        lastName.clear();
        lastName.sendKeys(lname);
    }

    public void insertEmail(String e) {
        email.clear();
        email.sendKeys(e);
    }

    public void insertAge(String a) {
        age.clear();
        age.sendKeys(a);
    }

    public void insertSalary(String s) {
        salary.clear();
        salary.sendKeys(s);
    }

    public void insertDepartment(String d) {
        department.clear();
        department.sendKeys(d);
    }

    public void clickOnSubmitButton(){
        submitButton.click();
    }


}
