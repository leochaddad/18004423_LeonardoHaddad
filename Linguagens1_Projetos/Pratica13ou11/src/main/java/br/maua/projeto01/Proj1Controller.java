package br.maua.projeto01;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Proj1Controller implements Initializable {

    @FXML
    private TextField textField1;

    @FXML
    private TextField textField2;

    @FXML
    private Label mainLabel;

    @FXML
    private Button buttonHello;

    @FXML
    private Button buttonText1;

    @FXML
    private Button buttonSoma;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        buttonHello.setOnAction(a->{
            mainLabel.setText("Hello World");
        });
        buttonText1.setOnAction(a->{
            mainLabel.setText(textField1.getText());
        });
        buttonSoma.setOnAction(a->{
            try {
                mainLabel.setText(Double.toString(Double.parseDouble(textField1.getText())+Double.parseDouble(textField2.getText())));
            }
            catch (NumberFormatException e){
                mainLabel.setText("NaN");
            }
        });


    }
}