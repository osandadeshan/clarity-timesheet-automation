package com.wiley;

import javax.swing.*;
import java.awt.*;

import static com.wiley.Constants.*;
import static com.wiley.util.TimesheetUtil.getPropertyValue;

/**
 * Project Name    : clarity-timesheet-automation
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 6/16/2021
 * Time            : 9:54 PM
 * Description     :
 **/

public class TimesheetSubmissionStatusDialog extends JDialog {

    public TimesheetSubmissionStatusDialog(JFrame parent, String title, String message) {
        super(parent, title);

        JPanel messagePane = new JPanel();
        messagePane.add(new JLabel(message));
        getContentPane().add(messagePane);

        JPanel jPanel = new JPanel();
        JButton dialogBoxBtnOk = new JButton(SUBMISSION_DIALOG_BTN_OK);
        jPanel.add(dialogBoxBtnOk);

        if (title.equals(SUCCESS)) {
            dialogBoxBtnOk.addActionListener(x -> System.exit(0));
        } else {
            setIconImage(Toolkit.getDefaultToolkit().getImage(getPropertyValue(ERROR_ICON_PATH)));
            dialogBoxBtnOk.addActionListener(x -> dispose());
        }

        getContentPane().add(jPanel, BorderLayout.PAGE_END);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
