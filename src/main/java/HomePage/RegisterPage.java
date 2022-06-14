package HomePage;

import Academy.PageObject.RegisterPageObjects;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    public WebDriver driver;
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void registerFunctionality() throws InterruptedException {

        RegisterPageObjects registerPageObjects = new RegisterPageObjects(driver);
        //Send value to Full Name field
        registerPageObjects.getFullName().sendKeys("LokeshJammi");
        //Send value to email field
        registerPageObjects.getEmailPath().sendKeys("jammilokesh3@gmail.com");
        //Send value to password field
        registerPageObjects.getPasswordPath().sendKeys("Qaclick@525531");
        //Click agree checkbox
        registerPageObjects.getCheckboxPath().click();
        //Click on Signup button
        registerPageObjects.getSignupButtonPath().click();
    }
}
