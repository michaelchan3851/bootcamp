package queue1;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.List;
import java.util.ArrayList;

public class DemoArrayDeque {
  public static void main(String[] args) {
    ArrayDeque<String> strings = new ArrayDeque<>();
    strings.add("abc");
    strings.add("def");
    strings.add("abc");
    strings.poll();
    System.out.println(strings.poll());// abc
    System.out.println(strings.size());// 2
    strings.addLast("xyz"); // addLast() = add()
    System.out.println(strings.poll()); // def
    strings.addFirst("ijk");
    System.out.println(strings.peek());// ijk
    System.out.println(strings.pollFirst()); // ijk, pollFirst() = poll()
    System.out.println(strings.pollLast()); // xyz

    Deque<String> deque = new LinkedList<>(); // polymorphism
    Queue<String> queue = new LinkedList<>(); // polymorphism

    queue.add("abc");
    deque.add("abc");
    deque.addFirst("def");
    deque.addLast("ijk");

    run1(new LinkedList<>()); // linkedlist
    run1(new ArrayDeque<>()); // array
    //run1(new PriorityQueue<>()); //compile-error


    run2(new LinkedList<>()); // linkedlist
    run2(new ArrayDeque<>()); // array
    run2(new PriorityQueue<>()); 

    Collection<String> ArrayList = new ArrayList<>();
    List<String> list = new LinkedList<>();
  }

  public static void run1(Deque<String> deque) {
    deque.addFirst("ss");
    deque.addLast("ss");
  }

  public static void run2(Queue<String> queue) {
    queue.add("ss");
    queue.add("ss");
  }
}
