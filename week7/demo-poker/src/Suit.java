public enum Suit {
    DIAMOND(1),
    CLUB(2),
    HEART(3),
    SPAEDS(4);

    private int suit;

    private Suit(int suit){
        this.suit = suit;
    }

    public int getSuit() {
        return this.suit;
    }
   
}