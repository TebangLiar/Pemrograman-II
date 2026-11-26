module com.example.modul06 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com to javafx.fxml, javafx.base;
    exports com;
}