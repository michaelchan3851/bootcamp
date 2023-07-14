/**
 * 
 * When target = 'c', the expected output:
 * We found 3 character c in the String.
 * 
 * When target = 'z', the expected output:
 * Not Found.
 */
// Count the target of character in a String.
public class JavaQuest5 {
  public static void main(String[] args) {
    String str = "Welcome to the coding bootcamp."; // You should not change this line
    char target = 'c'; // Update this target to test the logic
    char target2 = 'z';
    int count = 0;
    int count2 = 0;
    boolean found = false;
    boolean found2 = false;

    // Use a loop to count the target of character in a String.
    // code here
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'c') {
        count++;
      }
      if (count >= 3) {
        found = true;
        break;
      }
    }
    // if found, print "We found 3 character c in the String."
    // if not found, print "Not Found."
    // code here
    if (found == true) {
      System.out.println("We found 3 character " + target + " in the String.");
    } else {
      System.out.println("Not found");
    }

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'z') {
        count2++;
      }
      if (count2 >= 3) {
        found2 = true;
        break;
      }
    }
    if (found2 == true) {
      System.out.println("We found 3 character " + target2 + " in the String.");
    } else {
      System.out.println("Not found");
    }

  }
}
