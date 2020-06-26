package TestScripts;

import Pages.BasePage;
import Pages.ClassSchedulePage;
import TestResources.FileReadWrite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ClassSchedule extends BasePage {

    @BeforeTest
    public void dummyBeforeTest() throws IOException {
        driver = initalizeDriver();
        driver.get(application);
        System.out.println("This is before class");
    }

    @Test
    public void classschedule() throws IOException, InterruptedException {

        driver.get(application+"classes.html");
        ClassSchedulePage classSchedule = new ClassSchedulePage(driver);
        classSchedule.classschedule();
        System.out.println("Test Executed");

    }

    @AfterTest
    public void dummyAfterTest(){
        driver.quit();
        System.out.println("This is after class");
    }

}
