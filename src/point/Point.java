package point;

public class Point {

  private final double y;
  private final double x;

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public Point() {
    this.x = 0;
    this.y = 0;
  }

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public Point(Point point) {
    this.x = point.getX();
    this.y = point.getY();
  }

  public Point addPoint(Point point) {
    return new Point(this.x + point.getX(), this.y + point.getY());
  }

  public Point subtractPoint(Point point) {
    return new Point(this.x - point.getX(), this.y - point.getY());
  }

  public Point displace(double value) {
    return new Point(this.x + value, this.y + value);
  }

  public static double getDistance(Point pointOne, Point pointTwo) {
    return Math.sqrt((Math.pow(pointOne.getX(), 2) + Math.pow(pointTwo.getX(), 2))
        + (Math.pow(pointOne.getY(), 2) + Math.pow(pointTwo.getY(), 2)));
  }

  public String toString() {
    return String.format("( %s , %s )", this.x, this.y);
  }
}
