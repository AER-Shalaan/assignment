
import java.util.Scanner;

public class SortThreeFloats {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter first number");
            float a = input.nextFloat();
            System.out.println("Enter second number");
            float b = input.nextFloat();
            System.out.println("Enter third number");
            float c = input.nextFloat();
            float temp;
            if (a > b) {
                temp = a;
                a = b;
                b = temp;
            }
            if (b > c) {
                temp = b;
                b = c;
                c = temp;
            }
            if (a > b) {
                temp = a;
                a = b;
                b = temp;
            }
            System.out.println(a + " " + b + " " + c);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
