package com.wiley;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.wiley.Constants.*;
import static com.wiley.util.TimesheetUtil.sleep;

/**
 * Project Name    : clarity-timesheet-automation
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 5/16/2021
 * Time            : 11:31 AM
 * Description     :
 **/

public class TimesheetActions {

    private final ChromeDriver driver;
    private String submissionStatus;

    public TimesheetActions(ChromeDriver driver) {
        this.driver = driver;
    }

    protected TimesheetActions selectFirstTimeEntry() {
        driver.findElement(By.xpath("//tbody/following::a[@id='manageTimesheet'][1]")).click();
        return this;
    }

    protected TimesheetActions addProjectTask(String taskName) {
        driver.findElement(By.xpath("//button[contains(text(),'Add Task')]")).click();
        driver.findElement(By.xpath("//input[@type='checkbox'][@title='" + taskName + "']")).click();
        driver.findElement(By.xpath("//div[@class='ppm_button_bar']/following::button[1]")).click();
        return this;
    }

    protected TimesheetActions addOutOfOfficeTask() {
        driver.findElement(By.xpath("//button[contains(text(),'Add Other Time')]")).click();
        driver.findElement(By.xpath("//input[@type='checkbox'][@title='Out of Office']")).click();
        driver.findElement(By.xpath("//div[@class='ppm_button_bar']/following::button[1]")).click();
        return this;
    }

    protected TimesheetActions enterTimeAndSubmit(String mondayProjectTime, String mondayOooTime,
                                                  String tuesdayProjectTime, String tuesdayOooTime,
                                                  String wednesdayProjectTime, String wednesdayOooTime,
                                                  String thursdayProjectTime, String thursdayOooTime,
                                                  String fridayProjectTime, String fridayOooTime) {
        driver.findElement(By.xpath("(//input[contains(@alt, 'Mon')])[1]")).sendKeys(mondayProjectTime);
        driver.findElement(By.xpath("(//input[contains(@alt, 'Mon')])[2]")).sendKeys(mondayOooTime);

        driver.findElement(By.xpath("(//input[contains(@alt, 'Tue')])[1]")).sendKeys(tuesdayProjectTime);
        driver.findElement(By.xpath("(//input[contains(@alt, 'Tue')])[2]")).sendKeys(tuesdayOooTime);

        driver.findElement(By.xpath("(//input[contains(@alt, 'Wed')])[1]")).sendKeys(wednesdayProjectTime);
        driver.findElement(By.xpath("(//input[contains(@alt, 'Wed')])[2]")).sendKeys(wednesdayOooTime);

        driver.findElement(By.xpath("(//input[contains(@alt, 'Thu')])[1]")).sendKeys(thursdayProjectTime);
        driver.findElement(By.xpath("(//input[contains(@alt, 'Thu')])[2]")).sendKeys(thursdayOooTime);

        driver.findElement(By.xpath("(//input[contains(@alt, 'Fri')])[1]")).sendKeys(fridayProjectTime);
        driver.findElement(By.xpath("(//input[contains(@alt, 'Fri')])[2]")).sendKeys(fridayOooTime);

        driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
        sleep(WAIT_UNTIL_TIMESHEET_SAVED);
        driver.findElement(By.xpath("//button[normalize-space()='Submit for Approval']")).click();
        sleep(WAIT_UNTIL_TIMESHEET_SUBMITTED);
        setSubmissionStatus();

        return this;
    }

    public String getSubmissionStatus() {
        return submissionStatus;
    }

    private void setSubmissionStatus() {
        WebElement filterButton = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
        WebElement showAllButton = driver.findElement(By.xpath("//button[normalize-space()='Show All']"));
        WebElement clearButton = driver.findElement(By.xpath("//button[normalize-space()='Clear']"));

        submissionStatus = !(filterButton.isDisplayed() && showAllButton.isDisplayed() && clearButton.isDisplayed())
                ? SUBMISSION_FAILED : SUBMISSION_SUCCESS;
    }
}
