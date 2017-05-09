/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadexample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Aaron
 */
public class MultiThreadExample extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Run Penguin Runnable");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                (new Thread(new PenguinRunnable(1))).start();
            }
        });
        
        Button btnTwo = new Button();
        btnTwo.setText("Run Penguin Thread");
        btnTwo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                (new PenguinThread(2)).start();
            }
        });
        
        HBox root = new HBox();
        VBox buttons = new VBox();
        buttons.getChildren().add(btn);
        buttons.getChildren().add(btnTwo);
        
        root.getChildren().add(buttons);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Thread Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
