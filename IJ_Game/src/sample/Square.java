package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Square extends Rectangle {

    private Coin coin;

    public boolean hasCoin() {
        return coin != null;
    }

    public Coin getCoin() {
        return coin;
    }

    public void setCoin(Coin coin) {
        this.coin = coin;
    }

    public Square(boolean light, int x, int y) {
        setWidth(CheckersMain.SQ_SIZE);
        setHeight(CheckersMain.SQ_SIZE);

        relocate(x*CheckersMain.SQ_SIZE, y*CheckersMain.SQ_SIZE);
        setFill(light ? Color.valueOf("#000000") : Color.valueOf("#ffffff"));
    }
}
