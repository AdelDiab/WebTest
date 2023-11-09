package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class p06_MacBookPage {
    WebDriver driver ;
private final By AddToCardButton = By.id("add-to-cart-button-4");
    private final By confirmation = By.cssSelector(".content");
    private  final By texrshoppingcart =By.xpath("/html/body/div[6]/div[4]/div[1]/div[3]/ul/li[4]/a");
    public p06_MacBookPage (WebDriver driver){
        this.driver=driver;
    }
    public void clickAddToCardButton (){
        driver.findElement(AddToCardButton).click();
    }
    public  boolean Chckconfirmationmessage (){
        return  driver.findElement(confirmation).getText().contains("The product has been added to your ");
    }
    public p07_shoppingcart clickshoppingcarttext(){
        driver.findElement(texrshoppingcart).click();
        return new p07_shoppingcart(driver);
    }
}
