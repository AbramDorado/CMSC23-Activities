package calculator;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws IOException {
			FXMLLoader arithmetic = new FXMLLoader(Main.class.getResource("Arithmetic.fxml"));
			Parent root = arithmetic.load();
			Scene scene = new Scene(root);
			String css = this.getClass().getResource("application.css").toExternalForm();
			scene.getStylesheets().add(css);
			stage.setTitle("Calculator");
			stage.setScene(scene);
			stage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}
