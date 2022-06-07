package Academy.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    public WebDriver driver;

    By signIn = By.xpath("//span[text()='Login']");

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement signIn(){
        WebElement signInLink = driver.findElement(signIn);
        return signInLink;
    }

}
