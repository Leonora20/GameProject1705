package sample;

/*
 * Author: Leonora Fernandes
 *         SYMCA
 *         Checkers Game
 *
 *         Direction of the coins.
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

    public MovementResult(MovementType mtype) {
        this(mtype, null);
    }

    public MovementResult(MovementType mtype, Coin coin) {
        this.mType = mtype;
        this.coin = coin;
    }
}
