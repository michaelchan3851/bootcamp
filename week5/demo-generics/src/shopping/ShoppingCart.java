package shopping;

import java.util.ArrayList;
import shopping.Item;
import shopping.Rice;

public class ShoppingCart extends Item {

  private ArrayList<CheckoutItem> items;

  public ShoppingCart() {
    items = new ArrayList<>();
  }

  public int totalAmount() {
    int sum = 0;
    for (CheckoutItem item : this.items) {
      sum += Math.max(0, item.getPrice() * item.getQuatity());
    }
    return sum;
  }

  public void add(int quatity, DisplayItem displayItem) {
    // construct CheckoutItem
    CheckoutItem checkoutItem = new CheckoutItem(quatity, displayItem.getPrice());
    items.add(checkoutItem);
  }

  public boolean remove(CheckoutItem item) { // Food
    return items.remove(item);
  }

  public void clear() {
    this.items.clear();
  }

  public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();
    //cart.add(new Rice());
    // cart.add(new Food()); // Food is abstract
    //

    // ShoppingCart<Object> cart = new ShoppingCart<>();
  }
}
