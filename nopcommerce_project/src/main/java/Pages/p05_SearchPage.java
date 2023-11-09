package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class p05_SearchPage {
    WebDriver driver ;
    private final By AddtoCardButton = By.cssSelector(".button-2 ");
    private final By macText =By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/h2/a");
    public  p05_SearchPage(WebDriver driver){
        this.driver =driver;
    }
public  p06_MacBookPage clickAddTocard(){
        driver.findElement(AddtoCardButton).click(); ;
        return new p06_MacBookPage(driver) ;
}

public boolean checklinktext (){
    return  driver.findElement(macText).getText().contains("Apple MacBook");
}
}
