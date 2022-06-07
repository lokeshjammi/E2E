package Academy.resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class base {

    public WebDriver driver;
    public WebDriver initializeDrivers() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("D:\\IntelliJ_Workspace\\E2EProject\\src\\main\\java\\Academy\\resource\\data.properties");
        prop.load(fis);
        String browser = prop.getProperty("browser");
        if (browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Chrome\\chrome.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chrome.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver", "D:\\Drivers\\Edge\\msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            System.out.println("Enter Proper Browser");
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }

}
