/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cybermanagementsystem;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import static javafx.scene.paint.Color.BLUE;
import static javafx.scene.paint.Color.RED;
import javafx.scene.text.Font;
import static javafx.scene.text.FontWeight.BOLD;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CyberManagementSystem extends Application {
    CheckBox cb1 = new CheckBox("Coffe Cake");
    CheckBox cb2 = new CheckBox("Red Valvet Cake");
    CheckBox cb3 = new CheckBox("Chocolate Cake");
    CheckBox cb4 = new CheckBox("Cheese Cake");
    CheckBox cb5 = new CheckBox("Tea");
    CheckBox cb6 = new CheckBox("Coffe");
    CheckBox cb7 = new CheckBox("Espresso");
    CheckBox cb8 = new CheckBox("Cappuccino");

    Label L11 = new Label();
    Label L12 = new Label();
    Label L13 = new Label();
    Label L14 = new Label();
    Label L15 = new Label();

    int x = 10;
    double y = 0.07;

    double cakes_price = 0;

    public void setPrice1() {
        cakes_price = 0;
        if (cb1.isSelected()) {
            cakes_price += 5;
        }
        if (cb2.isSelected()) {
            cakes_price += 8;
        }
        if (cb3.isSelected()) {
            cakes_price += 7;
        }
        if (cb4.isSelected()) {
            cakes_price += 6;
        }
        L11.setText("" + cakes_price);
    }

    double drinks_price = 0;

    public void setPrice2() {
        drinks_price = 0;
        if (cb5.isSelected()) {
            drinks_price += 4;
        }
        if (cb6.isSelected()) {
            drinks_price += 5;
        }
        if (cb7.isSelected()) {
            drinks_price += 8;
        }
        if (cb8.isSelected()) {
            drinks_price += 7;
        }
        L12.setText("" + drinks_price);
    }

    double Total = 0;

    public void Total() {
        Total = 0;
        if (cb1.isSelected()) {
            Total += 5;
        }
        if (cb2.isSelected()) {
            Total += 8;
        }
        if (cb3.isSelected()) {
            Total += 7;
        }
        if (cb4.isSelected()) {
            Total += 6;
        }
        if (cb5.isSelected()) {
            Total += 4;
        }
        if (cb6.isSelected()) {
            Total += 5;
        }
        if (cb7.isSelected()) {
            Total += 8;
        }
        if (cb8.isSelected()) {
            Total += 7;
        }
        double z = Total + x + ((Total + x) * y);
        L15.setText(z + " $");
    }

    public void Clear() {
        cb1.setSelected(false);
        cb2.setSelected(false);
        cb3.setSelected(false);
        cb4.setSelected(false);
        cb5.setSelected(false);
        cb6.setSelected(false);
        cb7.setSelected(false);
        cb8.setSelected(false);
        cakes_price = 0;
        L11.setText("" + cakes_price);
        drinks_price = 0;
        L12.setText("" + drinks_price);
        Total = 0;
        L15.setText("" + Total);
    }

    @Override
    public void start(Stage primaryStage) {
        Label L1 = new Label("Username");
        Label L2 = new Label("Password");
        L1.setTextFill(BLUE);
        L2.setTextFill(BLUE);
        TextField txt = new TextField();
        PasswordField p = new PasswordField();
        Button btn1 = new Button("Login");
        Button btn2 = new Button("Reset");

        VBox v1 = new VBox(30);
        v1.getChildren().addAll(L1, L2, btn1);
        VBox v2 = new VBox(20);
        v2.getChildren().addAll(txt, p, btn2);
        HBox h1 = new HBox(30);
        h1.getChildren().addAll(v1, v2);
        h1.setPadding(new Insets(30, 0, 0, 30));

        Scene s1 = new Scene(h1, 400, 200);

        primaryStage.setTitle("Cyber Management System");
        primaryStage.setResizable(false);
        primaryStage.setScene(s1);
        primaryStage.show();

        Stage stage2 = new Stage();
        stage2.setTitle("CyberManagementSystem");

        Alert alert = new Alert(AlertType.INFORMATION);

        btn1.setOnAction(e -> {
            if ((txt.getText().equals("0")) && (p.getText().equals("0"))) {
                alert.setHeaderText("Welcome Sir !");
                alert.showAndWait();
                stage2.show();
            } else {
                alert.setHeaderText("Please try again");
                alert.show();
            }
        });

        btn2.setOnAction(e -> {
            txt.clear();
            p.clear();
        });

        Font f = Font.font("Cambria", BOLD, 20);

        Label L3 = new Label("CYBER MANAGEMENT SYSTEM");
        L3.setTextFill(RED);
        L3.setFont(f);
        Label L4 = new Label("CAKES");
        L4.setFont(f);
        L4.setTextFill(RED);
        Label L5 = new Label("Cost of cakes");
        Label L6 = new Label("Cost of drinks");
        Label L7 = new Label("Service charge");
        Label L8 = new Label("Tax");
        Label L9 = new Label("Total Due");
        L9.setTextFill(RED);
        L9.setFont(f);
        Button btn3 = new Button("Total Cost");
        btn3.setFont(f);
        Label L10 = new Label("Drinks");
        L10.setFont(f);
        L10.setTextFill(RED);
        L11.setText("" + cakes_price);
        L12.setText("" + drinks_price);
        L13.setText(x + "$");
        L14.setText(y + " Of The Total Cost");
        L15.setText("" + Total);
        L15.setFont(f);
        L15.setTextFill(RED);
        Button btn4 = new Button("Reset");
        btn4.setFont(f);
        Button btn5 = new Button("Exit");
        btn5.setFont(f);

        HBox title = new HBox();
        title.getChildren().addAll(L3);
        title.setAlignment(Pos.BASELINE_LEFT);
        title.setPadding(new Insets(60, 0, 0, 60));

        GridPane grid = new GridPane();
        grid.add(L4, 1, 1);
        grid.add(cb1, 1, 2);
        grid.add(cb2, 1, 3);
        grid.add(cb3, 1, 4);
        grid.add(cb4, 1, 5);
        grid.add(L5, 1, 6);
        grid.add(L6, 1, 7);
        grid.add(L7, 1, 8);
        grid.add(L8, 1, 9);
        grid.add(L9, 1, 10);
        grid.add(L10, 10, 1);
        grid.add(cb5, 10, 2);
        grid.add(cb6, 10, 3);
        grid.add(cb7, 10, 4);
        grid.add(cb8, 10, 5);
        grid.add(L11, 10, 6);
        grid.add(L12, 10, 7);
        grid.add(L13, 10, 8);
        grid.add(L14, 10, 9);
        grid.add(L15, 10, 10);
        grid.setVgap(40);
        grid.setHgap(20);
        grid.setPadding(new Insets(0, 0, 0, 40));

        HBox buttons = new HBox(200);
        buttons.getChildren().addAll(btn3, btn4, btn5);
        buttons.setPadding(new Insets(0, 0, 150, 60));

        BorderPane border = new BorderPane();
        border.setTop(title);
        border.setCenter(grid);
        border.setBottom(buttons);

        Scene s2 = new Scene(border, 750, 950);
        stage2.initModality(Modality.APPLICATION_MODAL);
        stage2.setResizable(false);
        stage2.setScene(s2);

        Alert alert_2 = new Alert(AlertType.INFORMATION);
        alert_2.setHeaderText("The RECEIPT is saved");

        Alert alert_3 = new Alert(AlertType.INFORMATION);
        alert_3.setHeaderText("Please pick your order");
        
        Alert alert_4 = new Alert(AlertType.INFORMATION);
        alert_4.setHeaderText("Have a nice meal :D ");

        btn3.setOnAction(e -> {
            if (cb1.isSelected() || cb2.isSelected() || cb3.isSelected() || cb4.isSelected() || cb5.isSelected() || cb6.isSelected() || cb7.isSelected() || cb8.isSelected()) {
                alert_2.showAndWait();
                setPrice1();
                setPrice2();
                Total();
            } else {
                alert_3.showAndWait();
            }
        });

        btn4.setOnAction(e -> {
            Clear();
        });

        btn5.setOnAction(e -> {
            alert_4.showAndWait();
            stage2.close();
        });
    }

    public static void main(String[] args) {

        launch(args);
    }

}
