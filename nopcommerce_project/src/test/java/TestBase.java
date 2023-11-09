import Pages.p01_HomePage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver ;
    p01_HomePage homePage ;
    Dimension dimension = new Dimension(400,520);
    @BeforeClass
    public void base() {
        System.setProperty("webdriver.chrome.driver","F:\\nopcommerce_project\\nopcommerce_project\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver() ;
        //driver.manage().window().setSize(dimension);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/search?q=desktops");
        homePage = new p01_HomePage(driver);

    }
    @AfterClass
    public void teardwon (){
        //driver.quit();
    }

}
