package exercise.ex2;
import exercise.ex2.SimpleCircle;

public class testSimpleCircle {
    public static void main(String[] args) {
        SimpleCircle c1 = new SimpleCircle();
        System.out.println("radius is: " + c1.getRadius());
        System.out.println("Area: " + c1.getArea());
        System.out.println("Circumference: " + c1.getCircumference());

        // set new radius
        c1.setRadius(2.0);

        System.out.println("new radius: " + c1.getRadius());
        System.out.println("Area: " + c1.getArea());
        System.out.println("Circumference: " + c1.getCircumference());


        System.out.println(c1.toString());
    }
}