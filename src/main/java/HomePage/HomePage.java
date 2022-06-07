package HomePage;

import Academy.PageObject.LandingPage;
import Academy.resource.base;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePage extends base {

    @Test
    public void basePageNavigation() throws IOException {
        driver = initializeDrivers();
        driver.manage().window().maximize();
        driver.get("http://www.qaclickacademy.com/");
        LandingPage landingPage = new LandingPage(driver);
        landingPage.signIn().click();
        driver.quit();
    }
}
