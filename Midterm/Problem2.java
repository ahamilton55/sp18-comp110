import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = in.nextInt();

        int oddcount = 0, oddsum = 0, evencount = 0, evensum = 0;

        for (int i=1; i <= n; i++) {
            System.out.print("Enter value: ");
            int v = in.nextInt();

            if (v % 2 == 0) {
                evencount++;
                evensum += v;
            } else {
                oddcount++;
                oddsum += v;
            }
        }

        System.out.println("oc=" + oddcount + ", os=" + oddsum);
        System.out.println("ec=" + evencount + ", es=" + evensum);

        in.close();
    }
}