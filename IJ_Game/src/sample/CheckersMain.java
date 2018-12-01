package sample;

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

    private Group sqGroup = new Group();
    private Group coinGroup = new Group();

    private Parent createContent() {
        Pane pane = new Pane();
        pane.setPrefSize(SQ_WIDTH * SQ_SIZE, SQ_HEIGHT * SQ_SIZE);
        pane.getChildren().addAll(sqGroup, coinGroup);

        for (int y=0; y<SQ_HEIGHT; y++) {
            for (int x=0; x<SQ_WIDTH; x++) {
                Square square = new Square((x+y)%2==0, x, y);
                board[x][y] = square;

                sqGroup.getChildren().add(square);

                Coin coin = null;

                if (y<=2 && (x+y)%2 != 0) {
                    coin = makeCoin(CoinType.RED, x, y);
                }

                if (y>=5 && (x+y)%2 != 0) {
                    coin = makeCoin(CoinType.BLUE, x, y);
                }

                if (coin != null) {
                    square.setCoin(coin);
                    coinGroup.getChildren().add(coin);
                }
            }
        }

        return pane;
    }

    private MovementResult tryMove(Coin coin, int newX, int newY) {
        if (board[newX][newY].hasCoin() || (newX+newY)%2 == 0) {
            return new MovementResult(MovementType.NONE);
        }

        int x0 = toBoard(coin.getOldX());
        int y0 = toBoard(coin.getOldY());

        if (Math.abs(newX-x0)==1 && newY-y0==coin.getType().movement) {
            return new MovementResult(MovementType.NORMAL);
        } else if (Math.abs(newX-x0)==2 && newY-y0==coin.getType().movement*2) {

            int x1 = x0+(newX-x0)/2;
            int y1 = y0+(newY-y0)/2;

            if (board[x1][y1].hasCoin() && board[x1][y1].getCoin().getType() != coin.getType()) {
                return new MovementResult(MovementType.KILL, board[x1][y1].getCoin());
            }
        }

        return new MovementResult(MovementType.NONE);
    }

    private int toBoard(double pixel) {
        return (int)(pixel+SQ_SIZE/2)/SQ_SIZE;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(createContent());
        primaryStage.setTitle("Checkers");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Coin makeCoin(CoinType type, int x, int y) {
        Coin coin = new Coin(type, x, y);

        coin.setOnMouseReleased(e -> {
            int newX = toBoard(coin.getLayoutX());
            int newY = toBoard(coin.getLayoutY());

            MovementResult result;

            if (newX<0 || newY<0 || newX>=SQ_WIDTH || newY>=SQ_HEIGHT) {
                result = new MovementResult(MovementType.NONE);
            } else {
                result = tryMove(coin, newX, newY);
            }

            int x0 = toBoard(coin.getOldX());
            int y0 = toBoard(coin.getOldY());

            switch (result.getmType()) {
                case NONE:
                    coin.abortMove();
                    break;
                case NORMAL:
                    coin.move(newX, newY);
                    board[x0][y0].setCoin(null);
                    board[newX][newY].setCoin(coin);
                    break;
                case KILL:
                    coin.move(newX, newY);
                    board[x0][y0].setCoin(null);
                    board[newX][newY].setCoin(coin);

                    Coin otherCoin = result.getCoin();
                    board[toBoard(otherCoin.getOldX())][toBoard(otherCoin.getOldY())].setCoin(null);
                    coinGroup.getChildren().remove(otherCoin);
                    break;
            }
        });

        return coin;
    }

    public static void main(String[] args) {
        launch(args);
    }
}