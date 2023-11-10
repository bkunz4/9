public class Test {
  /*main method*/
  public static void main(String[] args) {
    /*creates circle objects*/
    Circle circle1 = new Circle(10.0);
    Circle circle2 = new Circle(5.0);
    Circle equalCircle;

    /*displays results*/
    equalCircle = Circle.findEqual(circle1, circle2);
    if(equalCircle == null){
      System.out.println("The circles are equal.");
    }else{
      System.out.println("The circles are not equal.");
    
    }
  }

}