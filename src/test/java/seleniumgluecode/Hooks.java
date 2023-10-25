package seleniumgluecode;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;


import java.util.concurrent.TimeUnit;

public class Hooks {

    private static WebDriver driver;
    private  static  int numberOfCases= 0;
    private DriverManager driverManager;


    public void setup(){

        numberOfCases++;
        System.out.println("The scenary execution is nbr = "+numberOfCases);
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.booking.com/index.es.html");
        driver.manage().window().maximize();

    }

    public void tearDown(){
        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        System.out.println("The scenario nbr = "+numberOfCases+" it-s correctly executed");
        return  driver;
    }
}
