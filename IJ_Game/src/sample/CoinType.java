package sample;

public enum CoinType{
    RED(1), BLUE(-1);

    final int movement;

    CoinType(int movement) {
        this.movement = movement;
    }
}
