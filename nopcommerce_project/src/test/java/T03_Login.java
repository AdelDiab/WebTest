import Pages.p01_HomePage;
import Pages.p02_Register;
import Pages.p03_loginpage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T03_Login extends TestBase {
    private String email = "test1234@gmail.com";
    private String password ="test123";

    @Test
    public void Login_TC (){

        p03_loginpage Login = homePage.click_Login(); ;
        Login.setlogemail(email);
        Login.setlogePass(password);
        Login.clicklogbutton();

        Assert.assertTrue(new p01_HomePage(driver).checkLogoutButton());



    }




}
