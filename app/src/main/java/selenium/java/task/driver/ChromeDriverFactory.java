package selenium.java.task.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverFactory {

    public ChromeDriverFactory() {
        this.buildChromeOptions();
    }

    private void buildChromeOptions() {
        System.setProperty("webdriver.chrome.driver",
                "/Users/tejaswini/workspace/java-selenium-tutorialspoint/app/src/main/resources/chromedriver");
    }

    WebDriver driver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

}
