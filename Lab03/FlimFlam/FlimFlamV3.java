import java.util.Scanner;

public class FlimFlamV3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 0;
        int first, second;
        System.out.print("How many values should we check? ");
        size = in.nextInt();

        System.out.print("What is the first number we should check (Flim)? ");
        first = in.nextInt();

        System.out.print("What is the second number we should check (Flam)? ");
        second = in.nextInt();

        System.out.println();
        in.close();

        for (int i = 1; i <= size; i++) {
            String out = "";
            if (i % first == 0) {
                out += "Flim";
            }
            if (i % second == 0) {
                out += "Flam";
            }

            if (out.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(out);
            }
        }
    }
}