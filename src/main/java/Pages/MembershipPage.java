package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

import java.util.Iterator;
import java.util.Set;


public class MembershipPage extends BasePage{

    public WebDriver driver;

    public MembershipPage(WebDriver driver) {
        this.driver = driver;

    }



    By joinnowLocator =  By.xpath("//*[@id=\"Membershiptypes\"]/div[1]/div/div[2]/div[1]/div/div/a");
    public WebElement joinnowLocator () {return driver.findElement(joinnowLocator);}

    By firstnameLocator= By.id("firstName");
    public WebElement firstnameLocator() {return driver.findElement(firstnameLocator);}

    By lastnameLocator = By.id("lastName");
    public WebElement lastnameLocator () {return driver.findElement(lastnameLocator );}

    By emailaddressLocator = By.id("//*[@id=\"header-path\"]/div[2]/span/span/a[3]");
    public WebElement emailaddressLocator () {return driver.findElement(emailaddressLocator );}

    By birthdateLocator = By.id("birthDate");
    public WebElement birthdateLocator () {return driver.findElement(birthdateLocator);}

    By phonenumberLocator = By.id("phoneNumber");
    public WebElement phonenumberLocator () {return driver.findElement(phonenumberLocator );}

    By genderLocator = By.id("gender");
    public WebElement genderLocator () {return driver.findElement(genderLocator);}

    By addressLocator = By.id("address");
    public WebElement addressLocator () {return driver.findElement(addressLocator );}

    By postalcodeLocator  = By.xpath("postalCode");
    public WebElement postalcodeLocator  () {return driver.findElement(postalcodeLocator);}

    By cityLocator = By.xpath("city");
    public WebElement cityLocator () {return driver.findElement(cityLocator);}

    By provinceLocator = By.id("province");
    public WebElement provinceLocator () {return driver.findElement(provinceLocator );}

    By emergencycontactnameLocator  = By.id("emergencyContactName");
    public WebElement emergencycontactnameLocator  () {return driver.findElement(emergencycontactnameLocator  );}

    By emergencycontactphoneLocator = By.id("emergencyContactPhone");
    public WebElement emergencycontactphoneLocator () {return driver.findElement(emergencycontactphoneLocator);}

    By nextLocator = By.id("pageOneSubmit");
    public WebElement nextLocator () {return driver.findElement(nextLocator);}

    By acceptLocator = By.id("c-btn-cta js-accept-button");
    public WebElement acceptLocator () {return driver.findElement(acceptLocator );}

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

    By buymembershipLocator  = By.className("c-btn-cta c-membership--page-two__submit js-buy-membership-submit");
    public WebElement buymembershipLocator  () {return driver.findElement(buymembershipLocator);}

    By ccLocator = By.xpath("/html/body/div[1]/div/div[3]/div/div/div[6]/div/div[1]/div[1]/div[2]/div/div[2]");
    public WebElement ccLocator() {return driver.findElement(ccLocator);}

    By ccnumberLocator  = By.id("monerisDataInput");
    public WebElement ccnumberLocator () {return driver.findElement(ccnumberLocator );}

    By ccexpiryLocator = By.id("monerisExpInput");
    public WebElement ccexpiryLocator () {return driver.findElement(ccexpiryLocator );}

    By ccsecurityLocator  = By.className("monerisCVDInput");
    public WebElement ccsecurityLocator () {return driver.findElement(ccsecurityLocator);}

    By payjoningfeeLocator  = By.className("c-btn-cta c-membership--credit-flow-step-two__submit");
    public WebElement payjoningfeeLocator () {return driver.findElement(payjoningfeeLocator);}

    By termsLocator = By.xpath("/html/body/div[1]/div/div[3]/div/div/div[4]/div[2]");
    public WebElement termsLocator() {return driver.findElement(termsLocator);}






    //choose membership - Bank payment
    public void bankPayment() throws InterruptedException {

        //wait.until( ExpectedConditions.visibilityOfElementLocated(joinnowLocator) );
        Thread.sleep(2000);
        driver.findElement(joinnowLocator).click();
        //sending keys to personal information form
        Thread.sleep(3000);
       // wait.until( ExpectedConditions.visibilityOfElementLocated(firstnameLocator));
        driver.findElement(firstnameLocator).click();
        driver.findElement(firstnameLocator).sendKeys("test");
        driver.findElement(lastnameLocator).click();
        driver.findElement(lastnameLocator).sendKeys("olson");
        driver.findElement(emailaddressLocator).click();
        driver.findElement(emailaddressLocator).sendKeys("olsonqa@gmail.com");
        driver.findElement(birthdateLocator).click();
        driver.findElement(birthdateLocator).sendKeys("01-01-1980");
        driver.findElement(phonenumberLocator).click();
        driver.findElement(phonenumberLocator).sendKeys("9059793864");
        driver.findElement(genderLocator).click();
        driver.findElement(genderLocator).sendKeys("female");
        driver.findElement(addressLocator).click();
        driver.findElement(addressLocator).sendKeys("400 university ave");
        driver.findElement(postalcodeLocator).click();
        driver.findElement(postalcodeLocator).sendKeys("M7A 1T7");
        driver.findElement(cityLocator).click();
        driver.findElement(cityLocator).sendKeys("toronto");
        driver.findElement(provinceLocator).click();
        driver.findElement(provinceLocator).sendKeys("ontario");
        driver.findElement(emergencycontactnameLocator).click();
        driver.findElement(emergencycontactnameLocator).sendKeys("test");
        driver.findElement(emergencycontactphoneLocator).click();
        driver.findElement(emergencycontactphoneLocator).sendKeys("9059793864");
        //click next
        driver.findElement(emergencycontactphoneLocator).sendKeys(Keys.ENTER);

        //Accept terms of conditions
        Thread.sleep(2000);
        tandcwindoow();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

//       // Alert alert = driver.switchTo().alert();
//        String termsandconditions = driver.getWindowHandle();
//        driver.switchTo().window(termsandconditions);
//

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("scrollIntoView();", acceptLocator);

        //wait.until(ExpectedConditions.elementToBeClickable(acceptLocator));
        Thread.sleep(2000);
        driver.findElement(acceptLocator).click();

        //select pay with credit card redio button
        driver.findElement(ccLocator).click();
        driver.findElement(ccnumberLocator).click();
        driver.findElement(ccnumberLocator).sendKeys("4502285070000007");
        driver.findElement(ccexpiryLocator).click();
        driver.findElement(ccexpiryLocator).sendKeys("1120");
        driver.findElement(ccsecurityLocator).click();
        driver.findElement(ccsecurityLocator).sendKeys("123");
        //wait.until(ExpectedConditions.elementToBeClickable(payjoningfeeLocator));
        Thread.sleep(2000);
        driver.findElement(payjoningfeeLocator).click();

        //Calling bank information method
        bankInformation();



    }

    //choose membership - credit card payment
    public void ccPayment() throws InterruptedException {

        //wait.until( ExpectedConditions.visibilityOfElementLocated(joinnowLocator) );
        Thread.sleep(2000);
        driver.findElement(joinnowLocator).click();
        //sending keys to personal information form
        //wait.until( ExpectedConditions.visibilityOfElementLocated(firstnameLocator));
        Thread.sleep(2000);
        driver.findElement(firstnameLocator).click();
        driver.findElement(firstnameLocator).sendKeys("test");
        driver.findElement(lastnameLocator).click();
        driver.findElement(lastnameLocator).sendKeys("olson");
        driver.findElement(emailaddressLocator).click();
        driver.findElement(emailaddressLocator).sendKeys("olsonqa@gmail.com");
        driver.findElement(birthdateLocator).click();
        driver.findElement(birthdateLocator).sendKeys("01-01-1980");
        driver.findElement(phonenumberLocator).click();
        driver.findElement(phonenumberLocator).sendKeys("9059793864");
        driver.findElement(genderLocator).click();
        driver.findElement(genderLocator).sendKeys("female");
        driver.findElement(addressLocator).click();
        driver.findElement(addressLocator).sendKeys("400 university ave");
        driver.findElement(postalcodeLocator).click();
        driver.findElement(postalcodeLocator).sendKeys("M7A 1T7");
        driver.findElement(cityLocator).click();
        driver.findElement(cityLocator).sendKeys("toronto");
        driver.findElement(provinceLocator).click();
        driver.findElement(provinceLocator).sendKeys("ontario");
        driver.findElement(emergencycontactnameLocator).click();
        driver.findElement(emergencycontactnameLocator).sendKeys("test");
        driver.findElement(emergencycontactphoneLocator).click();
        driver.findElement(emergencycontactphoneLocator).sendKeys("9059793864");

        driver.findElement(emergencycontactphoneLocator).sendKeys(Keys.ENTER);
        //click next
        //wait.until(ExpectedConditions.elementToBeClickable(nextLocator));
        Thread.sleep(2000);

        //Accept terms of conditions
        String termsandconditions = driver.getWindowHandle();
        driver.switchTo().window(termsandconditions);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");


        //wait.until(ExpectedConditions.elementToBeClickable(acceptLocator));
        Thread.sleep(2000);
        driver.findElement(acceptLocator).click();

        //Calling bank information method
        bankInformation();



    }

    public void bankInformation() throws InterruptedException {

        //wait.until(ExpectedConditions.elementToBeClickable(branchLocator));
        Thread.sleep(2000);
        driver.findElement(branchLocator).click();
        driver.findElement(branchLocator).sendKeys("12345");
        driver.findElement(institutionLocator ).click();
        driver.findElement(institutionLocator ).sendKeys("12");
        driver.findElement(accountnoLocator).click();
        driver.findElement(accountnoLocator).sendKeys("123456");
        driver.findElement(confirmaccountnoLocator).click();
        driver.findElement(confirmaccountnoLocator).sendKeys("123456");
        driver.findElement(accountholdernameLocator).click();
        driver.findElement(accountholdernameLocator).sendKeys("test");
        //wait.until(ExpectedConditions.elementToBeClickable(buymembershipLocator));
        Thread.sleep(2000);
        driver.findElement(buymembershipLocator).click();
    }

    public void tandcwindoow() {
        String parentWindowHandler = driver.getWindowHandle();
        String subWindowHandler = null;

        Set<String> handles = driver.getWindowHandles();
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()){
            subWindowHandler = iterator.next();
            driver.switchTo().window(subWindowHandler);

            System.out.println(subWindowHandler);
        }
    }




}



