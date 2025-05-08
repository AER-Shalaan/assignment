
import java.util.Scanner;

public class PowerCalculation {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int number = input.nextInt();
            System.out.println("Enter power");
            int power = input.nextInt();
            int result = 1;
            for (int i = 0; i < power; i++) {
                result *= number;
            }
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
