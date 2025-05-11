import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int num = input.nextInt();
            int count = 0;
            while (num > 0) {
                num /= 10;
                count++;
            }
            System.out.println("Number of digits: " + count);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
