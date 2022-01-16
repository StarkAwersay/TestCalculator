package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mainPage extends PageFactory {
    private WebDriver driver;

    public mainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/div[2]/div/div[2]/div/div/div")
    private WebElement searchBar;
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/div[2]/div/div[1]/div")
    private WebElement menu;
    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div[2]/div[1]/div[1]/div[1]")
    private WebElement sideBanner;
    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div[1]/div")
    private WebElement middleBanner;
    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div[2]/div[2]/div[2]/div/div")
    private WebElement recommendations;

    public Boolean findRecommendations() {
        try {
            return recommendations.isDisplayed();
        } catch (Exception e) {
            return Boolean.FALSE;
        }
    }

    public Boolean findMiddlebanner() {
        try {
            return middleBanner.isDisplayed();
        } catch (Exception e) {
            return Boolean.FALSE;
        }
    }

    public Boolean findSidebunner() {
        try {
            return sideBanner.isDisplayed();
        } catch (Exception e) {
            return Boolean.FALSE;
        }
    }

    public Boolean findMenu() {
        try {
            return menu.isDisplayed();
        } catch (Exception e) {
            return Boolean.FALSE;
        }
    }

    public Boolean findSearchbar() {
        try {
            return searchBar.isDisplayed();
        } catch (Exception e) {
            return Boolean.FALSE;
        }
    }
}
