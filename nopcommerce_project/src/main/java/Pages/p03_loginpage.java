package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class p03_loginpage {
    WebDriver driver;

    p03_loginpage(WebDriver driver) {
        this.driver = driver;
    }

    public final By email = By.id("Email");
    public final By password = By.id("Password");
    public final By logButton = By.xpath("//button[text()='Log in']");

    public void setlogemail(String email)

    {
         driver.findElement(this.email).sendKeys(email);

    }

    public void setlogePass(String password)

    {
        driver.findElement(this.password).sendKeys(password);

    }

    public p04_MainPage clicklogbutton()

    {
        driver.findElement(logButton).click();
        return new p04_MainPage(driver);

    }


}