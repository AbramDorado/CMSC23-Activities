package ph.edu.upm.students.DoradoAbram_Lab1A.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        AnchorPane anchorPane = new AnchorPane();

        Button button = new Button("Click Me!");
        anchorPane.getChildren().add(button);

        Label label = new Label("Hello World!");
        anchorPane.getChildren().add(label);

        AnchorPane.setTopAnchor(label, 50.0);
        AnchorPane.setTopAnchor(button, 10.0);
        AnchorPane.setLeftAnchor(label, 30.0);
        AnchorPane.setLeftAnchor(button, 30.0);

        button.setOnAction(e -> btn_click(label));

        Scene scene = new Scene(anchorPane,200,200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void btn_click(Label label) {
        label.setText("You clicked the button! Nice!");
    }
}
