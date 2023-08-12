/*
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
 * 
 * Note that after backspacing an empty text, the text will continue empty.
 */

import java.util.Stack;

public class JavaQuest45 {
  public static void main(String[] args) {
    System.out.println(backspaceCompare("ab#c", "ad#c")); //true
    System.out.println(backspaceCompare("ab##", "c#d#")); //true
    System.out.println(backspaceCompare("a#c", "b")); //false

  }

  // Approach 1
  public static boolean backspaceCompare(String s, String t) {
    Stack<Character> strings1= new Stack<>();
    Stack<Character> strings2= new Stack<>();
    for(int i = 0; i< s.length();i++){
      char target = s.charAt(i);
      if(!strings1.isEmpty() && target == '#'){
        strings1.pop();
      }else{
        if(target != '#')
        strings1.push(target);
      }
    }
    for(int i = 0; i < t.length();i++){
      char target2 = t.charAt(i);
      if(!strings2.isEmpty() && target2 == '#'){
        strings2.pop();
      }else{
        if(target2 != '#')
        strings2.push(target2);
      }
    }
    return strings1.equals(strings2);
  }
}