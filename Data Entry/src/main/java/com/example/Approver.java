package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.text.*;

public class Approver {
    @FXML Text feedback;
    @FXML TextField immigrantFirstName;
    @FXML TextField immigrantLastName;
    @FXML TextField immigrantAlienNumber;
    @FXML TextField relativeFirstName;
    @FXML TextField relativeLastName;
    @FXML TextField relativeAlienNumber;
    WorkflowTable a;

    @FXML Label displayIDLabel;
    @FXML Label eligibilityLabel;
    @FXML Label updateStatusLabel;

    @FXML TextField inputField;
    @FXML TextField idInputField;
    @FXML TextField eligibilityInputField;

    public Approver(){
        a = new WorkflowTable();
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML protected void handleRequestID(ActionEvent event) {
        displayIDLabel.setText("Next ID: " + a.next_approve_form());
    }

    @FXML protected void checkEligibility(ActionEvent event) {
        try {
            int input = Integer.parseInt(inputField.getText());
            if (input % 2 == 0) {
                eligibilityLabel.setText("Ineligible");
            } else {
                eligibilityLabel.setText("Eligible");
            }
        } catch (NumberFormatException e) {
            eligibilityLabel.setText("Invalid Input");
        }    
    }

    @FXML protected void update(ActionEvent event) {
        displayIDLabel.setText("Next ID: " + a.next_approve_form());
        String id = idInputField.getText();
        String eligibility = eligibilityInputField.getText();
        updateStatusLabel.setText("Updated");
    }
}
