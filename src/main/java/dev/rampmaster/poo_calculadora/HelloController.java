package dev.rampmaster.poo_calculadora;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    // Atributos de la lista
    @FXML
    private TextField firstNumber;
    @FXML
    private TextField secondNumber;
    @FXML
    private Label resultText;

    // Getters and setters del proyecto
    public TextField getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(TextField firstNumber) {
        this.firstNumber = firstNumber;
    }

    public TextField getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(TextField secondNumber) {
        this.secondNumber = secondNumber;
    }

    public Label getResultText() {
        return resultText;
    }

    public void setResultText(Label resultText) {
        this.resultText = resultText;
    }

    // Metodos de comportamiento
    // Metodos de la vista
    @FXML
    private void onSumar(){
        int firstNumber = Integer.parseInt(this.getFirstNumber().getText());
        int secondNumber = Integer.parseInt(this.getSecondNumber().getText());
        int sum = firstNumber + secondNumber;
        this.getResultText().setText("" + sum);
    }

    @FXML
    private void onRestar(){

    }

    @FXML
    private void onMultiplicar(){

    }

    @FXML
    private void onDivision(){
        int firstNumber = Integer.parseInt(this.getFirstNumber().getText());
        int secondNumber = Integer.parseInt(this.getSecondNumber().getText());
        int div;
        try{
            div = firstNumber / secondNumber;
            this.getResultText().setText("" + div);
        }catch (ArithmeticException ex){
            this.getResultText().setText("No se puede dividir por zero");
        }
    }

    @FXML
    private void onModulo(){

    }
}
