package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class P08_checkout {
    private WebDriver driver;
    Select select;
    public P08_checkout(WebDriver driver)
    {
        this.driver=driver;
    }



    private final By FName=By.id("id=\"BillingNewAddress_FirstName\"");
    private final By LName = By.id("id=\"BillingNewAddress_LastName\"");
    private final By Email = By.id("id=\"BillingNewAddress_Email\"");
    private final By CountryDropdown = By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]");
private final By var = By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]/option[207]");
    private final By City = By.xpath("//*[@id=\"BillingNewAddress_City\"]");

    private final By Address = By.xpath("//*[@id=\"BillingNewAddress_Address1\"]");
    private final By ZipCode = By.xpath("//*[@id=\"BillingNewAddress_ZipPostalCode\"]");

    private final By PhoneNumber = By.xpath("//*[@id=\"BillingNewAddress_PhoneNumber\"]");
    private final By ContinueButton = By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]");

    private final By ContinueShippingButton = By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button");

    private final By ContinuePaymentButton = By.xpath("//*[@id=\"payment-method-buttons-container\"]/button");

    private final By PaymentInfoButton = By.xpath("//*[@id=\"payment-info-buttons-container\"]/button");

    private final By ConfirmButton = By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button");

    //TODO:Define Actions
    private final By ConfirmationMessage = By.xpath("//div[@class=\"title\"]");
    public P08_checkout UserEnterFName(String first) {
        driver.findElement(this.FName).sendKeys(first);
        return this;
    }

    public P08_checkout UserEnterLName(String last) {
        driver.findElement(this.LName).sendKeys(last);
        return this;
    }

    public P08_checkout UserEnterEmail(String email) {
        driver.findElement(this.Email).sendKeys(email);
        return this;
    }

    public P08_checkout UserSelectCountryDropdown1() {
        driver.findElement(this.var).click();
        //select = new Select(driver.findElement(this.CountryDropdown));
        //select.selectByIndex(70);
        return this;
    }

    public P08_checkout UserEntertCity(String city) {
        driver.findElement(this.City).sendKeys(city);
        return this;
    }
    public P08_checkout UserEnterAddress(String address) {
        driver.findElement(this.Address).sendKeys(address);
        return this;
    }

    public P08_checkout UserEnterZipCode(String code) {
        driver.findElement(this.ZipCode).sendKeys(code);
        return this;
    }
    public P08_checkout UserEnterPhoneNumber(String number) {
        driver.findElement(this.PhoneNumber).sendKeys(number);
        return this;
    }

    public P08_checkout UserClickOnContinueButton() {
        driver.findElement(this.ContinueButton).click();
        return this;
    }
    public P08_checkout UserClickOnShippingButton() {
        driver.findElement(this.ContinueShippingButton).click();
        return this;
    }

    public P08_checkout UserClickOnContinuePaymentButton() {
        driver.findElement(this.ContinuePaymentButton).click();
        return this;
    }

    public P08_checkout UserClickOnPaymentInfoButton() {
        driver.findElement(this.PaymentInfoButton).click();
        return this;
    }
    public P08_checkout getConfirmButton() {
        driver.findElement(this.ConfirmButton).click();
        return this;
    }
   public Boolean ConfirmationMessage()
    {
        return driver.findElement(this.ConfirmationMessage).getText().equals("Your order has been successfully processed!");
    }
}
