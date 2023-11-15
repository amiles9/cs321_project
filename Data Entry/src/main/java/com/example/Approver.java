package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.text.*;

public class Approver extends Main{
    @FXML Text feedback;
    @FXML TextField immigrantFirstName;
    @FXML TextField immigrantLastName;
    @FXML TextField immigrantAlienNumber;
    @FXML TextField relativeFirstName;
    @FXML TextField relativeLastName;
    @FXML TextField relativeAlienNumber;

    @FXML Label displayIDLabel;
    @FXML Label eligibilityLabel;
    @FXML Label updateStatusLabel;
    @FXML Label status;

    @FXML TextField inputField;
    @FXML TextField idInputField;
    @FXML TextField eligibilityInputField;

    // Form form;

    public Approver(){
    }

    @FXML protected void handleRequestID(ActionEvent event) {
        // form = Form.getForm(App.workflowTable.next_approve_form());
        // displayIDLabel.setText("Next ID: " + form.getId());
    }

    @FXML protected void checkEligibility(ActionEvent event) {
        // try {
        //     if (Form.getId() % 2 == 0) {
        //         eligibilityLabel.setText("Ineligible");
        //     } else {
        //         eligibilityLabel.setText("Eligible");
        //     }
        // } catch (NumberFormatException e) {
        //     eligibilityLabel.setText("Invalid Input");
        // }    
    }

    @FXML protected void approve(ActionEvent event) {
        status.setText("Approved");
    }

    // @FXML protected void update(ActionEvent event) {
    //     String id = idInputField.getText();
    //     String eligibility = eligibilityInputField.getText();
    //     updateStatusLabel.setText("Updated");
    // }
}
