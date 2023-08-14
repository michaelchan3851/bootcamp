package person;

import java.util.Deque;
import java.util.List;
import java.util.Queue;

public interface Swimable {
  void swim();

  //public static <T extends Swimable> void start(List<T> humans) {
    public static void start(List<? extends Swimable> humans) {
    for (Swimable human : humans) {
      human.swim();
    }

  // public static void main(String[] args) {
  //   Queue q = new Queue<E>();
  //   Deque d = new Deque<E>();

  // }
  }
}
