import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Principal extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Ventana ventana= new Ventana();
       AnchorPane pane=ventana.construir();
        pane.setPrefWidth(610);
        pane.setPrefHeight(700);
        Scene scene=new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("COVID");
        primaryStage.setWidth(600);
        primaryStage.setHeight(700);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
