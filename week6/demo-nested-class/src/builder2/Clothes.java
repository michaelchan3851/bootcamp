package builder2;

public class Clothes {
  private Gender gender;
  private Size size;
  private String type;

  private Clothes(Builder builder) {
    this.gender = builder.gender;
    this.size = builder.size;
    this.type = builder.type;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public String toString() {
    return "[Gender=" + this.gender
        + ", Size=" + this.size
        + ", Type=" + this.type + "]";
  }

  public static class Builder {
    private Gender gender;
    private Size size;
    private String type;

    public Builder gender(Gender gender) {
      this.gender = gender;   
      return this;
    }

    public Builder size(Size size) {
      this.size = size;
      return this;
    }

    public Builder type(String type) {
      this.type = type;
      return this;
    }

    public Clothes build() {
      return new Clothes(this);
    }

  }

  public static void main(String[] args) {
    Clothes clothes = new Clothes.Builder()
    .gender(Gender.FEMALE)
    .size(Size.M)
    .type("dress")
    .build();
    System.out.println(clothes);

  }
}
