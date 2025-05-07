import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter radius of circle");
            double radius = input.nextDouble();
            double area = 3.1415926535897932384626433832795 * radius * radius;
            System.out.println("Area of circle = " + area);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
