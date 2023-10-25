package runner.browser_manager;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxDriverManager extends DriverManager{

    @Override
    public void createDriver(){
        FirefoxOptions options = new FirefoxOptions();
        options.addPreference("dom.webnotifications.enabled", false); // Disable web notifications
        options.addPreference("permissions.default.desktop-notification", 2); // Block desktop notifications
        System.setProperty("webdriver.chrome.driver","src/test/resources/geckodriver/geckodriver.exe");
        driver = new FirefoxDriver(options);
    }
}
