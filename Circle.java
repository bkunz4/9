public class Circle extends GeometricObject<Circle> {
  private double radius;
    public Circle() {
    }
  public Circle(double radius) {
    this.radius = radius;
  }
  public Circle(double radius, String color, boolean filled) {
    this.radius = radius;
    setColor(color);
    setFilled(filled);
  }
  /*returns radius*/
  public double getRadius() {
    return radius;
  }
  /*sets a new radius*/
  public void setRadius(double radius) {
    this.radius = radius;
  }
  /*returns area*/
  public double getArea() {
    return radius * radius * Math.PI;
  }
  /*returns diameter*/
  public double getDiameter() {
    return 2.0 * radius;
  }
  /*return perimeter*/
  public Double getPerimeter() {
    return 2.0 * radius * Math.PI;
  }
  /*displays the circle specs*/
  public void printCircle() {
    System.out.println("The circle is created: " + getDateCreated() +
" and the radius is " + radius);
  }
  @Override    /*overrides object's toString method*/
  public int compareTo(Circle circle){
    if(this.radius == circle.getRadius()){
      return 1;
    }
    else if(this.radius > circle.getRadius()){
      return 0;
    }
    else{
      return 0;
    }
  }
}