module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires lombok;


    opens view to javafx.fxml;
    opens controller to javafx.fxml;
    opens entity to javafx.fxml;

    exports view;
    exports controller;
    exports entity;
    
    exports controller.NhanKhau;
    opens controller.NhanKhau to javafx.fxml;
}
