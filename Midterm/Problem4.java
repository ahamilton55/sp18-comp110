import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter x: ");
        int x = in.nextInt();
        System.out.println();

        int r = 1;
        int n = 0;

        System.out.println("+---------------------------------+----------------+----------------+");
        while (r * 2 < x) {
            System.out.printf("| r * 2 < x = %2d * 2 < %2d = %5b | r = r * 2 = %2d | n = n + 1 = %2d |\n", r, x, (r*2<x), (r*2), (n+1));
            r *= 2;
            n++;
        }
        System.out.printf("| r * 2 < x = %2d * 2 < %2d = %5b |                |                |\n", r, x, (r*2<x));
        System.out.println("+---------------------------------+----------------+----------------+");
        System.out.println();
        System.out.println("r = " + r);
        System.out.println("n = " + n);
        System.out.println();

        String val = "";
        System.out.println("+-------+----------------------+--------------------------+-------------------------+");
        for(int i = n; i >= 0; i--) {
            System.out.printf("| i = %d | x / r = %2d / %2d = %2d | x = x %% r = %2d %% %2d = %2d | r = r / 2 = %2d / 2 = %2d |\n", i, x, r, x/r, x, r, x%r, r, r/2);

            val = val + (x/r);
            x = x%r;
            r = r/2;
        }
        System.out.println("+-------+----------------------+--------------------------+-------------------------+");

        System.out.println();
        System.out.println("Value: " + val);
    }
}