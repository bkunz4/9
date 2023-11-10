public abstract class GeometricObject<E> implements Comparable<E> {
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;
  /*creates a default geometric object*/
  public GeometricObject() {
    dateCreated = new java.util.Date();
  }
  /*creates a geometric object with the specified color and filled value */
  public GeometricObject(String color, boolean filled) {
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }
  /*returns color*/
  public String getColor() {
    return color;
  }
  /*sets a new color*/
  public void setColor(String color) {
    this.color = color;
  }
  /*returns filled*/
  public boolean isFilled() {
    return filled;
  }
  /*sets a new filled*/
  public void setFilled(boolean filled) {
    this.filled = filled;
  }
  /*gets dateCreated*/
  public java.util.Date getDateCreated() {
    return dateCreated;
  }
  /*returns a string model of the object */
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color +
    " and filled: " + filled;
  }
  /*abstract compareTo method of comparable interface*/
  @Override
  public abstract int compareTo(E o);
  /*abstract method to get the area of the object*/
  public abstract double getArea();
  /*static method to find the larger object*/
  public static <T extends GeometricObject> T findEqual(T obj1, T obj2){
    if(obj1.getArea() > obj2.getArea()){
      return obj1;
    }
    else if(obj1.getArea() == obj2.getArea()){
      return null; 
    }
    else{
      return obj2;
    }
  }
}