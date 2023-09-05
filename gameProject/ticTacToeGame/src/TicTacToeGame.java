import java.util.Scanner;

public class TicTacToeGame implements Game {
    private TicTacToeBoard board;
    private char currentPlayer;
    Player player;

    public TicTacToeGame() {
        board = new TicTacToeBoard();
        currentPlayer = 'X';
        player = Player.X;
    }

    @Override
    public void play() {
        boolean gameFinished = false;

        while (!gameFinished) {
            board.printBoard();
            makeMove();

            if (board.checkWin(player)) {
                board.printBoard();
                System.out.println("Player " + player + " wins!");
                gameFinished = true;
            } else if (board.isBoardFull()) {
                board.printBoard();
                System.out.println("It's a draw!");
                gameFinished = true;
            }

            // Switch players
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }

    private void makeMove() {
        boolean validMove = false;
        do {
            validMove = board.makeMove(currentPlayer);

            if (!validMove) {
                System.out.println("Invalid move. Try again.");
            }
        } while (!validMove);
    }

    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        game.play();
    }
}