
import java.util.Scanner;

public class TheGreatestNum {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter first number");
            int a = input.nextInt();
            System.out.println("Enter second number");
            int b = input.nextInt();
            System.out.println("Enter third number");
            int c = input.nextInt();
            int max = a;
            if (b > max) {
                max = b;
            }
            if (c > max) {
                max = c;
            }
            System.out.println("The greatest number is " + max);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
