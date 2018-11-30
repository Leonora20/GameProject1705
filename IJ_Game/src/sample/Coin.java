package sample;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

import static sample.CheckersMain.SQ_SIZE;

public class Coin extends StackPane{

    private CoinType type;

    private double mouseX, mouseY;
    private double OldX, OldY;

    public CoinType getType(){
        return type;
    }

    public double getOldX(){
        return OldX;
    }

    public  double getOldY(){
        return OldY;
    }

    public Coin(CoinType type, int x, int y){
        this.type = type;

        move(x, y);

        Ellipse bg = new Ellipse(SQ_SIZE * 0.3125, SQ_SIZE *0.26);
        bg.setFill(Color.BLACK);

        bg.setStroke(Color.BLACK);
        bg.setStrokeWidth(SQ_SIZE * 0.03);

        bg.setTranslateX((SQ_SIZE - SQ_SIZE * 0.3125 * 2)/2);
        bg.setTranslateY((SQ_SIZE - SQ_SIZE * 0.26 * 2)/2);

        Ellipse ellipse = new Ellipse(SQ_SIZE * 0.3125, SQ_SIZE * 0.26);
        ellipse.setFill(type == CoinType.RED ? Color.valueOf("#ff0000") : Color.valueOf("#0000ff"));

        ellipse.setStroke(Color.BLACK);
        ellipse.setStrokeWidth(SQ_SIZE * 0.03);

        ellipse.setTranslateX((SQ_SIZE - SQ_SIZE * 0.3125 * 2)/2);
        ellipse.setTranslateY((SQ_SIZE - SQ_SIZE * 0.26 * 2)/2);

        getChildren().addAll(bg, ellipse);

        setOnMousePressed(e -> {
            mouseX = e.getSceneX();
            mouseY = e.getSceneY();
        });

        setOnMouseDragged(e -> {
            relocate(e.getSceneX() - mouseX + OldX, e.getSceneY() - mouseY + OldY);
        });
    }

    public void move(int x, int y){
        OldX = x * SQ_SIZE;
        OldY = y * SQ_SIZE;
        relocate(OldX, OldY);
    }

    public void abortMove(){
        relocate(OldX, OldY);
    }
}