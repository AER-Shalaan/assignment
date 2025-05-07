
import java.util.Scanner;

public class VowelChecker {

    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a letter");
            char ch = input.next().charAt(0);
            ch = Character.toLowerCase(ch);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
