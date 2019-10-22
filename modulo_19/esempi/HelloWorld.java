import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class HelloWorld extends Application {
    @Override
    public void init() {
        System.out.println("Inizio JavaFX");
    }
    @Override
    public void start(Stage stage) {
        Label label = new Label("Hello World!");
        label.setFont(new Font("Book Antiqua", 120));
        stage.setScene(new Scene(label));
        stage.setTitle("HelloWorld with JavaFX");
        stage.sizeToScene();
        stage.show();
    }
    @Override
    public void stop() {
        System.out.println("Fine JavaFX");
    }
}