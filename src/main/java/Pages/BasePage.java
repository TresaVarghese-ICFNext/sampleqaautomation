package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BasePage {

    public WebDriver driver;
    public Properties prop = new Properties();
    public static String application;
    public String path = System.getProperty("user.dir");

    public WebDriver initalizeDriver() throws IOException {

        FileInputStream fin = new FileInputStream(path + "/src/main/resources/config.properties");
        prop.load(fin);
        String browserName = prop.getProperty("browser");
        application = prop.getProperty("URL");

        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", path + "/src/main/resources/chromedriver");
            driver = new ChromeDriver();
        } else if (browserName.equals(("firefox"))) {
            System.out.println("Firefox not supported yet");
        }
        return driver;
    }


    //Mobile capabilities

    public WebDriver devicesetup() throws IOException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("os_version", "13.2");
        cap.setCapability("device", "iPhone 11");
        cap.setCapability("device Name", "sindhu's iPhone");
        cap.setCapability("browser", "chrome");
        cap.setCapability("browserstack.local", "false");

        FileInputStream fin = new FileInputStream(path + "/src/main/resources/config.properties");
        prop.load(fin);
        String browserName = prop.getProperty("browser");
        application = prop.getProperty("URL");

        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", path + "/src/main/resources/chromedriver");
            driver = new ChromeDriver();
        } else if (browserName.equals(("firefox"))) {
            System.out.println("Firefox not supported yet");
        }
        return driver;

    }

//    public void waitForElementEnabled(final WebElement element)
//    {
//
//        try
//        {
//
//            wait.until((ExpectedCondition<Boolean>) driver -> element.isEnabled());
//        }
//        catch (Exception e)
//        {
//            System.out.println(e + " : " + "Timed out waiting for element: " + element);
//        }
//    }

//    public void waitfunction()
//    {
//        WebDriverWait wait = new WebDriverWait(driver, 20);
//    }
}

