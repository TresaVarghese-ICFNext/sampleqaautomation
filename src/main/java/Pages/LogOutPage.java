package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LogOutPage extends BasePage {

    public WebDriver driver;


//    protected final By logoutLocator = By.xpath("//*[@id=\"header-path\"]/div[2]/span/span/a[3]");
//    protected final By textLocator = By.xpath("/html/body/div[1]/div/div[2]/div/div[3]/div/div/div/div/div/div[1]/div/div[1]");

    By logoutLocator = By.xpath("//*[@id=\"header-path\"]/div[2]/span/span/a[3]");
    public WebElement logoutLocator () {return driver.findElement(logoutLocator );}

    By textLocator  = By.xpath("/html/body/div[1]/div/div[2]/div/div[3]/div/div/div/div/div/div[1]/div/div[1]");
    public WebElement textLocator () {return driver.findElement(textLocator);}

    public LogOutPage(WebDriver driver) {

        this.driver = driver;
    }


    //Logout method

    public void logout() throws InterruptedException {

        //Clicking on email field
        Thread.sleep(2000);
        driver.findElement(logoutLocator).click();

        Thread.sleep(2000);
        String txt =  driver.findElement(textLocator).getText();

        Assert.assertEquals(txt, "FITNESS FOR");


    }
}