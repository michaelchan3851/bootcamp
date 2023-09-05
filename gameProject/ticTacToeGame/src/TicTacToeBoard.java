import java.util.Scanner;

public class TicTacToeBoard {
  private char[][] board = new char[3][3];

  public TicTacToeBoard() {
    initializeBoard();
  }

  private void initializeBoard() {
    for (int row = 0; row < 3; row++) {
      for (int col = 0; col < 3; col++) {
        board[row][col] = ' ';
      }
    }
  }

  public void printBoard() {
    System.out.println("_____________");
    for (int row = 0; row < 3; row++) {
      System.out.print("| ");
      for (int col = 0; col < 3; col++) {
        System.out.print(board[row][col] + " | ");
      }
      System.out.println("\n_____________");
    }
  }

  public boolean makeMove(char symbol) {
    Scanner scanner = new Scanner(System.in);

    do {
        System.out.print("Player " + symbol + ", enter the cell number (1-9) to place '" + symbol + "': ");
        int cellNumber = scanner.nextInt();

        if (cellNumber < 1 || cellNumber > 9) {
            System.out.println("Invalid cell number. Try again.");
            continue;
        }

        int row = (cellNumber - 1) / 3;
        int col = (cellNumber - 1) % 3;

        if (board[row][col] != ' ') {
            System.out.println("Cell already occupied. Try again.");
            continue;
        }

        board[row][col] = symbol;
        return true;
    } while (true);
}

  public boolean checkWin(Player player) {
    return checkRows(player) || checkColumns(player) || checkDiagonals(player);
  }

  private boolean checkRows(Player player) {
    for (int row = 0; row < 3; row++) {
      if (board[row][0] == player.getSymbol() && board[row][1] == player.getSymbol()
          && board[row][2] == player.getSymbol()) {
        return true;
      }
    }
    return false;
  }

  private boolean checkColumns(Player player) {
    for (int col = 0; col < 3; col++) {
      if (board[0][col] == player.getSymbol() && board[1][col] == player.getSymbol()
          && board[2][col] == player.getSymbol()) {
        return true;
      }
    }
    return false;
  }

  private boolean checkDiagonals(Player player) {
    return (board[0][0] == player.getSymbol() && board[1][1] == player.getSymbol() && board[2][2] == player.getSymbol())
        ||
        (board[0][2] == player.getSymbol() && board[1][1] == player.getSymbol() && board[2][0] == player.getSymbol());
  }

  public boolean isBoardFull() {
    for (int row = 0; row < 3; row++) {
      for (int col = 0; col < 3; col++) {
        if (board[row][col] == ' ') {
          return false;
        }
      }
    }
    return true;
  }

}
