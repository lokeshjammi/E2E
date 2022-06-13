package Academy.resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class base {

    public WebDriver driver;
    public Properties prop;
    public FileInputStream fis;
    public WebDriver initializeDrivers() throws IOException {
        prop = new Properties();
        try {
            fis = new FileInputStream("D:\\IntelliJ_Workspace\\E2EProject\\src\\main\\java\\Academy\\resource\\data.properties");
        } catch (Exception e){
            fis = new FileInputStream("/media/lokeshjammi-pc/New Volume1/IntelliJ_Workspace/E2E/src/main/java/Academy/resource/data.properties");
            System.out.println(e);
        }
        prop.load(fis);
        String os = prop.getProperty("OS");
        String browser = prop.getProperty("browser");
        if (os.equalsIgnoreCase("Ubuntu")){
            if (browser.equalsIgnoreCase("Chrome")){
                System.setProperty("webdriver.chrome.driver", "/media/lokeshjammi-pc/New Volume1/IntelliJ_Workspace/E2E/src/main/java/Academy/resource/drivers/Brave/chromedriver.exe");
                ChromeOptions options = new ChromeOptions().setBinary("/opt/brave.com/brave/brave");
                driver = new ChromeDriver(options);
            } else if (browser.equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chrome.exe");
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("Edge")) {
                System.setProperty("webdriver.edge.driver", "D:\\Drivers\\Edge\\msedgedriver.exe");
                driver = new EdgeDriver();
            } else {
                System.out.println("Enter Proper Browser");
            }
        } else {
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
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }
}
