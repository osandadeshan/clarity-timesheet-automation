import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Project Name    : clarity-timesheet-automation
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 5/16/2021
 * Time            : 11:31 AM
 * Description     :
 **/

public class TimesheetActions {

    private final WebDriver driver;
    private String submissionStatus;

    public TimesheetActions(WebDriver driver) {
        this.driver = driver;
    }

    protected TimesheetActions selectFirstTimeEntry() {
        driver.findElement(By.xpath("//tbody/following::a[@id='manageTimesheet'][1]")).click();
        return this;
    }

    protected TimesheetActions addProjectTask(String projectName, String taskName) {
        driver.findElement(By.xpath("//button[contains(text(),'Add Task')]")).click();
        driver.findElement(By.name("ff_task_name")).sendKeys(taskName);
        driver.findElement(By.name("ff_project_name")).sendKeys(projectName);
        Select assignDropdown = new Select(driver.findElement(By.name("ff_assigned")));
        assignDropdown.selectByVisibleText("All");
        driver.findElement(By.name("applyFilter")).click();
        TimesheetUtil.sleep(Constants.SLEEP_TIMEOUT, Constants.WAIT_UNTIL_SEARCH_RESULTS_APPEARED);
        TimesheetUtil.waitAndClick(driver, By.xpath("//td[text()='" + projectName
                + "']/preceding::td//input[@type='checkbox'][1]"));
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
        TimesheetUtil.waitAndClick(driver, By.xpath("//button[normalize-space()='Submit for Approval']"));
        setSubmissionStatus();

        return this;
    }

    public String getSubmissionStatus() {
        return submissionStatus;
    }

    private void setSubmissionStatus() {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIMEOUT))
                    .until(ExpectedConditions.titleIs(Constants.CLARITY_TIMESHEET_PAGE_TITLE));
            submissionStatus = Constants.SUBMISSION_SUCCESS;
        } catch (Exception e) {
            submissionStatus = Constants.SUBMISSION_FAILED;
        }
    }
}
