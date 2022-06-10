package Academy.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPageObjects {

    public WebDriver driver;

    public RegisterPageObjects(WebDriver driver) {
        this.driver = driver;
    }

    By fullNamePath = By.xpath("//input[@id='user_name']");
    public WebElement getFullName(){
        return driver.findElement(fullNamePath);
    }

    By emailPath = By.xpath("//input[@id='user_email']");
    public WebElement getEmailPath(){
        return driver.findElement(emailPath);
    }

    By passwordPath = By.xpath("//input[@id='password']");
    public WebElement getPasswordPath(){
        return driver.findElement(passwordPath);
    }

    By agreeCheckboxPath = By.xpath("//input[@id='allow_marketing_emails']");
    public WebElement getCheckboxPath(){
        return driver.findElement(agreeCheckboxPath);
    }

    By signUpButtonPath = By.xpath("//input[@type='submit']");
    public WebElement getSignupButtonPath(){
        return driver.findElement(signUpButtonPath);
    }
}
