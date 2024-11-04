package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormaPage {
    @FindBy (id = "firstName")
    private WebElement firstNameEl;
    @FindBy (id = "lastName")
    private WebElement lastNameEl;
    @FindBy (id = "userEmail")
    private WebElement userEmailEl;
    @FindBy (id = "Gender")
    private WebElement genderMaleEl;
    @FindBy (id = "userNumber")
    private WebElement userNumberEl;
    @FindBy (id = "dateOfBirthInput")
    private WebElement dateOfBirthInputEl;

    public static WebDriver driver;

    public FormaPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setFirstNameEl(String a)
    {
        firstNameEl.sendKeys(a);
    }

    public void setLastNameEl(String a) { lastNameEl.sendKeys(a);}

    public void setUserEmailEl(String a) {userEmailEl.sendKeys(a);}

    public void setGenderMaleEl(String a) {genderMaleEl.click();}

    public void setUserNumber(String a) {userNumberEl.sendKeys(a);}

    public void setDateOfBirthInputEl(String a) {
        dateOfBirthInputEl.sendKeys(Keys.CONTROL + "a");
        dateOfBirthInputEl.sendKeys(a);
        dateOfBirthInputEl.sendKeys(Keys.ENTER);
    }
}
