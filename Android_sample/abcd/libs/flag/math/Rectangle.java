package flag.math;

public class Rectangle extends Shape {
  private double w,h;   // 矩形的寬與高

  public Rectangle(double x,double y,double w, double h) {
    super(x,y);         // 呼叫父類別建構方法
    this.w = w;
    this.h = h;
  }
}
