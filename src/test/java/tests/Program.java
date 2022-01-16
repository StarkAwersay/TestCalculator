package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.mainPage;

public class Program {
    WebDriver driver = getChromeDriver.getChromeDriver();//Я вызвал хромдрайвер
    SoftAssert softAssert = new SoftAssert();
    mainPage mainPage = new mainPage(driver);

    @BeforeTest
    public void startBrowser() {
        driver.manage().window().maximize();
        driver.get("https://www.avito.ru/");
    }

    @Test
    public void findelements() {
        softAssert.assertTrue(mainPage.findSearchbar(), "Ошибка,не найдена поисковая строка");
        softAssert.assertTrue(mainPage.findMenu(), "Ошибка,не найдено меню");
        softAssert.assertTrue(mainPage.findSidebunner(), "Ошибка,не найден боковой баннер");
        softAssert.assertTrue(mainPage.findMiddlebanner(), "Ошибка,не найден центральный баннер");
        softAssert.assertTrue(mainPage.findRecommendations(), "Ошибка,не найден блок рекомендации");
        softAssert.assertAll();
    }

    @AfterTest
    public void close() {
        driver.close();
        System.out.println("Test close!");
    }

}
//input [@data-marker="search-form/suggest"]