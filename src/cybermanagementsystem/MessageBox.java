/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cybermanagementsystem;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.CheckBox;

public class MessageBox {

    public static void display(String title, String message) {
        Stage box = new Stage();
        box.initModality(Modality.APPLICATION_MODAL);
        box.setTitle(title);
        Label label = new Label(message);
        Button button = new Button("Ok");

        button.setOnAction(e -> {
            box.close();
        });

        VBox screen = new VBox(20);
        screen.getChildren().addAll(label, button);
        screen.setAlignment(Pos.CENTER);

        Scene scene = new Scene(screen, 250, 150);
        box.setResizable(false);
        box.setScene(scene);
        box.showAndWait();
    }
}
