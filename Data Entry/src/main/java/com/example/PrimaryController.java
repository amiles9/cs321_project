package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.text.*;

public class PrimaryController {
    @FXML Text feedback;
    @FXML TextField immigrantFirstName;
    @FXML TextField immigrantLastName;
    @FXML TextField immigrantAlienNumber;
    @FXML TextField relativeFirstName;
    @FXML TextField relativeLastName;
    @FXML TextField relativeAlienNumber;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        if (immigrantFirstName.getText().equals("") ||
            immigrantLastName.getText().equals("") ||
            immigrantAlienNumber.getText().equals("") ||
            relativeFirstName.getText().equals("") ||
            relativeLastName.getText().equals("") ||
            relativeAlienNumber.getText().equals("")){
            
            feedback.setText("One or more of the fields are empty");
            return;
        }
        feedback.setText("Submitted");
    }
}
