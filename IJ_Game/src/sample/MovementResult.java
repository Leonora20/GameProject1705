package sample;

/*
 * Author: Leonora Fernandes
 *         SYMCA
 *         Checkers Game
 *
 *         Get Direction of the coins from MovementType.
 */

public class MovementResult {

    private MovementType mType;

    public MovementType getmType() {
        return mType;
    }

    private Coin coin;

    public Coin getCoin() {
        return coin;
    }

    public MovementResult(MovementType mtype) { //for None and Normal
        this(mtype, null);
    }

    public MovementResult(MovementType mtype, Coin coin) { //for Kill
        this.mType = mtype;
        this.coin = coin;
    }
}
