package TestScripts;

import Pages.BasePage;
import Pages.LogInPage;
import Pages.MyAccountPage;
import TestResources.FileReadWrite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class MyAccount extends BasePage {


    @BeforeTest
    public void dummyBeforeTest() throws IOException {
        driver = initalizeDriver();
        driver.get(application);
        System.out.println("This is before class");
    }

    @Test
    public void myAccount() throws IOException, InterruptedException {

        driver.get(application+"Goodlifelogin.html");
        MyAccountPage myaccount = new MyAccountPage(driver);
        LogInPage loginpage = new LogInPage(driver);
        loginpage.login();
        myaccount.myaccount();
        System.out.println("Test Executed");

    }


    @AfterTest
    public void dummyAfterTest(){
        driver.quit();
        System.out.println("This is after class");
    }
}

