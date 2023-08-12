public class Clothes <T>{
  T identifies;

  public T getIdentifies(){
    return this.identifies;
  }

  public void setIdentifies(T identifies){
    this.identifies = identifies;
  }

  public static void main(String[] args) {
    Clothes<String> dress= new Clothes<>();
    Clothes<Integer> id = new Clothes<>();
  }
}
