import Pages.p03_loginpage;
import Pages.p04_MainPage;
import org.testng.annotations.Test;

public class T03_SelectCategory extends TestBase {
    private String email = "test1234@gmail.com";
    private String password ="test123";
@Test
    public void selectcategeory (){
    p03_loginpage Login = homePage.click_Login(); ;
    Login.setlogemail(email);
    Login.setlogePass(password);
    p04_MainPage category = Login.clicklogbutton();
    category.selectCatogery();
}
}
