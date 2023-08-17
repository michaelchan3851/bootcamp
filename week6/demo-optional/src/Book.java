public class Book {
  String author;

  public Book(String author) {
    this.author = author;
  }

  @Override
  public String toString() {
    return "[Author=" + this.author
        + "]";
  }
}
