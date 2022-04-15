package com.example.sdr;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class HelloController implements Initializable{
    @FXML
    private Label myLabel;

    @FXML
    private ChoiceBox<String> myChoiceBox;

    private String[] Shapes = {"Arc","CubicCurve","Cylinder","Ellipse","Line","Path","Polygon","Rectangle"};

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        myChoiceBox.getItems().addAll(Shapes);
        myChoiceBox.setOnAction(this::getShapes);
    }
    public void getShapes(ActionEvent event) {

    }
}
