# Clarity Timesheet Automation
## Introduction
This is a Java Swing Application used to automate the ClarityPPM timesheet submission.

[![Clarity Timesheet Submission Application](https://user-images.githubusercontent.com/9147189/122388261-56e33000-cf8d-11eb-857e-fd2cba77ad08.png "Clarity Timesheet Submission Application")](https://user-images.githubusercontent.com/9147189/122388261-56e33000-cf8d-11eb-857e-fd2cba77ad08.png "Clarity Timesheet Submission Application")

## Prerequisites
* Java 8
* Maven

## Steps to use
1. Clone this project
2. Navigate to "***<project_home_dir>/src/main/resources/config.properties***" and update it
3. Steps 4 to 10 are needed only if you are getting ***Basic Authentication popup*** when navigating to the Clarity Timesheet application
4. Download "***AutoIt Full Installation***" from the official website of AutoIT (https://www.autoitscript.com/site/autoit/downloads/)
5. Navigate to "***<project_home_dir>/src/main/resources/autoIt.au3***"
6. Right-click on it and click "***Edit Script***"
7. Update ***"1st***" and "***3rd***" lines from your Clarity Account username and password
   
    Example:
   
       Send("osanda")
       Send("{TAB}")
       Send("ThisIsCool!")
       Send("{ENTER}")
   
8. Save the file
9. Now, to convert the script to an executable file, Right-click on the saved file and click "***Compile Script***"
10. You will see an executable file has been created
11. Navigate to the project home directory
12. Double-click on "***build-timesheet-submission-app.bat***"
13. Double-click on "***launch-app.vbs***"
14. Add your time records using the GUI
15. Click on "***Submit***" button
16. Wait for the confirmation dialog box

![Successful Submission](https://user-images.githubusercontent.com/9147189/122388106-2dc29f80-cf8d-11eb-8b65-aaf76b6fbcbb.png)
