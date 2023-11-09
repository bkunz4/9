public class Test {
  /*main method*/
  public static void main(String[] args) {
    /*creates circle objects*/
    Circle circle1 = new Circle(10.0);
    Circle circle2 = new Circle(5.0);
    Circle largerCircle;

    /*displays results*/
    System.out.println("There are two circles, circle1 and circle2, with radii of 10.0 and 5.0 respectively.");
      largerCircle = Circle.findLarger(circle1, circle2);
    System.out.println("The larger circle has a radius of: " + 
      largerCircle.getRadius());


  }

}