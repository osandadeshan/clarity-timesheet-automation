package com.wiley.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Instant;
import java.util.Properties;

import static com.wiley.Constants.CONFIG_PROPERTY_FILE_PATH;
import static java.time.temporal.ChronoUnit.SECONDS;

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
        try (InputStream input = new FileInputStream(CONFIG_PROPERTY_FILE_PATH)) {
            Properties prop = new Properties();
            prop.load(input);
            propertyValue = prop.getProperty(propertyName);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return propertyValue;
    }

    public static void sleep(String reason) {
        Instant waitEndTime = Instant.now().plus(5, SECONDS);
        while (Instant.now().isBefore(waitEndTime)) {
            Instant oneSecondAfterNowTime = Instant.now().plus(1, SECONDS);
            while (Instant.now().isBefore(oneSecondAfterNowTime)) {
                System.out.println(reason);
            }
        }
    }
}
