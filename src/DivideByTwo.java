
import java.util.Scanner;

public class DivideByTwo {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int num = input.nextInt();
            int count = 0;
            while (num > 0 && num % 2 == 0) {
                num /= 2;
                count++;
            }
            System.out.println("Number of divisions by two: "+ count);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
