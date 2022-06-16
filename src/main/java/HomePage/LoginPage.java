package HomePage;

import Academy.resource.base;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPage extends base {
    @BeforeTest
    public void initialization() throws IOException {
        driver = initializeDrivers();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
    }

    @Test
    public void loginPageNavigation(){

    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
