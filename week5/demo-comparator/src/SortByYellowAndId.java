import java.util.Comparator;

public class SortByYellowAndId implements Comparator<Ball> {

  @Override
  public int compare(Ball b1, Ball b2) {
    // 1 -> means you want put b2 to left
    // -1 -> means you want put b1 to left
    if (b2.color == Color.YELLOW && b1.color == Color.YELLOW)
      return b2.id < b1.id ? 1 : -1;
    if (b2.color == Color.YELLOW)
      return 1;
    if (b1.color == Color.YELLOW)
      return -1;
    return b2.id > b1.id ? 1 : -1;
  }

}
