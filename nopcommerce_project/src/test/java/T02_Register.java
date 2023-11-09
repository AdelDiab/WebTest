import Pages.p02_Register;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T02_Register extends TestBase {

    private String fname ="farida" ;
    private String lname ="mohamed";
    private String email = "test1234@gmail.com";
    private String password ="test123";
    @Test
    public void Register_TC (){
        p02_Register register = homePage.click_Regester() ;
        register.addUserGenderFemale();
        register.enterFirstName(fname);
        register.enterLastName(lname);
        register.enterEmail(email);
        register.enterPassword(password);
        register.enterConfPassword(password);
        register.clickRegisterBtn();
        Assert.assertTrue(register.confRegisterSuccessfully());
    }

}
