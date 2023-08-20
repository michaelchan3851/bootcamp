public interface Sofa extends Furniture {
  boolean hasLegs();

  boolean sitOn();

  void destory();

  public static Sofa createSofa(Style style) {
    Sofa sofa = switch (style) {
      case MODERN -> new ModernSofa();
      case VICTORRIAN -> new VictorianSofa();
    };
    return sofa;
  }

}
