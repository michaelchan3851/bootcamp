package order;

public class Order {

  private Transaction[] transactions;

  public Order(Transaction[] transactions) {
    // Pass by
    this.transactions = transactions;
  }

  // getTotal() -> sum up subtotal
  public double setTotal(this.Transaction.getSubtotal()){
  double total = 0;

  for(int i = 0; i < this.Transaction.getSubtotal().length; i++){
  total[i] += this.transactions.getSubtotal();
  }
  return this;
}
  
}
