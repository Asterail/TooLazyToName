/**
 * Created by student on 22.04.2015.
 */
public class Cylinder extends Circle {
    private double height;

    // Constructor with default color, radius and height
    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
    @Override
    public String toString() {
        return "Cylinder: \n"
                + super.toString() + ",\n"
                + "height= " + getHeight() + ",\n"
                + "base area= " + getArea() + ",\n"
                + "volume= " + getVolume();
    }
}