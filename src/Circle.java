/**
 * Created by student on 22.04.2015.
 */
public class Circle {
    protected double radius;
    protected String color;



    // 1st constructor, which sets both radius and color to default
    public Circle() {
        radius = 1.0;
        color = "red";
    }
    // 2nd constructor with given radius, but color default
    public Circle(double r) {
        radius = r;
        color = "red";
    }
    // 3rd constructor with both given radius and color
    public Circle(double r, String color) {
        radius = r;
        this.color = color;
    }
    // A public method for retrieving the radius
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
   // A public method for computing the area of circle
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public String toString() {
        return "Circle: radius = " + radius + ", color = " + color;
    }
}
