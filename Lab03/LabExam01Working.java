import java.util.*;

public class LabExam01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sequenceID;
        int n;

        while(true) {

            System.out.println("Available Numeric Sequences");
            System.out.println("=================");
            System.out.println("  1. Descending sequence");
            System.out.println("  2. Odd Numbers");
            System.out.println("  3. Even Numbers");
            System.out.println("  4. Every third number");
            System.out.println("  5. Numbers divisible by 5 but not 3");
            System.out.println();

            System.out.print("What numeric sequence would you like to print (use integer to select, 0 to quit)? ");
            sequenceID = in.nextInt();
            
            System.out.println();

            if (sequenceID == 0) {
                break;
            } else if (sequenceID > 5) {
                System.out.println("Invalid sequence ID entered. Try again!");
                continue;
            }

            System.out.print("How many iterations? ");
            n = in.nextInt();


            if (n <= 0) {
                System.out.println("Iterations should be greather than 0");
                continue;
            }

            System.out.println();

            if (sequenceID == 1) {
                for(int i = n; i > 0; i--) {
                    System.out.printf("%3d", i);
                }
            } else if (sequenceID == 2) {
                for(int i = 0; i < n; i++) {
                    System.out.printf("%3d", (2*i)+1);
                }
            } else if (sequenceID == 3) {
                for(int i = 1; i <= n; i++) {
                    System.out.printf("%3d", 2*i);
                }
            } else if (sequenceID == 4) {
                for(int i = 0; i < n; i++) {
                    System.out.printf("%3d", (3*i)+1);
                }
            } else if (sequenceID == 5) {
                int i = 1;
                int count = 0;
                while (count < n) {
                    if ((i % 5 == 0) && !(i % 3 == 0)) {
                        System.out.printf("%3d", i);
                        count++;
                    }
                    i++;
                }
            } 
            System.out.println();
            System.out.println();
        }
        in.close();

        System.out.println();
        System.out.println("Thanks for playing...");
    }
}