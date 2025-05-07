
import java.util.Scanner;

public class PositiveOrNegative {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int num = input.nextInt();
            if (num > 0) {
                System.out.println("Number is positive");
            } else if (num < 0) {
                System.out.println("Number is Negative");
            } else {
                System.out.println("Zero");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
