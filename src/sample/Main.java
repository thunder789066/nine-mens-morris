
package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("resources/sample.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("resources/boardLayout.fxml"));

        //primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 750, 550));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}