import java.util.Scanner;

public class FlimFlamV2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 0;
        System.out.print("How many values should we check? ");
        size = in.nextInt();

        System.out.println();
        in.close();

        for (int i = 1; i <= size; i++) {
            String out = "";
            if (i % 3 == 0) {
                out += "Flim";
            }
            if (i % 5 == 0) {
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