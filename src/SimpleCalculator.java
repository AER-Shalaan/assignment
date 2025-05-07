
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the first number");
            double num1 = input.nextDouble();
            System.out.println("Enter the second number");
            double num2 = input.nextDouble();
            System.out.println("Enter the operation (+, -, *, /)");
            char operation = input.next().charAt(0);
            switch (operation) {
                case '+' ->
                    System.out.println(num1 + num2);
                case '-' ->
                    System.out.println(num1 - num2);
                case '*' ->
                    System.out.println(num1 * num2);
                case '/' -> {
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero");
                    } else {
                        System.out.println(num1 / num2);
                    }
                }
                default ->
                    System.out.println("Invalid operation");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
