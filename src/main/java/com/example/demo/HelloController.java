package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private TextField TFTitle;

    @FXML
    void btnOkClicked(ActionEvent event) {
        Stage mainWindow = (Stage) TFTitle.getScene().getWindow();
        String title = TFTitle.getText();
        mainWindow.setTitle(title);



    }

}
