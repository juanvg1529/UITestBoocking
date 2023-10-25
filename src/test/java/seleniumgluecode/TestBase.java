package seleniumgluecode;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import pom.BookingPage;
import pom.HomePage;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;
    private  static  int numberOfCases= 0;
    private DriverManager driverManager;

    protected HomePage homePage = new HomePage(driver);
    protected BookingPage bookingPage = new BookingPage(driver);
    protected ScenarioContext scenarioContext;


    public void setup(){

        numberOfCases++;
        System.out.println("The scenary execution is nbr = "+numberOfCases);
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.booking.com/index.es.html");
        driver.manage().window().maximize();
        scenarioContext = new ScenarioContext();
        homePage= new HomePage(driver);
        scenarioContext.setContext("homePage",homePage);

    }

    public void tearDown(){
        driverManager.quitDriver();
    }

    public  WebDriver getDriver(){
        System.out.println("The scenario nbr = "+numberOfCases+" it-s correctly executed");
        return  driver;
    }

}
