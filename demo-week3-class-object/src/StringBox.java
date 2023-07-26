public class StringBox { // class
  
  private String string; // String -> Class

  public StringBox(){

  }

  public StringBox(String String) {
    if (string == null)
    this.string = "";
    this.string = string;
  }

  public void setString(String string) {
    this.string = string;
  }

  public String geString() {
    return this.string;
  }

  public StringBox append(String str) { // obj.append()
    if(str == null || "".equals(str)) // important!!! if "" is null, if reference is null, server will be dead
    return this;
    this.string = this.string + str;
    // return this.string;
    return this; // return StringBox object reference
  }

  public static StringBox append(String str, String str2){
    return new StringBox(str + str2);
  }

  public String toString() {
    return this.string;
  }

  // public StringBox insert(String str,int index ) {
  // this.string = this.string.substring(0, index - 1) + str +
  // this.string.substring(index);
  // return this;
  // }

  /* 
  * @param index 
  * @param s The string to be inserted
  * @return Object Of StringBox
  */
  public StringBox insert(String s, int idx) {
    // index range?
    if(idx < 0 || idx > this.string.length())
    return this;
    if (s== null || "".equals(s))
    return this;
    // s == null
    // return new StringBox(s.substring(0,index)) + s + s.substring(index));
    this.string = this.string.substring(0, idx) + s + this.string.substring(idx);
    return this;
  }

  public static void main(String[] args) {
    StringBox s = new StringBox();// empty constructor
    s.setString("Java");
    System.out.println(s.append("Python"));// JavaPython
    s.append("Javascript").append("HTML").toString(); // ?????
    System.out.println(s.geString());// JavaPythonJavascriptHTML
    s.insert("hello", 5);
    System.out.println(s.geString());

    StringBox s2 = new StringBox(); // this.string -> null
    //s2.insert("h", 3); //error null can't .method *****bug*****


    String s3 = StringBox.append("hello", "world").toString(); // hello world //StringBox -> String
    
    
  }
}
