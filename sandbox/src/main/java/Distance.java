/*public class Distance {
  public double p1;
  public double p2;

  public Distance(double p1, double p2){
    this.p1 = p1;
    this.p2 = p2;
  }
  public double distance(){
    return Math.sqrt((p1 * p1) + (p2 * p2));
  }

}*/

public class Distance {

  public static void main(String[] args) {
    Point p1 = new Point(4, 3);
    Point p4 = new Point(0, 7);
    System.out.println("Расстояние между точками равняется" + " " + p1.distance(p4));
  }
}