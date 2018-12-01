package sample;

/*
 * Author: Leonora Fernandes
 *         SYMCA
 *         Checkers Game
 *
 *         Differentiate coins.
 */

public enum CoinType{
    RED(1), BLUE(-1);

    final int movement;

    CoinType(int movement) {
        this.movement = movement;
    }
}
