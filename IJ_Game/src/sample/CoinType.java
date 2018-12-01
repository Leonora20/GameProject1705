package sample;

/*
 * Author: Leonora Fernandes
 *         SYMCA
 *         Checkers Game
 *
 *         Differentiate coins & their directions.
 */

public enum CoinType{
    RED(1), BLUE(-1); //reds are moving only down(+1), whites are moving only up(-1)

    final int movement;

    //Direction info
    CoinType(int movement) {
        this.movement = movement;
    }
}
