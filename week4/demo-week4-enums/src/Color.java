public enum Color {
  // hexCode
  RED("#FF0000"), //
  GREEN("#FF0000"), //
  BLUE("#FF0000")//
  ;

  private String hexCode;

  private Color(String code) {
    this.hexCode = code;
  }

  public String gethexCode() {
    return this.hexCode;
  }
}
