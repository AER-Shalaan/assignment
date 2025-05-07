import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter first number");
            int a = input.nextInt();
            System.out.println("Enter second number");
            int b = input.nextInt();
            System.out.println("Enter third number");
            int c = input.nextInt();
            int max = a;
            int min = a;
            if (b > max) {
                max = b;
            }
            if (c > max) {
                max = c;
            }
            if (b < min) {
                min = b;
            }
            if (c < min) {
                min = c;
            }
            System.out.println("Max = " + max);
            System.out.println("Min = " + min);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
