# Clarity Timesheet Automation
## Introduction
This is a Java Swing Application used to automate the ClarityPPM timesheet submission.

[![Clarity Timesheet Submission Application](https://user-images.githubusercontent.com/9147189/120097946-d335e080-c150-11eb-91ec-231a110c4000.png "Clarity Timesheet Submission Application")](https://user-images.githubusercontent.com/9147189/120097946-d335e080-c150-11eb-91ec-231a110c4000.png "Clarity Timesheet Submission Application")

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
12. Double-click on "***building-timesheet-submission-app.bat***"
13. Double-click on "***launch-app.vbs***"
14. Add your time records using the GUI
15. Click on "***Submit***" button

![Successful Submission](https://user-images.githubusercontent.com/9147189/120162428-fecece80-c215-11eb-9a95-7361c5290d87.PNG)
