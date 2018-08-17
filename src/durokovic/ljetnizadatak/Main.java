package durokovic.ljetnizadatak;

import javafx.application.Application;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.fxml.FXMLLoader.*;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
            Parent root = load(getClass().getResource("/durokovic/ljetnizadatak/view/main/MainView.fxml"));
            primaryStage.setScene(new Scene(root));
            primaryStage.show();

    }
}
