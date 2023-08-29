public class Card { // 52
  private Suit suit;
  private Rank rank;

  private Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }


  public Rank getRank() {
    return this.rank;
  }

  public Suit getSuit() {
    return this.suit;
  }


  public static Card of(Rank rank, Suit suit) { // 1-13, 4 suits
    return new Card(rank, suit);
  }

  

  // public static int compare(Card card){
    
  // }

  
  // public static Jocker Joker() {
  // return Jocker.JOKER;
  // }

}
