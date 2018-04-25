import java.util.Scanner;

public class PrintShapesV1a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int width, height;

        System.out.print("What is the width? ");
        width = in.nextInt();

        System.out.print("What is the height? ");
        height = in.nextInt();

        System.out.println();
        in.close();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}