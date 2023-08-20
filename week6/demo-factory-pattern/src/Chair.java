public interface Chair extends Furniture{
  boolean hasLegs();

  boolean sitOn();

  public static Chair createChair(Style style){
    Chair chair = switch(style){
      case MODERN -> new ModernChair();
      case VICTORRIAN -> new VictorianChair();
    };
    return chair;
  }


}
