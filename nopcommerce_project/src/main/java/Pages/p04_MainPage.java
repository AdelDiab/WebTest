package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class p04_MainPage {
    private WebDriver driver ;
   public p04_MainPage(WebDriver driver){
        this.driver =driver ;
    }
    private final By selectItemFromdropdwon = By.xpath("/html/body/div[6]/div[2]/div");
   private  final  By AddToCratMacBook = By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[1]/a/img");
  private final By confirmation = By.xpath("//*[@id=\"bar-notification\"]/div/p");
  private final By searchtextbox = By.id("small-searchterms");
  private final By searchbutton = By.cssSelector(".search-box-button");
   public void selectCatogery (){
        driver.findElement(selectItemFromdropdwon).click();
    }
    //public void AddMacBookToCard (){
      // driver.findElement(AddToCratMacBook).click();}
    //public  boolean Chckconfirmationmessage (){
      // return  driver.findElement(confirmation).getText().equals("The product has been added to your ");}
    private final By ClickOnShoppingCart = By.xpath("/html/body/div[6]/div[4]/div[1]/div[3]/ul/li[4]/a");
    public void AddTextToSearchtextbox(String productname ){
        driver.findElement(searchtextbox).sendKeys(productname);
    }
    public p05_SearchPage clicksearchbutton (){
       driver.findElement(searchbutton).click();
       return new p05_SearchPage(driver) ;
    }
    public p07_shoppingcart clickshoppingcart(){
        driver.findElement(ClickOnShoppingCart).click();
        return new p07_shoppingcart(driver);
    }
}
