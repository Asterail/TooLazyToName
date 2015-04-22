/**
 * Created by student on 22.04.2015.
 */
public class TestCircle {
    public static void main(String[] args) {
        // Declare and allocate an instance of class Circle called c1
        //  with default radius and color
        Circle c1 = new Circle();
        // Use the dot operator to invoke methods of instance
        System.out.println(c1);
        // Declare and allocate an instance of class circle called c2
        //  with the given radius and default color
        Circle c2 = new Circle(2.0, "синий");
        System.out.println(c2);
    }
}
