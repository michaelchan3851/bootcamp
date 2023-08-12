package shopping;

public abstract class Item {
  int price;
  // int quatity;
  String header;
  String description;

  public Item(int price){
    this.price = price;
  }

  public Item(){
    
  }

  public int getPrice() {
    return this.price;
  }

}
