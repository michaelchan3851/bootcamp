public interface CardRule {

  Player determineWinner();

  void DealCards();

  void shuffleDeck();

  void compare();

  boolean isPair();

  void isStraightFlush();

  boolean isGameOver();

  void reset();

}
