package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Main {

    @FXML protected void returnTo(ActionEvent event) throws IOException {
        App.setRoot("main");
    }

    @FXML protected void dataEntry(ActionEvent event) throws IOException {
        App.setRoot("data_entry");
    }

    @FXML protected void reviewer(ActionEvent event) throws IOException {
        App.setRoot("reviewer");
    }

    @FXML protected void approver(ActionEvent event) throws IOException {
        App.setRoot("approver");
    }

}
