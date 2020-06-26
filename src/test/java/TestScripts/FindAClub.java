package TestScripts;

import Pages.BasePage;
import Pages.FindAClubPage;
import TestResources.FileReadWrite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class FindAClub extends BasePage {

    @BeforeTest
    public void dummyBeforeTest() throws IOException {
        driver = initalizeDriver();
        driver.get(application);
        System.out.println("This is before class");
    }

    @Test
    public void findaclub() throws IOException, InterruptedException {

        driver.get(application+"clubs.html");
        FindAClubPage clubpage = new FindAClubPage(driver);
        clubpage.clubsearch();
        System.out.println("Test Executed");

    }
    @AfterTest
    public void dummyAfterTest(){
        driver.quit();
        System.out.println("This is after class");
    }
}
