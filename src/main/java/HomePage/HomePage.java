package HomePage;

import Academy.PageObject.LandingPageObjects;
import Academy.resource.base;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePage extends base {

    @BeforeTest
    public void initialization() throws IOException {
        driver = initializeDrivers();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
    }
    @Test
    public void basePageNavigation() throws InterruptedException {
        LandingPageObjects landingPage = new LandingPageObjects(driver);
        landingPage.register().click();
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.registerFunctionality();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
