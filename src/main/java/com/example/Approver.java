package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.*;

public class Approver extends Main{

    @FXML Label displayIDLabel;
    @FXML Label eligibilityLabel;
    @FXML Label status;
    @FXML Button approve;
    @FXML Button eligibilityButton;
    @FXML Button requestID;


    private Form form;

    public Approver(){
    }

    @FXML protected void handleRequestID(ActionEvent event) {
        int id = App.workflowTable.next_approve_form();
        if (id == -1){
            displayIDLabel.setText("No more forms to approve.");
        }
        else{
            form = Form.getForm(id);
            displayIDLabel.setText("ID: " + form.getId()); 
            status.setVisible(true);
            approve.setVisible(true);
            eligibilityButton.setVisible(true);
            requestID.setVisible(false);
            status.setText("Unapproved");
        }
    }

    @FXML protected void checkEligibility(ActionEvent event) {
        try {
            if (form.getId() % 2 == 0) {
                eligibilityLabel.setText("Ineligible");
            } else {
                eligibilityLabel.setText("Eligible");
            }
            eligibilityButton.setVisible(false);
        } catch (NumberFormatException e) {
            eligibilityLabel.setText("Invalid Input");
        }    
    }

    @FXML protected void approve(ActionEvent event) {
        status.setText("Approved");
        approve.setVisible(false);
        requestID.setVisible(true);
        displayIDLabel.setText("");
        eligibilityLabel.setText("");
    }
}
