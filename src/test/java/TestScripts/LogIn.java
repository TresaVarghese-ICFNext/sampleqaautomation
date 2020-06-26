package TestScripts;

import Pages.BasePage;
import Pages.LogInPage;
import TestResources.FileReadWrite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class LogIn extends BasePage {

    @BeforeTest
    public void beforeTest() throws IOException {
        driver = initalizeDriver();
        driver.get(application);
        System.out.println("This is before class");
    }

    @Test

    public void login() throws IOException, InterruptedException  {

        driver.get(application+"Goodlifelogin.html");
        LogInPage loginpage = new LogInPage(driver);
        loginpage.login();
        System.out.println("Test Executed");

    }

    @AfterTest
    public void dummyAfterTest(){
        driver.quit();
        System.out.println("This is after class");
    }
}
