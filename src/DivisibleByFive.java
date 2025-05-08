
public class DivisibleByFive {
    public static void main(String[] args) {
        System.out.println("Divisible by 5 from 1 to 100");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
