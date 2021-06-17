import javax.swing.*;
import java.awt.*;

/**
 * Project Name    : clarity-timesheet-automation
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 5/29/2021
 * Time            : 6:12 PM
 * Description     :
 **/

public class TimesheetApp {

    private final JFrame frame;
    private final JPanel panel = new JPanel();
    private final Font font = new Font(Constants.FONT_NAME, Font.PLAIN, 18);
    private JTextField txtProjectName;
    private JTextField txtTaskName;
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
        frame = new JFrame(Constants.APP_NAME);
        frame.setSize(710, 440);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(TimesheetUtil.getPropertyValue(Constants.APP_ICON_PATH)));
        frame.add(panel);
        panel.setLayout(null);

        setProjectNameRow();
        setTaskNameRow();
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

    private void setProjectNameRow() {
        JLabel lblProjectName = new JLabel(Constants.LBL_PROJECT_NAME);
        lblProjectName.setBounds(10, 20, 300, 25);
        lblProjectName.setFont(font);
        panel.add(lblProjectName);

        txtProjectName = new JTextField();
        txtProjectName.setBounds(200, 20, 500, 25);
        txtProjectName.setFont(font);
        txtProjectName.setText(TimesheetUtil.getPropertyValue(Constants.PROJECT_NAME));
        panel.add(txtProjectName);
    }

    private void setTaskNameRow() {
        JLabel lblTaskName = new JLabel(Constants.LBL_TASK_NAME);
        lblTaskName.setBounds(10, 60, 300, 25);
        lblTaskName.setFont(font);
        panel.add(lblTaskName);

        txtTaskName = new JTextField();
        txtTaskName.setBounds(200, 60, 500, 25);
        txtTaskName.setFont(font);
        txtTaskName.setText(TimesheetUtil.getPropertyValue(Constants.TASK_NAME));
        panel.add(txtTaskName);
    }

    private void setHoursTypesHeadingRow() {
        JLabel lblProjectHours = new JLabel(Constants.LBL_PROJECT_HOURS);
        lblProjectHours.setBounds(200, 120, 150, 25);
        lblProjectHours.setFont(font);
        panel.add(lblProjectHours);

        JLabel lblOooHours = new JLabel(Constants.LBL_OOO_HOURS);
        lblOooHours.setBounds(400, 120, 200, 25);
        lblOooHours.setFont(font);
        panel.add(lblOooHours);
    }

    private void setMondayRow() {
        JLabel lblMonday = new JLabel(Constants.LBL_MONDAY);
        lblMonday.setBounds(10, 160, 200, 25);
        lblMonday.setFont(font);
        panel.add(lblMonday);

        txtMondayProjectHours = new JTextField();
        txtMondayProjectHours.setBounds(200, 160, 150, 25);
        txtMondayProjectHours.setFont(font);
        panel.add(txtMondayProjectHours);

        txtMondayOooHours = new JTextField();
        txtMondayOooHours.setBounds(400, 160, 150, 25);
        txtMondayOooHours.setFont(font);
        panel.add(txtMondayOooHours);
    }

    private void setTuesdayRow() {
        JLabel lblTuesday = new JLabel(Constants.LBL_TUESDAY);
        lblTuesday.setBounds(10, 200, 200, 25);
        lblTuesday.setFont(font);
        panel.add(lblTuesday);

        txtTuesdayProjectHours = new JTextField();
        txtTuesdayProjectHours.setBounds(200, 200, 150, 25);
        txtTuesdayProjectHours.setFont(font);
        panel.add(txtTuesdayProjectHours);

        txtTuesdayOooHours = new JTextField();
        txtTuesdayOooHours.setBounds(400, 200, 150, 25);
        txtTuesdayOooHours.setFont(font);
        panel.add(txtTuesdayOooHours);
    }

    private void setWednesdayRow() {
        JLabel lblWednesday = new JLabel(Constants.LBL_WEDNESDAY);
        lblWednesday.setBounds(10, 240, 200, 25);
        lblWednesday.setFont(font);
        panel.add(lblWednesday);

        txtWednesdayProjectHours = new JTextField();
        txtWednesdayProjectHours.setBounds(200, 240, 150, 25);
        txtWednesdayProjectHours.setFont(font);
        panel.add(txtWednesdayProjectHours);

        txtWednesdayOooHours = new JTextField();
        txtWednesdayOooHours.setBounds(400, 240, 150, 25);
        txtWednesdayOooHours.setFont(font);
        panel.add(txtWednesdayOooHours);
    }

    private void setThursdayRow() {
        JLabel lblThursday = new JLabel(Constants.LBL_THURSDAY);
        lblThursday.setBounds(10, 280, 200, 25);
        lblThursday.setFont(font);
        panel.add(lblThursday);

        txtThursdayProjectHours = new JTextField();
        txtThursdayProjectHours.setBounds(200, 280, 150, 25);
        txtThursdayProjectHours.setFont(font);
        panel.add(txtThursdayProjectHours);

        txtThursdayOooHours = new JTextField();
        txtThursdayOooHours.setBounds(400, 280, 150, 25);
        txtThursdayOooHours.setFont(font);
        panel.add(txtThursdayOooHours);
    }

    private void setFridayRow() {
        JLabel lblFriday = new JLabel(Constants.LBL_FRIDAY);
        lblFriday.setBounds(10, 320, 200, 25);
        lblFriday.setFont(font);
        panel.add(lblFriday);

        txtFridayProjectHours = new JTextField();
        txtFridayProjectHours.setBounds(200, 320, 150, 25);
        txtFridayProjectHours.setFont(font);
        panel.add(txtFridayProjectHours);

        txtFridayOooHours = new JTextField();
        txtFridayOooHours.setBounds(400, 320, 150, 25);
        txtFridayOooHours.setFont(font);
        panel.add(txtFridayOooHours);
    }

    private void setDefaultValues() {
        txtMondayProjectHours.setText(Constants.DEFAULT_PROJECT_HOURS);
        txtMondayOooHours.setText(Constants.DEFAULT_OOO_HOURS);

        txtTuesdayProjectHours.setText(Constants.DEFAULT_PROJECT_HOURS);
        txtTuesdayOooHours.setText(Constants.DEFAULT_OOO_HOURS);

        txtWednesdayProjectHours.setText(Constants.DEFAULT_PROJECT_HOURS);
        txtWednesdayOooHours.setText(Constants.DEFAULT_OOO_HOURS);

        txtThursdayProjectHours.setText(Constants.DEFAULT_PROJECT_HOURS);
        txtThursdayOooHours.setText(Constants.DEFAULT_OOO_HOURS);

        txtFridayProjectHours.setText(Constants.DEFAULT_HALF_DAY_HOURS);
        txtFridayOooHours.setText(Constants.DEFAULT_HALF_DAY_HOURS);
    }

    private void setSubmitButton() {
        JButton btnSubmit = new JButton(Constants.BTN_SUBMIT);
        btnSubmit.setBounds(380, 370, 100, 25);
        btnSubmit.setFont(font);

        btnSubmit.addActionListener(e -> {
            String submissionStatus;

            try {
                Driver.setUpDriver();

                submissionStatus = new TimesheetActions(Driver.getDriver())
                        .selectFirstTimeEntry()
                        .addProjectTask(txtProjectName.getText(), txtTaskName.getText())
                        .addOutOfOfficeTask()
                        .enterTimeAndSubmit(txtMondayProjectHours.getText(), txtMondayOooHours.getText(),
                                txtTuesdayProjectHours.getText(), txtTuesdayOooHours.getText(),
                                txtWednesdayProjectHours.getText(), txtWednesdayOooHours.getText(),
                                txtThursdayProjectHours.getText(), txtThursdayOooHours.getText(),
                                txtFridayProjectHours.getText(), txtFridayOooHours.getText())
                        .getSubmissionStatus();

            } catch (Exception ex) {
                submissionStatus = Constants.SUBMISSION_FAILED;
            }

            TimesheetSubmissionStatusDialog dialog = new TimesheetSubmissionStatusDialog(frame,
                    submissionStatus.equals(Constants.SUBMISSION_SUCCESS)
                            ? Constants.SUCCESS : Constants.FAILED, submissionStatus);
            dialog.setSize(400, 120);

            Driver.closeDriver();
        });

        panel.add(btnSubmit);
    }

    private void setResetButton() {
        JButton btnExit = new JButton(Constants.BTN_RESET);
        btnExit.setBounds(490, 370, 100, 25);
        btnExit.setFont(font);
        btnExit.addActionListener(e -> setDefaultValues());
        panel.add(btnExit);
    }

    private void setExitButton() {
        JButton btnExit = new JButton(Constants.BTN_EXIT);
        btnExit.setBounds(600, 370, 100, 25);
        btnExit.setFont(font);
        btnExit.addActionListener(e -> System.exit(0));
        panel.add(btnExit);
    }
}
