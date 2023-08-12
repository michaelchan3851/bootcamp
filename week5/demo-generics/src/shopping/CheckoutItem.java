package shopping;

public class CheckoutItem  extends Item {
  private int quantity;

  public CheckoutItem(int quantity, int price) {
    super(price);
    this.quantity = quantity;
  }

  public int getQuatity(){
    return this.quantity;
  }
}
