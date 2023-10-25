package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {



    private By advertisementElement = By.className("f7c2c6294c");
    private By closeButtonAd= By.xpath("//*[@id=\"b2indexPage\"]/div[17]/div/div/div/div[1]/div[1]/div/button");

    public HomePage(WebDriver driver){
        super(driver);
    }



    public BookingPage closeAdvertisement(WebDriver driver){
        waitUntilElement(advertisementElement,5);
        WebElement adElement=driver.findElement(advertisementElement);
        if( adElement.isDisplayed()){
            if(isElementClickable(closeButtonAd,5))
            {
                adElement.findElement(closeButtonAd).click();
            }
        }
        return new BookingPage(driver);
    }







}
