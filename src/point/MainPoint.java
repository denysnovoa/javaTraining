package point;

public class MainPoint {

  public static void main(String args[]) {
    Point point = new Point();

    System.out.println();
    System.out.printf("New Point %s ",new Point().toString());

    System.out.println();
    System.out.printf("Add Point %s ", point.addPoint(new Point(56.22, 2)).toString());

    System.out.println();
    System.out.printf("Subtract Point %s ",point.subtractPoint(new Point(5.22, -12)).toString());

    System.out.println();
    System.out.printf("Displace Point %s ",point.displace(56.22).toString());

    System.out.println();
    System.out.printf("Distance Two Point %s ", Point.getDistance(new Point(23.3, 2), new Point(34.2222, -0)));

  }
}
