package TestScripts;

import Pages.BasePage;
import Pages.MembershipPage;
import TestResources.FileReadWrite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class BuyMembership extends BasePage {

    @BeforeTest
    public void dummyBeforeTest() throws IOException {
        driver = initalizeDriver();
        driver.get(application);
        System.out.println("This is before class");
    }

    @Test
    public void buyMembership1() throws IOException, InterruptedException {

        driver.get(application+"membership.html");
        MembershipPage membershippage;
        membershippage = new MembershipPage(driver);
        membershippage.bankPayment();
        System.out.println("Test Executed");


    }

    @Test
    public void buyMembership2() throws IOException, InterruptedException {

        driver.get(application+"membership.html");
        MembershipPage membershippage = new MembershipPage(driver);
        membershippage.ccPayment();
        System.out.println("Test Executed");


    }

    @AfterTest
    public void dummyAfterTest(){
        driver.quit();
        System.out.println("This is after class");
    }
}



