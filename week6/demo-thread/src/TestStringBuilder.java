public class TestStringBuilder {
  public static void main(String[] args) {
    StringBuilder sbuilder = new StringBuilder("");
    // sbuilder (reference) -> object (StringBuilder Object) -> object (array)
    // multi thread can't use StringBuilder,
    StringBuffer sBuffer = new StringBuffer();
    // support multi thread, synchronized and slower process performance
    // but overall multi thread would better performance

    Runnable appendS = () -> {
      for (int i = 0; i < 1000000; i++) {
        sbuilder.append("s");
      }
    };

    Thread thread1 = new Thread(appendS);
    Thread thread2 = new Thread(appendS);

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(sbuilder.length());// java.lang.ArrayIndexOutOfBoundsException
  }
}
