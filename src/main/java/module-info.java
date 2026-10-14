module dev.rampmaster.poo_calculadora {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;

    opens dev.rampmaster.poo_calculadora to javafx.fxml;
    exports dev.rampmaster.poo_calculadora;
}