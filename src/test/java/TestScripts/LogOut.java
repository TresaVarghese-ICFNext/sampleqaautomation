package TestScripts;

import Pages.BasePage;
import Pages.LogInPage;
import Pages.LogOutPage;
import TestResources.FileReadWrite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class LogOut extends BasePage {

    @BeforeTest
    public void dummyBeforeTest() throws IOException {
        driver = initalizeDriver();
        driver.get(application);
        System.out.println("This is before class");
    }

    @Test
    public void logout() throws IOException, InterruptedException {

        driver.get(application+"Goodlifelogin.html");
        LogInPage loginpage = new LogInPage(driver);
        LogOutPage logoutpage = new LogOutPage(driver);
        loginpage.login();
        logoutpage.logout();
        System.out.println("Test Executed");

    }

    @AfterTest
    public void dummyAfterTest(){
        driver.quit();
        System.out.println("This is after class");
    }
}
