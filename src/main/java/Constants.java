/**
 * Project Name    : clarity-timesheet-automation
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 5/29/2021
 * Time            : 8:45 AM
 * Description     :
 **/

public class Constants {

    // Property file constants
    public static final String CONFIG_PROPERTY_FILE_PATH = "./src/main/resources/config.properties";
    public static final String APP_ICON_PATH = "appIconPath";
    public static final String ERROR_ICON_PATH = "errorIconPath";
    public static final String AUTOIT_EXECUTABLE_PATH = "autoItExecutablePath";
    public static final String CLARITY_TIMESHEET_URL = "clarityTimesheetUrl";
    public static final String PROJECT_NAME = "projectName";
    public static final String TASK_NAME = "taskName";

    // Wait timeouts
    public static final int IMPLICIT_WAIT_TIMEOUT = 120;
    public static final int EXPLICIT_WAIT_TIMEOUT = 60;
    public static final int PAGE_LOAD_TIMEOUT = 120;
    public static final int SLEEP_TIMEOUT = 5;

    // Page titles
    public static final String CLARITY_TIMESHEET_PAGE_TITLE = "Clarity PPM :: Timesheets";

    // Sleep reasons
    public static final String WAIT_UNTIL_SEARCH_RESULTS_APPEARED = "Search results are being appearing ....";

    // Submission statuses
    public static final String FAILED = "Failed";
    public static final String SUBMISSION_FAILED = "Clarity Timesheet submission is failed!";
    public static final String SUBMISSION_SUCCESS = "Successfully submitted Clarity Timesheet for this week!";
    public static final String SUCCESS = "Success";

    // GUI constants
    public static final String APP_NAME = "Wiley Clarity Timesheet Submission";
    public static final String FONT_NAME = "SansSerif";
    public static final String LBL_PROJECT_NAME = "Project Name";
    public static final String LBL_TASK_NAME = "Task Name";
    public static final String LBL_PROJECT_HOURS = "Project Hours";
    public static final String LBL_OOO_HOURS = "Out of Office Hours";
    public static final String LBL_MONDAY = "Monday";
    public static final String LBL_TUESDAY = "Tuesday";
    public static final String LBL_WEDNESDAY = "Wednesday";
    public static final String LBL_THURSDAY = "Thursday";
    public static final String LBL_FRIDAY = "Friday";
    public static final String BTN_SUBMIT = "Submit";
    public static final String BTN_EXIT = "Exit";
    public static final String BTN_RESET = "Reset";
    public static final String SUBMISSION_DIALOG_BTN_OK = "OK";

    // Default values
    public static final String DEFAULT_PROJECT_HOURS = "8";
    public static final String DEFAULT_OOO_HOURS = "0";
    public static final String DEFAULT_HALF_DAY_HOURS = "4";
}
