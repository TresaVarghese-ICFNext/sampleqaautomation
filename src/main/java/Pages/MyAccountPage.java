package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;

public class MyAccountPage extends BasePage {

    public WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    By classesLocator = By.xpath("//*[@id=\"section_classes\"]/div/div[1]/div[1]");
    public WebElement classesLocator () {return driver.findElement(classesLocator );}

    By clubsLocator  = By.xpath("/html/body/div[1]/div/div[3]/div/div[3]/aside/ul/li[2]/a/span[2]");
    public WebElement clubsLocator () {return driver.findElement(clubsLocator );}

    By rewardsLocator  = By.xpath( "/html/body/div[1]/div/div[3]/div/div[3]/aside/ul/li[3]/a");
    public WebElement rewardsLocator () {return driver.findElement(rewardsLocator );}

    By profileLocator = By.xpath( "/html/body/div[1]/div/div[3]/div/div[3]/aside/ul/li[4]/a");
    public WebElement profileLocator() {return driver.findElement(profileLocator);}

    By clubstitleLocator  = By.xpath( "//*[@id=\"my-favourite-club-container\"]/div/div/div" );
    public WebElement clubstitleLocator  () {return driver.findElement(clubstitleLocator);}

    By addLocator= By.xpath( "//*[@id=\"js-all-my-clubs-cards\"]/li/div/div[1]/div" );
    public WebElement addLocator () {return driver.findElement(addLocator);}

    By searchLocator  =  By.xpath( "//*[@id=\"location-search\"]");
    public WebElement searchLocator () {return driver.findElement(searchLocator );}

    By locationLocator  = By.xpath( "///*[@id=\"js-location-results\"]/div[2]/div");
    public WebElement locationLocator () {return driver.findElement(locationLocator );}

    By cancelLocator = By.xpath("//*[@id=\"js-all-my-clubs-cards\"]/li[1]/div[2]/div/div[1]/div/button");
    public WebElement cancelLocator() {return driver.findElement(cancelLocator);}

    By removeLocator = By.xpath("//*[@id=\"section_clubs\"]/div[3]/div/div/div[2]/button[1]");
    public WebElement removeLocator () {return driver.findElement(removeLocator);}

    By rewardtitleLocator  =  By.xpath("//*[@id=\"section_rewards\"]/div/h2");
    public WebElement rewardtitleLocator  () {return driver.findElement(rewardtitleLocator);}

    By  profiletitleLocator = By.xpath("//*[@id=\"section_profile\"]/div/div[2]/div[1]/h2");
    public WebElement  profiletitleLocator () {return driver.findElement( profiletitleLocator);}

    By editinformationLocator = By.xpath("//*[@id=\"section_profile\"]/div/div[2]/div[1]/p[5]/button[1]");
    public WebElement editinformationLocator() {return driver.findElement(editinformationLocator);}

    By emergencycontactnameLocator = By.id("emergencyContactName");
    public WebElement emergencycontactnameLocator () {return driver.findElement(emergencycontactnameLocator);}

    By emergencycontactphoneLocator = By.id("emergencyContactPhone");
    public WebElement emergencycontactphoneLocator () {return driver.findElement(emergencycontactphoneLocator);}

    By saveLocator= By.xpath("//*[@id=\"section_profile\"]/div/div[4]/div[2]/form/div[6]/button[1]");
    public WebElement saveLocator () {return driver.findElement(saveLocator);}

    By editpaymentLocator = By.xpath("//*[@id=\"section_profile\"]/div/div[2]/div[3]/button");
    public WebElement editpaymentLocator () {return driver.findElement(editpaymentLocator);}

    By branchLocator =By.xpath("//*[@id=\"section_profile\"]/div/div[5]/div[2]/form/div[1]/div[1]/div[1]/div/input");
    public WebElement branchLocator() {return driver.findElement(branchLocator );}

    By institutionLocator  = By.xpath("//*[@id=\"section_profile\"]/div/div[5]/div[2]/form/div[1]/div[1]/div[2]/div/input");
    public WebElement institutionLocator  () {return driver.findElement(institutionLocator);}

    By accountnoLocator  = By.xpath("//*[@id=\"section_profile\"]/div/div[5]/div[2]/form/div[1]/div[2]/div[1]/div/input");
    public WebElement accountnoLocator () {return driver.findElement(accountnoLocator);}

    By confirmaccountnoLocator = By.xpath("//*[@id=\"section_profile\"]/div/div[5]/div[2]/form/div[1]/div[2]/div[2]/div/input");
    public WebElement confirmaccountnoLocator () {return driver.findElement(confirmaccountnoLocator);}

    By accountholdernameLocator  = By.xpath("//*[@id=\"section_profile\"]/div/div[5]/div[2]/form/div[1]/div[3]/div/div/input");
    public WebElement accountholdernameLocator () {return driver.findElement(accountholdernameLocator);}

    By savebankinfoLocator = By.xpath("//*[@id=\"section_profile\"]/div/div[5]/div[2]/form/div[2]/button[1]");
    public WebElement savebankinfoLocator () {return driver.findElement(savebankinfoLocator);}

    By subscription =  By.xpath("//*[@id=\"section_profile\"]/div/div[2]/div[6]/a");

    public WebElement subscription() {return driver.findElement(subscription);}

    By subscriptiontitle =  By.xpath("/html/body/div[1]/div/div[3]/div/div/div[1]/h1");
    public WebElement subscriptiontitle () {return driver.findElement(subscriptiontitle);}






//*[@id="section_profile"]/div/div[2]/div[3]/button

    public void myaccount() throws InterruptedException {

        //Verifying classes tab

        //wait.until( ExpectedConditions.visibilityOfElementLocated(classesLocator) );
        Thread.sleep(2000);
        String txt =  driver.findElement(classesLocator).getText();
        Assert.assertEquals(txt, "My booked classes");

//        //Verifying Clubs tab and adding clubs favorite list
//        driver.findElement(clubsLocator).click();
//        //wait.until( ExpectedConditions.visibilityOfElementLocated(clubstitleLocator) );
//        Thread.sleep(2000);
//        String txt1 =  driver.findElement(clubstitleLocator).getText();
//        Assert.assertEquals(txt1, "My Clubs");
//
//        // verify if add icon is displayed or not
//        if ((driver.findElement(addLocator)).isDisplayed()) {
//            addclub();
//        }
//        else{
//            //remove one location from the list
//            driver.findElement(cancelLocator).click();
//            //wait.until( ExpectedConditions.visibilityOfElementLocated(removeLocator));
//            Thread.sleep(2000);
//            driver.findElement(removeLocator).click();
//        }

        //Verify rewards tab
        Thread.sleep(2000);
        driver.findElement(rewardsLocator).click();
        String txt2 =  driver.findElement(rewardtitleLocator).getText();
        Assert.assertEquals(txt2, "Featured rewards");

        //Verifying profile tab
        profile();



    }

    public void profile() throws InterruptedException {
        driver.findElement(profileLocator).click();
        //wait.until( ExpectedConditions.visibilityOfElementLocated(profiletitleLocator));
        Thread.sleep(2000);
        String txt3 =  driver.findElement(profiletitleLocator).getText();
        Assert.assertEquals(txt3, "My profile");

        //Edit personal information
        //wait.until( ExpectedConditions.visibilityOfElementLocated(editinformationLocator));
        Thread.sleep(2000);
        driver.findElement(editinformationLocator).click();
        //wait.until( ExpectedConditions.visibilityOfElementLocated(emergencycontactnameLocator));
        Thread.sleep(2000);
        driver.findElement(emergencycontactnameLocator).click();
        driver.findElement(emergencycontactnameLocator).clear();
        driver.findElement(emergencycontactnameLocator).sendKeys("test");
        driver.findElement(emergencycontactphoneLocator).click();
        driver.findElement(emergencycontactphoneLocator).clear();
        driver.findElement(emergencycontactphoneLocator).sendKeys("9059793864");
        driver.findElement(emergencycontactphoneLocator).sendKeys(Keys.ENTER);

        //edit payment information
        //wait.until( ExpectedConditions.visibilityOfElementLocated(editpaymentLocator));
        Thread.sleep(4000);
        driver.findElement(editpaymentLocator).click();
        Thread.sleep(2000);
        driver.findElement(branchLocator).click();
        driver.findElement(branchLocator).sendKeys("12345");
        driver.findElement(institutionLocator ).click();
        driver.findElement(institutionLocator ).sendKeys("123");
        driver.findElement(accountnoLocator).click();
        driver.findElement(accountnoLocator).sendKeys("12345678");
        driver.findElement(confirmaccountnoLocator).click();
        driver.findElement(confirmaccountnoLocator).sendKeys("12345678");
        driver.findElement(accountholdernameLocator).click();
        driver.findElement(accountholdernameLocator).sendKeys("test");
        //wait.until(ExpectedConditions.elementToBeClickable(savebankinfoLocator));
        Thread.sleep(2000);
        driver.findElement(accountholdernameLocator).sendKeys(Keys.ENTER);

        // Subscriptions
        Thread.sleep(3000);
        driver.findElement(subscription).click();
        Thread.sleep(4000);

        String txt4 = driver.getCurrentUrl();
        Assert.assertEquals(txt4, "https://prod.goodlifefitness.com/subscription.html");

        //verify title
        String txt5 = driver.findElement(subscriptiontitle).getText();
        Assert.assertEquals(txt5, "Subscription Preference Centre");



    }
    public void addclub() throws InterruptedException {
        driver.findElement(addLocator).click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(classesLocator));
        Thread.sleep(2000);
        driver.findElement(searchLocator).click();
        driver.findElement(searchLocator).sendKeys("Toronto");
        driver.findElement(searchLocator).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(searchLocator).sendKeys(Keys.ENTER);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(locationLocator));
        Thread.sleep(3000);
        driver.findElement(locationLocator).click();

    }


}
