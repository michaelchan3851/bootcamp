public class invoice {

  // A method to calculate item total prices
  public static double calcTotalItemPrices(int quatities, double unitPrices) {
    // Early Return
    // Parameters Control
    if (quatities < 0 || unitPrices < 0) {
      return 0;
    }
    return quatities * unitPrices; // main logic
  } // return can be more than 1

  // A method to caculate total amount of the invoice
  public static double calcInvoiceTotalAmount(double[] totalItemPrices) {
    double total = 0.0d;
    for (int i = 0; i < totalItemPrices.length; i++) {
      total += totalItemPrices[i];
    }
    return total;
  }

  public static void main(String[] args) {
    int[] quatities = new int[] { 5, 10, 4, 7, 20 };
    double[] unitPrices = new double[] { 10.9, 100.3, 2.1, 9.0, 1000.3 };
    double[] totalItemPrices = new double[unitPrices.length];// [54.4,...]

    for (int i = 0; i < totalItemPrices.length; i++) {
      totalItemPrices[i] = calcTotalItemPrices(quatities[i], unitPrices[i]);
      System.out.println("Total item prices = " + totalItemPrices[i]);
    }

    // Loop

    double invoiceTotalAmount = calcInvoiceTotalAmount(totalItemPrices);//
    System.out.println("Total Amount = " + invoiceTotalAmount);

  }
}