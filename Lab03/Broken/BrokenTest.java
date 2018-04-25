// This file has comments on each line that describe what type of error would occur
// with the different issues throughout the file

// The line below was missing and needed to be added for the Scanner class
import java.util.*; // 3 (compiler)

public class LabExam01Test {
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
            // The line below was missing a semi-colon
            System.out.println("  5. Numbers divisible by 5 but not 3"); // 1 (compiler)
            System.out.println();

            System.out.print("What numeric sequence would you like to print (use integer to select, 0 to quit)? ");
            // The line below was trying to use a Scanner named "input" when the scanner created
            // above was named "in". The easiest fix was to change the scanner _here_ to be "in" instead
            // of "input".
            sequenceID = in.nextInt(); // 4 (compiler)
            
            // The line below was missing the "System.out." part of the statement. It should have been
            // added to fix the statement.
            System.out.println(); // 5 (compiler)

            if (sequenceID == 0) {
                break;
            } else if (sequenceID < 0 || sequenceID > 5) {
                System.out.println("Invalid sequence ID entered. Try again!");
                continue;
            }

            System.out.print("How many iterations? ");
            // The line below was using "next" which returns a string when we required an integer
            // We should change this to use the "nextInt()" method that is part of the Scanner class
            n = in.nextInt(); // 6 (compiler)

            if (n <= 0) {
                System.out.println("Iterations should be greather than 0");
                continue;
            }

            System.out.println();

            // The line below was looking for the value 0. The value to check for should have been changed
            // to be the integer 1.
            if (sequenceID == 1) { // 7 (runtime)
                // The loop below was an infinite loop because the count "i", was being incremented by 1
                // instead of being decremented by 1.
                for(int i = n; i > 0; i--) { // 8 (runtime)
                    System.out.printf("%3d", i);
                }
            } else if (sequenceID == 2) {
                for(int i = 0; i < n; i++) {
                    System.out.printf("%3d", (2*i)+1);
                }
            } else if (sequenceID == 3) {
                // The loop below had an "off by one" error since the comparison was only "<" when the counter
                // starts at 1. Changint the counter to include executing when the variable i is equal to the 
                // value of n fixes the issue
                for(int i = 1; i <= n; i++) { // 9 (runtime)
                    System.out.printf("%3d", 2*i);
                }
            } else if (sequenceID == 4) {
                for(int i = 1; i <= n; i++) {
                    // The line below was missing a multiplication operator (*) between "3" and "i".
                    // In Java we must use an operator between every part of a mathematical statement
                    System.out.printf("%3d", (3*i)+1); // 2 (compiler)
                }
            } else if (sequenceID == 5) {
                int i = 1;
                int count = 0;
                while (count < n) {
                    // The line below was missing a negation operator (!) on the "i % 3 == 0" comparison.
                    // In the description above, we mention that the numbers should be divisible by 5
                    // but not by 3. You could either negate the entire operation as done below or you could
                    // change the comparison to be (i % 3 != 0)
                    if ((i % 5 == 0) && !(i % 3 == 0)) { // 10 (runtime)
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