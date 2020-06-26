package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage extends BasePage{

    public WebDriver driver;

    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }
    //Login page locators
//    protected final By emailLocator = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div[2]/form/div[1]/label/input");
//    protected final By passwordLocator = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div[2]/form/div[2]/label/input" );
//    protected final By loginbuttonLocator = By.xpath( "/html/body/div[1]/div/div[3]/div/div/div/div[2]/form/div[4]/button");
//    protected final By classesLocator = By.xpath( "//*[@id=\"section_classes\"]/div/div[1]/div[1]" );


    By emailLocator  = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div[2]/form/div[1]/label/input");
    public WebElement emailLocator  () {return driver.findElement(emailLocator );}

    By passwordLocator = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div[2]/form/div[2]/label/input");
    public WebElement passwordLocator  () {return driver.findElement(passwordLocator);}

    By loginbuttonLocator  = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div[2]/form/div[4]/button");
    public WebElement loginbuttonLocator () {return driver.findElement(loginbuttonLocator);}

    By classesLocator  = By.xpath("//*[@id=\"section_classes\"]/div/div[1]/div[1]");
    public WebElement classesLocator () {return driver.findElement(classesLocator);}



    //Login method

  public void login() throws InterruptedException {

      //Clicking on email field
      Thread.sleep(2000);
      driver.findElement(emailLocator).click();
      driver.findElement(emailLocator).sendKeys("TestUser18@icfnexttest.com");

      //Clicking on Password field
      driver.findElement(passwordLocator).click();
      driver.findElement(passwordLocator).sendKeys("Test12345!");

      //clicking on Login button
      driver.findElement(loginbuttonLocator).click();
      //wait.until( ExpectedConditions.visibilityOfElementLocated(classesLocator) );
      Thread.sleep(4000);
      String txt =  driver.findElement(classesLocator).getText();
      Assert.assertEquals(txt, "My booked classes");
      System.out.println("Log in successfull");
  }


}
