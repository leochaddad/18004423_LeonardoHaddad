module br.maua {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.maua.projeto01 to javafx.fxml;
    exports br.maua.projeto01;

}