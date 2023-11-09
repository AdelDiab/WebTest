import Pages.p03_loginpage;
import Pages.p04_MainPage;
import Pages.p05_SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T05_Search extends TestBase {
    private String email = "test123456@gmail.com";
    private String password ="test123";
    private String productname = "macbook";
    @Test
    public void AddToCard () {
        p03_loginpage Login = homePage.click_Login();
        Login.setlogemail(email);
        Login.setlogePass(password);
        p04_MainPage mainPage = Login.clicklogbutton();
        mainPage.AddTextToSearchtextbox(productname);
        p05_SearchPage searchPage = mainPage.clicksearchbutton();
        Assert.assertTrue(searchPage.checklinktext());
    }
}
