package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ClassSchedulePage extends BasePage{

    //Class Schedule locators
    // protected final By classesLocator = By.xpath("/html/body/div[1]/div/div[3]/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[4]/a");
    //    protected final By classdurationLocator = By.xpath( "//*[@id=\"js-classes-filter--duration\"]/fieldset/legend");
    //    protected final By classintensityLocator = By.xpath( "//*[@id=\"js-classes-filter--intensity\"]/fieldset/legend");
    //    protected final By classcategoryLocator = By.xpath("//*[@id=\"js-classes-filter--category\"]/fieldset/legend");
    //    protected final By classtypeLocator = By.xpath("//*[@id=\"js-classes-filter--type\"]/fieldset/legend");
    //    protected final By clubamenitiesLocator = By.xpath( "//*[@id=\"js-classes-filter--amenities\"]/fieldset/legend");
    //    protected final By classscheduletitleLocator = By.xpath("//*[@id=\"js-search-filter-options\"]/div[1]/h3");

    By classesLocator = By.xpath("/html/body/div[1]/div/div[3]/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[4]/a");
    public WebElement classesLocator () {return driver.findElement(classesLocator);}

    By classdurationLocator = By.xpath( "//*[@id=\"js-classes-filter--duration\"]/fieldset/legend");
    public WebElement classdurationLocator () {return driver.findElement(classdurationLocator);}

    By classintensityLocator = By.xpath("//*[@id=\"js-classes-filter--intensity\"]/fieldset/legend");
    public WebElement classintensityLocator () {return driver.findElement(classintensityLocator);}

    By classcategoryLocator = By.xpath("//*[@id=\"js-classes-filter--category\"]/fieldset/legend");
    public WebElement classcategoryLocator () {return driver.findElement(classcategoryLocator);}

    By classtypeLocator = By.xpath("//*[@id=\"js-classes-filter--type\"]/fieldset/legend");
    public WebElement classtypeLocator () {return driver.findElement(classtypeLocator);}

    By clubamenitiesLocator = By.xpath("//*[@id=\"js-classes-filter--amenities\"]/fieldset/legend");
    public WebElement clubamenitiesLocator () {return driver.findElement(clubamenitiesLocator);}

    By classscheduletitleLocator = By.xpath("//*[@id=\"js-search-filter-options\"]/div[1]/h3");
    public WebElement classscheduletitleLocator () {return driver.findElement(classscheduletitleLocator);}


    public WebDriver driver;

    public ClassSchedulePage(WebDriver driver) {
        this.driver = driver;
    }

    public void classschedule() throws InterruptedException {

        //clicking on class schedule button from classes page
        driver.findElement(classesLocator).click();

        //verify class schedule filters
        //wait.until( ExpectedConditions.visibilityOfElementLocated(classscheduletitleLocator) );
        Thread.sleep(2000);
        String txt1 =  driver.findElement(classscheduletitleLocator).getText();
        Assert.assertEquals(txt1, "Class Schedule Filters");

        //wait.until( ExpectedConditions.visibilityOfElementLocated(classdurationLocator) );
        Thread.sleep(2000);
        String txt2 =  driver.findElement(classdurationLocator).getText();
        Assert.assertEquals(txt2, "Class duration");

        //wait.until( ExpectedConditions.visibilityOfElementLocated(classintensityLocator) );
        Thread.sleep(2000);
        String txt3 =  driver.findElement(classintensityLocator).getText();
        Assert.assertEquals(txt3, "Class intensity");

        //wait.until( ExpectedConditions.visibilityOfElementLocated(classcategoryLocator) );
        Thread.sleep(2000);
        String txt4 =  driver.findElement(classcategoryLocator).getText();
        Assert.assertEquals(txt4, "Class category");

        //wait.until( ExpectedConditions.visibilityOfElementLocated(classtypeLocator) );
        String txt5 =  driver.findElement(classtypeLocator).getText();
        Assert.assertEquals(txt5, "Class type");

        //wait.until( ExpectedConditions.visibilityOfElementLocated(clubamenitiesLocator) );
        Thread.sleep(2000);
        String txt6 =  driver.findElement(clubamenitiesLocator).getText();
        Assert.assertEquals(txt6, "Club amenities");


    }
}
