package HomePage;

import Academy.PageObject.LandingPageObjects;
import Academy.resource.base;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePage extends base {

    @Test
    public void basePageNavigation() throws IOException, InterruptedException {
        driver = initializeDrivers();
        driver.manage().window().maximize();
        driver.get("http://www.qaclickacademy.com/");
        LandingPageObjects landingPage = new LandingPageObjects(driver);
        landingPage.register().click();
        RegisterPage registerPage = new RegisterPage();
        registerPage.registerFunctionality();
        driver.quit();
    }
}
