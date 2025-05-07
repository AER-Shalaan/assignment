
import java.util.Scanner;

public class SumPosNeg {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            int posSum = 0;
            int negSum = 0;
            System.err.println("Enter 6 numbers");
            for (int i = 0; i < 6; i++) {
                int num = input.nextInt();
                if (num > 0) {
                    posSum += num;
                } else if (num < 0) {
                    negSum += num;
                }
            }
            System.out.println("Sum of positive integers = " + posSum);
            System.out.println("Sum of negative integers = " + negSum);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
