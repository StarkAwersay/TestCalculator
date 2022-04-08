package tests;

import Pages.searchPage;
import getChromeDriver.getChromeDriver;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import static Constants.constant.Urls.*;



public class TestCalculator {
    private WebDriver driver;
    private searchPage sp;


    @BeforeTest
    public void BeforeTest() {
        driver = getChromeDriver.getChromeDriver();
        driver.manage().window().maximize();
        sp = new searchPage(driver);
    }


    @Test
    @Description("Первый тест")
    public void Test1() {
        driver.get(REAL_HOME_PAGE);
        sp.searchCalculator();
        sp.calcTestOne();
        String task = sp.task.getText();
        String result = sp.result.getText();
        Assert.assertEquals(task, TASK_ONE);
        Assert.assertEquals(result, RESULT_ONE);
    }


    @Test
    @Description("Второй тест")
    public void Test2() {
        driver.get(REAL_HOME_PAGE);
        sp.searchCalculator();
        sp.calcTestTwo();
        String task = sp.task.getText();
        String result = sp.result.getText();
        Assert.assertEquals(task, TASK_TWO);
        Assert.assertEquals(result, RESULT_TWO);
    }

    @Test
    @Description("Третий тест")
    public void Test3() {
        driver.get(REAL_HOME_PAGE);
        sp.searchCalculator();
        sp.calcTestThree();
        String task = sp.task.getText();
        String result = sp.result.getText();
        Assert.assertEquals(task, TASK_THREE);
        Assert.assertEquals(result, RESULT_THREE);
    }

    @AfterTest
    public void close() {
        driver.close();
        System.out.println("Test close!");
    }
}
