import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

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
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--window-size=1920x1080");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIMEOUT, SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIMEOUT, SECONDS);
        driver.get(TimesheetUtil.getPropertyValue(Constants.CLARITY_TIMESHEET_URL));
        try {
            Runtime.getRuntime().exec(TimesheetUtil.getPropertyValue(Constants.AUTOIT_EXECUTABLE_PATH));
        } catch (IOException e) {
            e.printStackTrace();
        }
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
