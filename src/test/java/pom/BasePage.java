package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public  BasePage(WebDriver driver){
        this.driver = driver;
        this.wait= new WebDriverWait(driver,Duration.ofSeconds(5));
    }

    public WebDriverWait getWait() {
        return wait;
    }
    public void click(By element) throws Exception {

        try{
        driver.findElement(element).click();
    } catch ( Exception e){
            throw new Exception(" The element wasn't able to click "+element);
        }
    }

    public void sendKeys( By element, String text) throws Exception{
        try{
            driver.findElement(element).sendKeys(text);
        }catch (Exception e){
            throw new Exception("The text was unavailable to sent to element "+element);
        }
    }



    public boolean isDisplayed(By element) throws Exception{
        try{
           return driver.findElement(element).isDisplayed();
        } catch ( Exception e){
            throw new Exception(" The element isn't displayed "+element);
        }

    }
    public String getText(By element) throws Exception{
        try{
             return driver.findElement(element).getText();
        } catch ( Exception e){
            throw new Exception(" The text from the element wasn't able to get "+element);
        }

    }
    public String getTitle() throws Exception{
        try{
             return driver.getTitle();
        } catch ( Exception e){
            throw new Exception(" The title from the element wasn't able to get ");
        }
    }

    public boolean isElementClickable(By element, int time){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return true;
    }

    public void waitUntilElement(By element ,int seconds ){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
    }
}
