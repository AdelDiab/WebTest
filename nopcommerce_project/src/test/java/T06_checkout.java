import Pages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class T06_checkout extends TestBase {
    public static String City = "alex";
    public static String Address = "louran" ;
    public static String Code = "13254" ;
    public static String PhoneNumber = "01234567885" ;
    private String email = "test1234@gmail.com";
    private String password ="test123";
    private String productname = "macbook";

      @Test
      public void checkout(){
    p03_loginpage Login = homePage.click_Login();
    Login.setlogemail(email);
    Login.setlogePass(password);
    p04_MainPage mainPage = Login.clicklogbutton();
          mainPage.AddTextToSearchtextbox(productname);
          p05_SearchPage searchPage = mainPage.clicksearchbutton();
          p06_MacBookPage macpage = searchPage.clickAddTocard();
          macpage.clickAddToCardButton();
          p07_shoppingcart shoppingcardpage = macpage.clickshoppingcarttext();
         shoppingcardpage.UserClickOnAgreeRadioButton();
          P08_checkout  chechoutpage = shoppingcardpage.UserClickOnCheckoutButton();
          chechoutpage.UserSelectCountryDropdown1();
          chechoutpage.UserEntertCity(City);
          chechoutpage.UserEnterAddress(Address);
          chechoutpage.UserEnterZipCode(Code);
          chechoutpage.UserEnterPhoneNumber(PhoneNumber);
          chechoutpage.UserClickOnContinueButton();
          chechoutpage.UserClickOnShippingButton();
          chechoutpage.UserClickOnContinuePaymentButton();
          chechoutpage.UserClickOnPaymentInfoButton();
          chechoutpage.getConfirmButton();



}

}
