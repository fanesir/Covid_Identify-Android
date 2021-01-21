package flag.math;

public class Shape {    // 代表圖形原點的類別
  protected double x,y; // 座標

  public Shape(double x,double y) {
    this.x = x;
    this.y = y;
  }

  public String toString() {
    return "圖形原點：(" + x + ", " + y + ")";
  }
}
