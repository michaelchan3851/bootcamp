public enum Player {
  X('X'), O('O');

  private char symbol;

  private Player(char symbol) {
      this.symbol = symbol;
  }

  public char getSymbol() {
      return symbol;
  }
}

