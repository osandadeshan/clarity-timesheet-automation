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
3. If you are getting ***Basic Authentication popup*** when navigating to the Clarity Timesheet application, 
   Go to "***<project_home_dir>/src/main/resources/authHandler.js***" and update "***username***" and "***password***" on 1st and 2nd lines
4. Double-click on "***<project_home_dir>/build-timesheet-submission-app.bat***"
5. Double-click on "***<project_home_dir>/launch-app.vbs***"
6. Add your time records using the GUI
7. Click on "***Submit***" button
8. Wait for the confirmation dialog box

![Successful Submission](https://user-images.githubusercontent.com/9147189/122388106-2dc29f80-cf8d-11eb-8b65-aaf76b6fbcbb.png)
