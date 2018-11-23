package sample;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CheckersMain extends Application{
    public static final int SQ_SIZE = 100;
    public static final int SQ_WIDTH = 8;
    public static final int SQ_HEIGHT = 8;

    private Parent createContent(){
        Pane pane = new Pane();
        pane.setPrefSize(SQ_HEIGHT * SQ_SIZE, SQ_WIDTH * SQ_SIZE);

        return pane;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Scene scene = new Scene(createContent());
        primaryStage.setTitle("Checkers");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}