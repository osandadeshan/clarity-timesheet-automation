import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

/**
 * Project Name    : clarity-timesheet-automation
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 5/16/2021
 * Time            : 11:26 AM
 * Description     :
 **/

public class TimesheetUtil {

    public static String getPropertyValue(String propertyName) {
        String propertyValue = null;
        try (InputStream input = TimesheetUtil.class.getClassLoader()
                .getResourceAsStream(Constants.CONFIG_PROPERTY_FILE_NAME)) {
            Properties prop = new Properties();
            prop.load(input);
            propertyValue = prop.getProperty(propertyName);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return propertyValue;
    }

    public static void waitAndClick(WebDriver driver, By by) {
        new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIMEOUT))
                .until(ExpectedConditions.elementToBeClickable(by));
        driver.findElement(by).click();
    }

    public static void sleep(int timeOutInSeconds, String reason) {
        try {
            System.out.println(reason);
            Thread.sleep(timeOutInSeconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
