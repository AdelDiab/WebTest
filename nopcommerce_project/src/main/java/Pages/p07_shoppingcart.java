package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class p07_shoppingcart {
    private WebDriver driver;
    public  p07_shoppingcart(WebDriver driver) {

        this.driver = driver;
    }
    private final By ClickOnShoppingCart = By.xpath("//a[text()=\"shopping cart\"]");
    private final By AgreeRadioButton = By.xpath("//input[@id=\"termsofservice\"]");
    private final By CheckoutButton = By.xpath("//button[@id=\"checkout\"]");
    public void UserClickOnAgreeRadioButton() {
        driver.findElement(this.AgreeRadioButton).click();
    }

    public P08_checkout  UserClickOnCheckoutButton() {
        driver.findElement(this.CheckoutButton).click();
        return new P08_checkout (driver);
    }
}
