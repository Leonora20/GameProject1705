package sample;

/*
 * Author: Leonora Fernandes
 *         SYMCA
 *         Checkers Game
 *
 *         Main Class.
 *         Defining dimensions.
 *         Creating board.
 *         Check moves->None, Normal, Kill Checks.
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CheckersMain extends Application {

    public static final int SQ_SIZE = 80;
    public static final int SQ_WIDTH = 8;
    public static final int SQ_HEIGHT = 8;

    private Square[][] board = new Square[SQ_WIDTH][SQ_HEIGHT];

    private Group sqGroup = new Group(); //group for boxes
    private Group coinGroup = new Group(); //groups for coins

    private Parent createContent() {
        Pane pane = new Pane();
        pane.setPrefSize(SQ_WIDTH * SQ_SIZE, SQ_HEIGHT * SQ_SIZE);
        pane.getChildren().addAll(sqGroup, coinGroup); //the board with coins

        //Create Squares
        for (int y=0; y<SQ_HEIGHT; y++) {
            for (int x=0; x<SQ_WIDTH; x++) {
                Square square = new Square((x+y)%2==0, x, y); //rect alternate position
                board[x][y] = square;

                sqGroup.getChildren().add(square);

                Coin coin = null;

                if (y<=2 && (x+y)%2 != 0) { //y for height(0,1,2) && (x+y)%2 for alternate boxes
                    coin = makeCoin(CoinType.RED, x, y); //Red side
                }

                if (y>=5 && (x+y)%2 != 0) { //y for height(5,6,7)
                    coin = makeCoin(CoinType.BLUE, x, y); //Blue side
                }

                if (coin != null) {
                    square.setCoin(coin);
                    coinGroup.getChildren().add(coin);
                }
            }
        }

        return pane;
    }

    private MovementResult tryMove(Coin coin, int nextX, int nextY) {
        if (board[nextX][nextY].hasCoin() || (nextX+nextY)%2 == 0) { //cant move on a coin || cant move in black boxes
            return new MovementResult(MovementType.NONE);
        }

        int x0 = toBoard(coin.getOldX()); //fetch coordinates
        int y0 = toBoard(coin.getOldY());

        if (Math.abs(nextX-x0)==1 && nextY-y0==coin.getType().movement) { //==1 for diagonal && up or down by 1 step
            return new MovementResult(MovementType.NORMAL);
        } else if (Math.abs(nextX-x0)==2 && nextY-y0==coin.getType().movement*2) { //for 2 steps

            int x1 = x0+(nextX-x0)/2; //fetch diagonal
            int y1 = y0+(nextY-y0)/2;

            if (board[x1][y1].hasCoin() && board[x1][y1].getCoin().getType() != coin.getType()) { //check if coin exits && opposite colour
                return new MovementResult(MovementType.KILL, board[x1][y1].getCoin()); //if true..Kill and return killed piece
            }
        }

        return new MovementResult(MovementType.NONE); //stationary
    }

    private int toBoard(double pixel) { //pixel coordinates to Board coordinates to centre the coin for MovementResult
        return (int)(pixel+SQ_SIZE/2)/SQ_SIZE;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(createContent());
        primaryStage.setTitle("Checkers");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //Place the coins on the board
    private Coin makeCoin(CoinType type, int x, int y) {
        Coin coin = new Coin(type, x, y);

        coin.setOnMouseReleased(e -> {
            int newX = toBoard(coin.getLayoutX()); //check to place the coin
            int newY = toBoard(coin.getLayoutY());

            MovementResult result;

            if (newX<0 || newY<0 || newX>=SQ_WIDTH || newY>=SQ_HEIGHT) {
                result = new MovementResult(MovementType.NONE);
            } else {
                result = tryMove(coin, newX, newY);
            }

            int x0 = toBoard(coin.getOldX()); //fetch coordinates
            int y0 = toBoard(coin.getOldY());

            switch (result.getmType()) {
                case NONE:
                    coin.abortMove(); //original box
                    break;
                case NORMAL:
                    coin.move(newX, newY);
                    board[x0][y0].setCoin(null); //clear old box
                    board[newX][newY].setCoin(coin); //insert in new box
                    break;
                case KILL:
                    coin.move(newX, newY);
                    board[x0][y0].setCoin(null);
                    board[newX][newY].setCoin(coin);

                    Coin killedCoin = result.getCoin(); //the returned killed coin
                    board[toBoard(killedCoin.getOldX())][toBoard(killedCoin.getOldY())].setCoin(null); //kill on board
                    coinGroup.getChildren().remove(killedCoin); //destroy from screen
                    break;
            }
        });

        return coin;
    }

    public static void main(String[] args) {
        launch(args);
    }
}