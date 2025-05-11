
public class AverageOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int num;
        do {
            System.out.println("Enter a number:");
            num = Integer.parseInt(System.console().readLine());
            if (num > 0) {
                sum += num;
                count++;
            }
        } while (num > 0);
        if (count == 0) {
            System.out.println("No positive numbers entered.");
        } else {
            double average = (double) sum / count;
            System.out.println("Average of positive numbers: " + average);
        }
    }
}
