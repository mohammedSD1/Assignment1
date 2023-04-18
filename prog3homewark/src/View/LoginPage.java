/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Mohammed
 */
public class LoginPage extends Stage {

    public LoginPage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Fxml/LoginPage.fxml"));
        Parent patrent = fxmlLoader.load();
        Scene scene = new Scene(patrent);
        setScene(scene);
        setTitle("Login");
    }
}
