package stack1;

import java.util.Stack;

public class DemoStack {
  public static void main(String[] args) {
    // First In Last Out
    Stack<String> stack1 = new Stack<>(); //堆疊
    stack1.push("abc");
    stack1.push("def");
    System.out.println(stack1.pop()); // def
    
    stack1.push("xyz");
    stack1.push("abc");
    while(!stack1.isEmpty()){
      System.out.println(stack1.pop());// abc, xyz, abc
    }
    //stack
    stack1.add("ijk");
    stack1.push("fgi");
    stack1.add("ijk");
    System.out.println(stack1.pop());//ijk



  }
}
