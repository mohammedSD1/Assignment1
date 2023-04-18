/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.ViewManger;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Mohammed
 */
public class LoginPageController implements Initializable {

    @FXML
    private Label user;
    @FXML
    private TextField username;
    @FXML
    private PasswordField passward;
    @FXML
    private Label pass;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void login(ActionEvent event) throws IOException {
        String u = username.getText();
        String pass = passward.getText();
        if (u.equalsIgnoreCase("user") && (pass.equalsIgnoreCase("userpass"))) {
            ViewManger.opencurrencyConverstionPage();
        } else {
            user.setText("invalid Data");
            user.setStyle("-fx-background-color:red;");
            this.pass.setText("invaild Data");
            this.pass.setStyle("-fx-background-color:red;");
        }
    }
}


