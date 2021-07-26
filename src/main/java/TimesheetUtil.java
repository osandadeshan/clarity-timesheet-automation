import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

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
        try (InputStream input = new FileInputStream(Constants.CONFIG_PROPERTY_FILE_PATH)) {
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

    public static File generateChromeBasicAuthExtension() {
        List<File> files = new ArrayList<>();
        files.add(new File("./src/main/resources/authHandler.js"));
        files.add(new File("./src/main/resources/manifest.json"));

        File zipFile = new File("./src/main/resources/credentials_extension.zip");

        byte[] buf = new byte[1024];

        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(zipFile));

            for (File file : files) {
                FileInputStream in = new FileInputStream(file.getCanonicalFile());
                zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                int len;
                while ((len = in.read(buf)) > 0) {
                    zipOutputStream.write(buf, 0, len);
                }
                zipOutputStream.closeEntry();
                in.close();
            }

            zipOutputStream.close();

        } catch (IOException ex) {
            System.err.println("Creating 'credentials_extension.zip' is failed!\n" + ex.getMessage());
        }

        return zipFile;
    }
}
