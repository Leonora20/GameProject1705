package sample;

public enum CoinType {
    RED(1), BLUE(-1);

    final int moveDir;

    CoinType(int moveDir){
        this.moveDir = moveDir;
    }
}
