package com.wiley;

import javax.swing.*;
import java.awt.*;

import static com.wiley.Constants.*;
import static com.wiley.util.Driver.*;
import static com.wiley.util.TimesheetUtil.getPropertyValue;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 * Project Name    : clarity-timesheet-automation
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 5/29/2021
 * Time            : 6:12 PM
 * Description     :
 **/

public class TimesheetApp {

    private final JPanel panel = new JPanel();
    private final Font font = new Font(FONT_NAME, Font.PLAIN, 18);
    private JTextField txtProjectTaskName;
    private JTextField txtMondayProjectHours;
    private JTextField txtMondayOooHours;
    private JTextField txtTuesdayProjectHours;
    private JTextField txtTuesdayOooHours;
    private JTextField txtWednesdayProjectHours;
    private JTextField txtWednesdayOooHours;
    private JTextField txtThursdayProjectHours;
    private JTextField txtThursdayOooHours;
    private JTextField txtFridayProjectHours;
    private JTextField txtFridayOooHours;

    public TimesheetApp() {
        JFrame frame = new JFrame(APP_NAME);
        frame.setSize(710, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getPropertyValue(APP_ICON_PATH)));
        frame.add(panel);
        panel.setLayout(null);

        setProjectTaskNameRow();
        setHoursTypesHeadingRow();

        setMondayRow();
        setTuesdayRow();
        setWednesdayRow();
        setThursdayRow();
        setFridayRow();

        setDefaultValues();

        setSubmitButton();
        setResetButton();
        setExitButton();

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new TimesheetApp();
    }

    private void setProjectTaskNameRow() {
        JLabel lblProjectTaskName = new JLabel(LBL_PROJECT_TASK_NAME);
        lblProjectTaskName.setBounds(10, 20, 300, 25);
        lblProjectTaskName.setFont(font);
        panel.add(lblProjectTaskName);

        txtProjectTaskName = new JTextField();
        txtProjectTaskName.setBounds(200, 20, 500, 25);
        txtProjectTaskName.setFont(font);
        txtProjectTaskName.setText(getPropertyValue(PROJECT_TASK_NAME));
        panel.add(txtProjectTaskName);
    }

    private void setHoursTypesHeadingRow() {
        JLabel lblProjectHours = new JLabel(LBL_PROJECT_HOURS);
        lblProjectHours.setBounds(200, 80, 150, 25);
        lblProjectHours.setFont(font);
        panel.add(lblProjectHours);

        JLabel lblOooHours = new JLabel(LBL_OOO_HOURS);
        lblOooHours.setBounds(400, 80, 200, 25);
        lblOooHours.setFont(font);
        panel.add(lblOooHours);
    }

    private void setMondayRow() {
        JLabel lblMonday = new JLabel(LBL_MONDAY);
        lblMonday.setBounds(10, 120, 200, 25);
        lblMonday.setFont(font);
        panel.add(lblMonday);

        txtMondayProjectHours = new JTextField();
        txtMondayProjectHours.setBounds(200, 120, 150, 25);
        txtMondayProjectHours.setFont(font);
        panel.add(txtMondayProjectHours);

        txtMondayOooHours = new JTextField();
        txtMondayOooHours.setBounds(400, 120, 150, 25);
        txtMondayOooHours.setFont(font);
        panel.add(txtMondayOooHours);
    }

    private void setTuesdayRow() {
        JLabel lblTuesday = new JLabel(LBL_TUESDAY);
        lblTuesday.setBounds(10, 160, 200, 25);
        lblTuesday.setFont(font);
        panel.add(lblTuesday);

        txtTuesdayProjectHours = new JTextField();
        txtTuesdayProjectHours.setBounds(200, 160, 150, 25);
        txtTuesdayProjectHours.setFont(font);
        panel.add(txtTuesdayProjectHours);

        txtTuesdayOooHours = new JTextField();
        txtTuesdayOooHours.setBounds(400, 160, 150, 25);
        txtTuesdayOooHours.setFont(font);
        panel.add(txtTuesdayOooHours);
    }

    private void setWednesdayRow() {
        JLabel lblWednesday = new JLabel(LBL_WEDNESDAY);
        lblWednesday.setBounds(10, 200, 200, 25);
        lblWednesday.setFont(font);
        panel.add(lblWednesday);

        txtWednesdayProjectHours = new JTextField();
        txtWednesdayProjectHours.setBounds(200, 200, 150, 25);
        txtWednesdayProjectHours.setFont(font);
        panel.add(txtWednesdayProjectHours);

        txtWednesdayOooHours = new JTextField();
        txtWednesdayOooHours.setBounds(400, 200, 150, 25);
        txtWednesdayOooHours.setFont(font);
        panel.add(txtWednesdayOooHours);
    }

    private void setThursdayRow() {
        JLabel lblThursday = new JLabel(LBL_THURSDAY);
        lblThursday.setBounds(10, 240, 200, 25);
        lblThursday.setFont(font);
        panel.add(lblThursday);

        txtThursdayProjectHours = new JTextField();
        txtThursdayProjectHours.setBounds(200, 240, 150, 25);
        txtThursdayProjectHours.setFont(font);
        panel.add(txtThursdayProjectHours);

        txtThursdayOooHours = new JTextField();
        txtThursdayOooHours.setBounds(400, 240, 150, 25);
        txtThursdayOooHours.setFont(font);
        panel.add(txtThursdayOooHours);
    }

    private void setFridayRow() {
        JLabel lblFriday = new JLabel(LBL_FRIDAY);
        lblFriday.setBounds(10, 280, 200, 25);
        lblFriday.setFont(font);
        panel.add(lblFriday);

        txtFridayProjectHours = new JTextField();
        txtFridayProjectHours.setBounds(200, 280, 150, 25);
        txtFridayProjectHours.setFont(font);
        panel.add(txtFridayProjectHours);

        txtFridayOooHours = new JTextField();
        txtFridayOooHours.setBounds(400, 280, 150, 25);
        txtFridayOooHours.setFont(font);
        panel.add(txtFridayOooHours);
    }

    private void setDefaultValues() {
        txtMondayProjectHours.setText(DEFAULT_PROJECT_HOURS);
        txtMondayOooHours.setText(DEFAULT_OOO_HOURS);

        txtTuesdayProjectHours.setText(DEFAULT_PROJECT_HOURS);
        txtTuesdayOooHours.setText(DEFAULT_OOO_HOURS);

        txtWednesdayProjectHours.setText(DEFAULT_PROJECT_HOURS);
        txtWednesdayOooHours.setText(DEFAULT_OOO_HOURS);

        txtThursdayProjectHours.setText(DEFAULT_PROJECT_HOURS);
        txtThursdayOooHours.setText(DEFAULT_OOO_HOURS);

        txtFridayProjectHours.setText(DEFAULT_HALF_DAY_HOURS);
        txtFridayOooHours.setText(DEFAULT_HALF_DAY_HOURS);
    }

    private void setSubmitButton() {
        JButton btnSubmit = new JButton(BTN_SUBMIT);
        btnSubmit.setBounds(380, 330, 100, 25);
        btnSubmit.setFont(font);

        btnSubmit.addActionListener(e -> {
            String submissionStatus;
            int messageType;

            try {
                setUpDriver();

                submissionStatus = new TimesheetActions(getDriver())
                        .selectFirstTimeEntry()
                        .addProjectTask(txtProjectTaskName.getText())
                        .addOutOfOfficeTask()
                        .enterTimeAndSubmit(txtMondayProjectHours.getText(), txtMondayOooHours.getText(),
                                txtTuesdayProjectHours.getText(), txtTuesdayOooHours.getText(),
                                txtWednesdayProjectHours.getText(), txtWednesdayOooHours.getText(),
                                txtThursdayProjectHours.getText(), txtThursdayOooHours.getText(),
                                txtFridayProjectHours.getText(), txtFridayOooHours.getText())
                        .getSubmissionStatus();

                messageType = submissionStatus.equals(SUBMISSION_SUCCESS) ? INFORMATION_MESSAGE : ERROR_MESSAGE;
            } catch (Exception ex) {
                submissionStatus = SUBMISSION_FAILED;
                messageType = ERROR_MESSAGE;
            }

            closeDriver();

            JOptionPane.showMessageDialog(null, submissionStatus, SUBMISSION_DIALOG_BOX_TITLE,
                    messageType);
        });

        panel.add(btnSubmit);
    }

    private void setResetButton() {
        JButton btnExit = new JButton(BTN_RESET);
        btnExit.setBounds(490, 330, 100, 25);
        btnExit.setFont(font);
        btnExit.addActionListener(e -> setDefaultValues());
        panel.add(btnExit);
    }

    private void setExitButton() {
        JButton btnExit = new JButton(BTN_EXIT);
        btnExit.setBounds(600, 330, 100, 25);
        btnExit.setFont(font);
        btnExit.addActionListener(e -> System.exit(0));
        panel.add(btnExit);
    }
}
