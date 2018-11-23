package sample;

import javafx.scene.shape.Rectangle;

public class Square extends Rectangle {

    private Coin coin;

    public boolean hasPiece(){
        return coin != null;
    }

    public Coin getCoin(){
        return coin;
    }

    public void setCoin(Coin coin){
        this.coin = coin;
    }

}
