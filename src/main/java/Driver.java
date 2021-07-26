import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Project Name    : clarity-timesheet-automation
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 5/16/2021
 * Time            : 11:36 AM
 * Description     :
 **/

public class Driver {

    private static WebDriver driver;

    public static void setUpDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addExtensions(TimesheetUtil.generateChromeBasicAuthExtension());
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().minimize();
        driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIMEOUT, SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIMEOUT, SECONDS);
        driver.get(TimesheetUtil.getPropertyValue(Constants.CLARITY_TIMESHEET_URL));
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void closeDriver() {
        try {
            if (driver != null) driver.quit();
        } catch (Exception ignored) {
        }
    }
}
