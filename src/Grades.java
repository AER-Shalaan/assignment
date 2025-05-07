
import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter your grade");
            int grade = input.nextInt();
            if (grade >= 80) {
                System.out.println("A");
            } else if (grade < 80 && grade >= 60) {
                System.out.println("B");
            } else if (grade < 60 && grade >= 40) {
                System.out.println("C");
            } else if (grade < 40) {
                System.out.println("F");
            } else {
                System.out.println("Invalid grade");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
