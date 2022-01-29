package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Program {
    WebDriver driver = getChromeDriver.getChromeDriver();//Я вызвал хромдрайвер

    @BeforeTest
    public void startBrowser() {
        driver.manage().window().maximize();
        driver.get("https://www.avito.ru/");
    }


    @Test(priority = 1)
    public void findelements() {
        WebElement SearchBar = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div/div[2]/div/div/div"));
        WebElement Menu = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div/div[1]/div"));
        WebElement Sidebunner = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        WebElement Middlebanner = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[1]/div"));
        WebElement Recomendations = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[2]/div[2]/div[2]/div/div"));

    }

    @AfterTest
    public void close() {
        driver.close();
        System.out.println("Test close!");
    }

}
//input [@data-marker="search-form/suggest"]