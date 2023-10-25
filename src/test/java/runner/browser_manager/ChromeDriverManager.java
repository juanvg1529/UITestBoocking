package runner.browser_manager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager extends DriverManager{
    @Override
    public void createDriver(){
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver(options);

    }
}
