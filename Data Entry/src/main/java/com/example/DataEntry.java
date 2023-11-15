package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
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

    @FXML Button submit;

    public DataEntry(){
    }

    @FXML protected void handleSubmitButtonAction(ActionEvent event) throws IOException{
        if (!checkFields()){
            feedback.setText("One or more of the fields are empty");
            return;
        }
        createForm();
    }
    
    @FXML protected boolean checkFields(){
        if (immigrantFirstName.getText().equals("") ||
            immigrantLastName.getText().equals("") ||
            immigrantAlienNumber.getText().equals("") ||
            relativeFirstName.getText().equals("") ||
            relativeLastName.getText().equals("") ||
            relativeAlienNumber.getText().equals("")){
            return false;
        }
        return true;
    }

    @FXML protected void createForm(){
        feedback.setText("Submitted");
        Form form = new Form(immigrantFirstName.getText(), immigrantLastName.getText(), immigrantAlienNumber.getText(), relativeFirstName.getText(),relativeLastName.getText(), relativeAlienNumber.getText());
        App.workflowTable.add_approve_form(form.getId());
        submit.setVisible(false);
    }
}
