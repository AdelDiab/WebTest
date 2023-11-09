package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class p01_HomePage {
    private WebDriver driver ;
    public p01_HomePage(WebDriver driver) {
        this.driver=driver ;
    }
    private final By Regester = By.className("ico-register");
    private final By logOutButton = By.xpath("//a[@class=\"ico-logout\"]");
    private final By Login =By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
    private final By searchField = By.id("small-searchterms");
    //private final By searchButton = By.xpath("//*[@id=\"small-search-box-form\"]/button");
    //private final By  assertion = By.id("q");




    public p02_Register click_Regester (){
        driver.findElement(Regester).click();
        return new p02_Register(driver) ;
    }
    public p03_loginpage click_Login (){
        driver.findElement(Login).click();
       return new p03_loginpage(driver);

}

    public boolean checkLogoutButton() {
        return driver.findElement(logOutButton).isDisplayed();
    }

    //public void SearchField(String productName) {
       // driver.findElement(this.searchField).sendKeys(productName);}

}
