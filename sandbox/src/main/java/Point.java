/*public class Point {
  public static void main(String[] args) {
    Distance d = new Distance(4,3);
    System.out.println("Расстояние между точками на двумерной плоскости равно: " + d.distance());
  }
 }*/

public class Point {

  public double x;
  public double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;

  }

  public double distance(Point args) {
    return Math.sqrt(Math.pow(this.x - args.x, 2) + Math.pow(this.y - args.y, 2));
  }

}



