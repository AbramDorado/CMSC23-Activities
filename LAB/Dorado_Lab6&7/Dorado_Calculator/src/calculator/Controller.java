/*
 * BACUD, ROSHAN QUISEL | CS23: JAVAFX
 * */
package calculator;

import java.net.URL;
import java.lang.Math;
import java.io.IOException;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.event.ActionEvent;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller implements Initializable {

	private Stage stage;
	private Scene scene;

	@FXML
	private TextField input1;
	@FXML
	private TextField input2;
	@FXML
	private TextField input3;
	@FXML
	private Label arithresult;
	@FXML
	private Label trigresult;


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {}

	@FXML
	private void onTrigClick(ActionEvent a) throws IOException {
		FXMLLoader trig = new FXMLLoader(getClass().getResource("Trigonometry.fxml"));
		stage = (Stage) ((Node)a.getSource()).getScene().getWindow();
		Parent root = trig.load();
		scene = new Scene(root);

		String css = this.getClass().getResource("application.css").toExternalForm();
		scene.getStylesheets().add(css);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	private void onArithClick(ActionEvent a) throws IOException {
		FXMLLoader arithmetic = new FXMLLoader(getClass().getResource("Arithmetic.fxml"));
		stage = (Stage) ((Node)a.getSource()).getScene().getWindow();
		Parent root = arithmetic.load();
		scene = new Scene(root);

		String css = this.getClass().getResource("application.css").toExternalForm();
		scene.getStylesheets().add(css);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	protected void onAddClick() {
		try {
			double number1 = 0;
			double number2 = 0;
			double answer = 0;

			if (!input1.getText().equals("") || !input2.getText().equals("")) {
				number1 = Double.parseDouble(input1.getText());
				number2 = Double.parseDouble(input2.getText());
			}

			answer = number1 + number2;
			String value = number1 + " + " + number2 + " = " + answer;
			arithresult.setText(value);
			arithresult.setStyle("-fx-text-fill: black;");

		} catch (NumberFormatException e) {arithresult.setText("Error! Invalid input.");}
	}

	@FXML
	protected void onSubtractClick() {
		try {
			double number1 = 0;
			double number2 = 0;
			double answer = 0;

			if (!input1.getText().equals("") || !input2.getText().equals("")) {
				number1 = Double.parseDouble(input1.getText());
				number2 = Double.parseDouble(input2.getText());
			}

			answer = number1 - number2;
			String value = number1 + " - " + number2 + " = " + answer;
			arithresult.setText(value);
			arithresult.setStyle("-fx-text-fill: black;");

		} catch (NumberFormatException e) {arithresult.setText("Error! Invalid input.");}
	}

	@FXML
	protected void onMultiplyClick() {
		try {
			double number1 = 0;
			double number2 = 0;
			double answer = 0;

			if (!input1.getText().equals("") || !input2.getText().equals("")) {
				number1 = Double.parseDouble(input1.getText());
				number2 = Double.parseDouble(input2.getText());
			}

			answer = number1 * number2;
			String value = number1 + " * " + number2 + " = " + answer;
			arithresult.setText(value);
			arithresult.setStyle("-fx-text-fill: black;");

		} catch (NumberFormatException e) {arithresult.setText("Error! Invalid input.");}
	}

	@FXML
	protected void onDivideClick(){
		try {
			double number1 = 0;
			double number2 = 0;
			double answer = 0;

			if (!input1.getText().equals("") || !input2.getText().equals("")) {
				number1 = Double.parseDouble(input1.getText());
				number2 = Double.parseDouble(input2.getText());
			}

			answer = number1 / number2;
			String value = number1 + " / " + number2 + " = " + answer;
			arithresult.setText(value);
			arithresult.setStyle("-fx-text-fill: black;");

		} catch (NumberFormatException e) {arithresult.setText("Error! Invalid input.");}
	}

	@FXML
	protected void onSineClick() {
		try {
			Double trigInput = 0.0;
			double computeTrigo = 0.0;
			trigInput = Double.parseDouble(input3.getText());

			computeTrigo = Math.sin(trigInput);
			String value = "sin(" + trigInput + ") = " + computeTrigo;
			trigresult.setText(value);
			trigresult.setStyle("-fx-text-fill: black;");

		} catch (NumberFormatException e) {trigresult.setText("Error! Invalid input.");}
	}

	@FXML
	protected void onCosineClick() {
		try {
			Double trigInput = 0.0;
			double computeTrigo = 0.0;
			trigInput = Double.parseDouble(input3.getText());

			computeTrigo = Math.cos(trigInput);
			String value = "cos(" + trigInput + ") = " + computeTrigo;
			trigresult.setText(value);
			trigresult.setStyle("-fx-text-fill: black;");

		} catch (NumberFormatException e) {trigresult.setText("Error! Invalid input.");}
	}

	@FXML
	protected void onTangentClick() {
		try {
			Double trigInput = 0.0;
			double computeTrigo = 0.0;
			trigInput = Double.parseDouble(input3.getText());

			computeTrigo = Math.tan(trigInput);
			String value = "tan(" + trigInput + ") = " + computeTrigo;
			trigresult.setText(value);
			trigresult.setStyle("-fx-text-fill: black;");

		} catch (NumberFormatException e) {trigresult.setText("Error! Invalid input.");}
	}

	@FXML
	protected void onCosecantClick() {
		try {
			Double trigInput = 0.0;
			double computeTrigo = 0.0;
			trigInput = Double.parseDouble(input3.getText());

			computeTrigo = 1/Math.sin(trigInput);
			String value = "csc(" + trigInput + ") = " + computeTrigo;
			trigresult.setText(value);
			trigresult.setStyle("-fx-text-fill: black;");

		} catch (NumberFormatException e) {trigresult.setText("Error! Invalid input.");}
	}

	@FXML
	protected void onSecantClick() {
		try {
			Double trigInput = 0.0;
			double computeTrigo = 0.0;
			trigInput = Double.parseDouble(input3.getText());

			computeTrigo = 1/Math.cos(trigInput);
			String value = "sec(" + trigInput + ") = " + computeTrigo;
			trigresult.setText(value);
			trigresult.setStyle("-fx-text-fill: black;");

		} catch (NumberFormatException e) {trigresult.setText("Error! Invalid input.");}
	}

	@FXML
	protected void onCotangentClick() {
		try {
			Double trigInput = 0.0;
			double computeTrigo = 0.0;
			trigInput = Double.parseDouble(input3.getText());

			computeTrigo = 1/Math.tan(trigInput);
			String value = "cot(" + trigInput + ") = " + computeTrigo;
			trigresult.setText(value);
			trigresult.setStyle("-fx-text-fill: black;");

		} catch (NumberFormatException e) {trigresult.setText("Error! Invalid input.");}
	}
}
