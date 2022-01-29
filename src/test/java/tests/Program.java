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
        WebElement SearchBar =driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div/div[2]/div/div/div"));
        WebElement Menu =driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div/div[1]/div"));
        WebElement Sidebunner =driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        WebElement Middlebanner =driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[1]/div"));
        WebElement Recomendations =driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[2]/div[2]/div[2]/div/div"));

    }
    @Test(priority = 2)
    public void click(){
        WebElement Realty = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[1]/div/div[2]/div[3]"));
        Realty.click();
        WebElement Apartments = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[2]/div[1]/div[1]/ul/li/ul/li[2]"));
        Apartments.click();
        WebElement Map = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[3]/div[3]/div[1]"));
        WebElement NewApartPanel = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[3]/div[3]/div[2]"));
        WebElement RecomendationPanel = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[3]/div[3]/div[5]/div[1]"));
        WebElement BuyOrRentPanel = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[3]/div[1]/div/div[2]/div[1]/form/div[2]/div"));
        WebElement RoomsPanel = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[3]/div[1]/div/div[2]/div[1]/form/div[3]/div"));
        WebElement PricePanel = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[3]/div[1]/div/div[2]/div[1]/form/div[4]/div"));
        WebElement NovetlyPanel = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[3]/div[1]/div/div[2]/div[1]/form/div[5]/div"));
        WebElement SizePanel = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[3]/div[1]/div/div[2]/div[1]/form/div[6]/div"));
        WebElement SizeKitchenPanel = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[3]/div[1]/div/div[2]/div[1]/form/div[6]/div"));
        WebElement BalconyPanel = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[3]/div[1]/div/div[2]/div[1]/form/div[8]/div"));
        WebElement TypeRoomsPanel = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[3]/div[1]/div/div[2]/div[1]/form/div[9]/div"));
        WebElement ApartFloorPanel = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[3]/div[1]/div/div[2]/div[1]/form/div[10]/div"));
        WebElement FloorsHousePanel = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[3]/div[1]/div/div[2]/div[1]/form/div[11]/div"));
        WebElement TypeRoomPanel = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[3]/div[1]/div/div[2]/div[1]/form/div[13]/div"));
        WebElement TypeHousePanel = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[3]/div[1]/div/div[2]/div[1]/form/div[13]/div"));
        WebElement SellersPanel = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[3]/div[1]/div/div[2]/div[1]/form/div[15]/div"));
        WebElement CountAdsPanel = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[3]/div[1]/div/div[2]/div[2]"));
    }


    @AfterTest
    public void close() {
        driver.close();
        System.out.println("Test close!");
    }

}
//input [@data-marker="search-form/suggest"]