/*
 * Question : given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
 * 
 * Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
 * 
 * Return true if a and b are alike. Otherwise, return false.
 */

// hints : substring() , toCharArray() ?
public class JavaQuest23 {
  public static void main(String[] args) {
    System.out.println(sameNumberOfVowels("book")); // true
    System.out.println(sameNumberOfVowels("textbook")); // false
    // String s = "book";
    // int  half =s.length()/2 ;
    // System.out.println(half);

  }

  public static boolean sameNumberOfVowels(String s) {
    // code here
    int  half =s.length()/2 ;
    char[] chars = s.substring(0,half).toCharArray();
    char[] chars2 = s.substring(half).toCharArray();
    int count1 = 0;
    int count2 = 0;
    for(int i = 0; i< chars.length;i++){
      if(chars[i] == 'a'|| chars[i] =='e'|| chars[i] =='i'
      || chars[i] =='o'|| chars[i] =='u'|| chars[i] =='A'
      || chars[i] =='E'|| chars[i] =='I'|| chars[i] =='O'|| chars[i] =='U'){
        count1++;
      }
      if(chars2[i] == 'a'|| chars2[i] =='e'|| chars2[i] =='i'
      || chars2[i] =='o'|| chars2[i] =='u'|| chars2[i] =='A'
      || chars2[i] =='E'|| chars2[i] =='I'|| chars2[i] =='O'|| chars2[i] =='U'){
        count2++;
      }
    }
    if(count1 == count2){
      return true;
    }
    return false;
  }
}