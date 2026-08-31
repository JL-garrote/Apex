module com.example.apex {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.sql;
    requires java.desktop;

    opens com.example.apex to javafx.fxml;
    exports com.example.apex;

    opens com.example.apex.Service to javafx.fxml;
    exports com.example.apex.Service;

    opens com.example.apex.Controller to javafx.fxml;
    exports com.example.apex.Controller;

}
