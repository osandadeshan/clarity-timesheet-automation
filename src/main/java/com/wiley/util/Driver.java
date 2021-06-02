package com.wiley.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

import static com.wiley.Constants.*;
import static com.wiley.util.TimesheetUtil.getPropertyValue;
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

    private static ChromeDriver driver;

    public static void setUpDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--window-size=1920x1080");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT_TIMEOUT, SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, SECONDS);
        driver.get(getPropertyValue(CLARITY_TIMESHEET_URL));
        if (Boolean.parseBoolean(getPropertyValue(IS_BASIC_AUTHENTICATION_NEEDED))) {
            try {
                Runtime.getRuntime().exec(getPropertyValue(AUTOIT_EXECUTABLE_PATH));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static ChromeDriver getDriver() {
        return driver;
    }

    public static void closeDriver() {
        try {
            if (driver != null) driver.quit();
        } catch (Exception ignored) {
        }
    }
}
