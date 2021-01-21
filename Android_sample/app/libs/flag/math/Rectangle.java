package flag.math;

public class Rectangle extends Shape {
  private double w,h;   // �x�Ϊ��e�P��

  public Rectangle(double x,double y,double w, double h) {
    super(x,y);         // �I�s�����O�غc��k
    this.w = w;
    this.h = h;
  }
}
