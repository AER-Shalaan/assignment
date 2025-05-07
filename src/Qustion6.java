public class Qustion6 {

    public static void main(String[] args) {
        int x = 3;
        int y = 2;
        int z = x++; // --> z = x then x = x + 1 (z = 3, x = 4)
        int w = ++y; // --> y = y + 1 then w = y (y = 3, w = 3)
        System.out.println("x = " + x); // x = 4
        System.out.println("y = " + y); // y = 3
        System.out.println("z = " + z); // z = 3
        System.out.println("w = " + w); // w = 3
    }
}
