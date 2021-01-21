package flag.math;

public class Cylinder extends Circle {
  private double h;     // 圓柱高度

  public Cylinder(double x,double y,double r,double h) {
    super(x,y,r);       // 呼叫父類別建構方法
    this.h = h;
  }
}
