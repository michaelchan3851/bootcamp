public class Cat extends GameMember implements Move{
  // int score = 0;
  String name;

  @Override
  public void jump() {
    super.addScore(4);
    //GameMember.up(this);
  }
  
  @Override
  public void bigJump() {
    
  }

  @Override
  public void up() {
    System.out.println("Moving up");
    super.addScore(1);
    //GameMember.up(this);
  }

  @Override
  public void down() {

  }

  @Override
  public void left() {

  }

  @Override
  public void right() {

  }
}
