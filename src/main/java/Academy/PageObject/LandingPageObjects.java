package Academy.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageObjects {

    public WebDriver driver;

    By signIn = By.xpath("//span[text()='Register']");

    public LandingPageObjects(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement register(){
        WebElement registerLink = driver.findElement(signIn);
        return registerLink;
    }

}
