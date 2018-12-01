package sample;

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
