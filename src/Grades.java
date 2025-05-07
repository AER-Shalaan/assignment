import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter your grade");
            char grade = input.next().charAt(0);
            grade = Character.toUpperCase(grade);
            switch (grade) {
                case 'A' -> System.out.println("Marks >= 80");
                case 'B' -> System.out.println("Marks >= 60 and < 80");
                case 'C' -> System.out.println("Marks >= 40 and < 60");
                case 'F' -> System.out.println("Marks < 40");
                default -> System.out.println("Invalid grade");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
