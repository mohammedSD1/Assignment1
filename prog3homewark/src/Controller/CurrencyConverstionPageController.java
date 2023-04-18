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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Mohammed
 */
public class CurrencyConverstionPageController implements Initializable {

    @FXML
    private TextField USD;
    @FXML
    private TextField NIS;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void logout(ActionEvent event) throws IOException {
        ViewManger.closecurrencyConverstionPage();
        ViewManger.openLoginPage();
    }

    @FXML
    private void convert(ActionEvent event) {
        String usd = USD.getText();
        String nis = NIS.getText();
        if (usd != "" && nis.equalsIgnoreCase("")) {
            double dou = Double.parseDouble(USD.getText());
            double sh = dou * 3.5;
            String s = String.valueOf(sh) + " " + "NIS";
            NIS.setText(s);
        } else if (nis != "" && usd.equalsIgnoreCase("")) {
            double sh = Double.parseDouble(NIS.getText());
            double dou = sh / 3.5;
            String s = String.valueOf(dou) + " " + "$";
            USD.setText(s);
        }

    }

}
