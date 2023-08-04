package order;

public class Transaction {

  private int itemNo;

  private ItemDesc itemDesc; //

  private int quantity;

  private double unitPrice;

  // private double discount;

  public Transaction() {

  }

  public Transaction(int itemNo, ItemDesc itemDesc, int quantity, double unitPrice) {
    this.itemNo = itemNo;
    this.itemDesc = itemDesc;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
  }

  // getSubtotal(), no new attribute
  public double getSubtotal() {
    return this.quantity * this.unitPrice;
  }

  public void setItemNo(int itemNo) {
    this.itemNo = itemNo;
  }

  public int getItemNo() {
    return this.itemNo;
  }

  public void setItemDesc(ItemDesc itemDesc) {
    this.itemDesc = itemDesc;
  }

  public ItemDesc getItemDesc() {
    return this.itemDesc;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public double getUnitPrice() {
    return this.unitPrice;
  }
}
