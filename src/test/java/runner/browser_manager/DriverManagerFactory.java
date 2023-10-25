package runner.browser_manager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import  runner.browser_manager.DriverManager;

public class DriverManagerFactory {


    public static DriverManager getManager(DriverType type){

        DriverManager driverManager= null;
        switch (type){
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case FIREFOX:
                driverManager= new FirefoxDriverManager();
                        break;
        }
        return driverManager;
    }



}
