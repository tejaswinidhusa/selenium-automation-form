package selenium.java.task.driver;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

    ChromeDriverFactory chromeDriverFactory;

    public DriverFactory() {
        chromeDriverFactory = new ChromeDriverFactory();
    }

    public WebDriver createInstance() {
        return chromeDriverFactory.driver();
    }
}
