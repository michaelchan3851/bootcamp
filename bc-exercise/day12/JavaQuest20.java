/*
 * Question : Given two strings s and goal, 
 * return true if and only if s can become goal after N shifts on s.

Definition of a shift:
Moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.

Assume the input need to be lowercase English letters.
*/
public class JavaQuest20 {

  public static void main(String[] args) {
    System.out.println(rotateString("abcde", "cdeab"));// true
    System.out.println(rotateString("abcde", "abced"));// false
    System.out.println(rotateString("abcde", "eabcd"));// true
    System.out.println(rotateString("abcde", "abcde"));// true
    
  }

  public static boolean rotateString(String s, String goal) {
    char[] arr = s.toCharArray();
    for (int i = 0; i < arr.length+1; i++) {
      char temp = arr[0];
        for (int j = 0; j < arr.length-1; j++) {
          if (String.valueOf(arr).equals(goal)) {
            return true;
          }
          arr[j] = arr[j + 1];
        }
        arr[arr.length - 1] = temp;
      }
      return false;
    }
  }
