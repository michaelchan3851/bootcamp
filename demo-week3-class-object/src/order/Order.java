package order;

public class Order {

  private Transaction[] transactions; // items

  // private double total;

  public Order(Transaction[] transactions) {
    // Pass by
    this.transactions = transactions;
  }

  // getTotal() -> sum up subtotal
  public double getTotal() {
    double total = 0;

    for (int i = 0; i < this.transactions.length; i++) {
      System.out.println("subtotal=" + transactions[i].getSubtotal());
      total += this.transactions[i].getSubtotal(); // object.method()
    }
    return total;
  }
}
