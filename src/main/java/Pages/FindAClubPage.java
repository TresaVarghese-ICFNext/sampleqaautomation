package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class FindAClubPage extends BasePage {

    public WebDriver driver;

    public FindAClubPage(WebDriver driver) {
        this.driver = driver;
    }

    //Find a club page locators

//    protected final By searchLocator = By.id("club-search");
//    protected final By locationcardlocator1 = By.xpath("//*[@id=\"js-card-list__0\"]/div/div[1]/h3");
//    protected final By locationcardlocator2 = By.xpath("//*[@id=\"js-card-list__1\"]/div/div[1]/h3");
//    protected final By locationcardlocator3 = By.xpath("//*[@id=\"js-card-list__2\"]/div/div[1]/h3");
//    protected final By classschedulelocator = By.xpath("//*[@id=\"js-card-list__0\"]/div/div[2]/a[2]");
//    protected final By cslocationlocator = By.xpath("//*[@id=\"js-search-filter-change\"]/div[1]/span");

    By searchLocator = By.id("club-search");
    public WebElement searchLocator () {return driver.findElement(searchLocator);}

    By locationcardlocator1 = By.xpath("//*[@id=\"js-card-list__0\"]/div/div[1]/h3");
    public WebElement locationcardlocator1 () {return driver.findElement(locationcardlocator1);}

    By locationcardlocator2 = By.xpath("//*[@id=\"js-card-list__1\"]/div/div[1]/h3");
    public WebElement locationcardlocator2 () {return driver.findElement(locationcardlocator2);}

    By locationcardlocator3 = By.xpath ("//*[@id=\"js-card-list__2\"]/div/div[1]/h3");
    public WebElement locationcardlocator3 () {return driver.findElement(locationcardlocator3);}

    By classschedulelocator= By.xpath("//*[@id=\"js-card-list__0\"]/div/div[2]/a[2]");
    public WebElement classschedulelocator () {return driver.findElement(classschedulelocator);}

    By cslocationlocator = By.xpath("//*[@id=\"js-search-filter-change\"]/div[1]/span");
    public WebElement cslocationlocator () {return driver.findElement(cslocationlocator);}


    public void clubsearch() throws InterruptedException {

        //wait.until( ExpectedConditions.visibilityOfElementLocated(searchLocator) );
        Thread.sleep(2000);
        driver.findElement(searchLocator).click();
        driver.findElement(searchLocator).sendKeys("windor ON,canada");
        driver.findElement(searchLocator).sendKeys( Keys.ENTER );

        //Verifying first location card
        Thread.sleep(3000);
        String txt1 =  driver.findElement(locationcardlocator1).getText();
        Assert.assertEquals(txt1, "Windsor Ouellette For Women");

        //Verifying second location card
        Thread.sleep(3000);
        String txt2 =  driver.findElement(locationcardlocator2).getText();
        Assert.assertEquals(txt2, "Windsor Dougall And Cabana");

//        //Verifying third location card
        Thread.sleep(3000);
        String txt3 =  driver.findElement(locationcardlocator3).getText();
        Assert.assertEquals(txt3, "Windsor Tecumseh Mall");

        Thread.sleep(3000);
        driver.findElement(classschedulelocator).click();
        //verifying location on class schedule page
        String txt4 =  driver.findElement(cslocationlocator).getText();
        Assert.assertEquals(txt1, "Windsor Ouellette For Women");



    }

}
