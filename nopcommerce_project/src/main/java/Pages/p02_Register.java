package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
public class p02_Register {
    private WebDriver driver;
    Select select;

    public p02_Register(WebDriver driver) {
        this.driver = driver;
    }

    private final By genderF = By.xpath("//input[@value='F']");
    private final By firstName = By.xpath("//input[@id='FirstName']");
    private final By lastName = By.xpath("//input[@id='LastName']");
    private final By day = (By.xpath("//select[@name='DateOfBirthDay']"));
    private final By month = By.xpath("//select[@name='DateOfBirthMonth']");
    private final By year = By.xpath("//select[@name='DateOfBirthYear']");
    private final By email = By.xpath("//input[@id='Email']");
    private final By password = By.xpath("//input[@id='Password']");
    private final By confPassword = By.xpath("//input[@id='ConfirmPassword']");
    private final By registerBtn = By.xpath("//button[@id='register-button']");
    private final By confMessage = By.xpath("//div[@class=\"result\"]");

    public void addUserGenderFemale() {
        driver.findElement(genderF).click();
    }

    public void enterFirstName(String FNAME) {
        driver.findElement(firstName).sendKeys(FNAME);
    }

    public void enterLastName(String LNAME) {
        driver.findElement(lastName).sendKeys(LNAME);
    }

    public void selectDay() {
        select = new Select(driver.findElement(this.day));
        select.selectByIndex(20);
    }

    public void selectMonth() {
        select = new Select(driver.findElement(this.month));
        select.selectByIndex(5);
    }

    public void selectYear() {
        select = new Select(driver.findElement(this.year));
        select.selectByIndex(70);
    }

    public void enterEmail(String Email) {
        driver.findElement(this.email).sendKeys(Email);
    }

    public void enterPassword(String Pssword) {
        driver.findElement(this.password).sendKeys(Pssword);
    }

    public void enterConfPassword(String CofPASS) {
        driver.findElement(this.confPassword).sendKeys(CofPASS);
    }

    public void clickRegisterBtn() {
        driver.findElement(this.registerBtn).click();
    }

    public boolean confRegisterSuccessfully() {
        return driver.findElement(this.confMessage).getText().equals("Your registration completed");
    }
}
