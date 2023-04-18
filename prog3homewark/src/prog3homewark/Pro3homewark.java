/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog3homewark;

import View.ViewManger;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Mohammed
 */
public class Pro3homewark  extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ViewManger.openLoginPage();
    }
    
}
