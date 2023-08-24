public class TestSynchronizedLock {

  int x;
  Object lock = new Object();

  public int calculate(int amount) {
    int total = amount;
    synchronized (lock) {
      this.x++;
    }
    // codes ...
    // can be mroe than one synchronized code block
    // synchronized (this.lock){
    // this.x++;
    // }
    return total + this.x;

  }

  // public synchronized void increment() {
  // this.x++;
  // }

  public static void main(String[] args) {

    TestSynchronizedLock obj = new TestSynchronizedLock();

    Runnable formula = () -> {
      for (int i = 0; i < 100000; i++) {
        obj.calculate(0);
      }
    };

    Thread thread1 = new Thread(formula);
    Thread thread2 = new Thread(formula);

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(obj.x); //2000000

  }
}