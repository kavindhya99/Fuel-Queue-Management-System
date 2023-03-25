package com.example.w1898939_task2_task3_task4;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController extends Task3_Passenger {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        HelloController obj=new HelloController();
        welcomeText.setText("Customer 1:"+obj.queue1[0][0]);
    }
}