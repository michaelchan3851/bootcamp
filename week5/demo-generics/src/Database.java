import java.util.ArrayList;

public class Database<T extends Number> {
  ArrayList[] data;

  public boolean add(T data) {
    return false;
  }

  public static <S> S add(S data) {
    return data;
  }
}