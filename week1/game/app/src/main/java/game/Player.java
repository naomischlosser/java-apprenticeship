package game;

public class Player {
  public int randomisePlayer() {
    return (Math.random() <= 0.5) ? 0 : 1;
  }
}
