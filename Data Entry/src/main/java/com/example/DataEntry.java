package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.text.*;

public class DataEntry extends Main{
    @FXML Text feedback;
    @FXML TextField immigrantFirstName;
    @FXML TextField immigrantLastName;
    @FXML TextField immigrantAlienNumber;
    @FXML TextField relativeFirstName;
    @FXML TextField relativeLastName;
    @FXML TextField relativeAlienNumber;

    public DataEntry(){
        App.workflowTable = new WorkflowTable();
    }

    @FXML protected void handleSubmitButtonAction(ActionEvent event) throws IOException{
        if (immigrantFirstName.getText().equals("") ||
            immigrantLastName.getText().equals("") ||
            immigrantAlienNumber.getText().equals("") ||
            relativeFirstName.getText().equals("") ||
            relativeLastName.getText().equals("") ||
            relativeAlienNumber.getText().equals("")){
            
            feedback.setText("One or more of the fields are empty");
            App.setRoot("approver");
            return;
        }
        feedback.setText("Submitted");
        // Form form = new Form(immigrantFirstName.getText(), immigrantLastName.getText(), immigrantAlienNumber.getText(), relativeFirstName.getText(),relativeLastName.getText(), relativeAlienNumber.getText());
        // workflowTable.add_review_form(form.getId());
    }
}
