package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sampleM.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 438, 527));
        primaryStage.setResizable(false);
        primaryStage.show();
    }





  public static void main(String[] args) {
        launch(args);



    }
}
