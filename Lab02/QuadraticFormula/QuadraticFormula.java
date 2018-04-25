import java.util.*;

public class QuadraticFormula {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, r1, r2;
        String equation = "";

        System.out.println();
        System.out.println("Quadratic Formula");
        System.out.println();

        System.out.print("Pleae enter the first coefficient: ");
        a = in.nextDouble();

        System.out.print("Please enter the second coefficient: ");
        b = in.nextDouble();

        System.out.print("Please enter the third coefficient: ");
        c = in.nextDouble();

        System.out.println();
        if (a != 0.0) {
            equation = a + "x²";
        }
        if (b > 0.0) {
            if (a != 0.0) {
                equation = equation + " + " + b + "x";
            } else {
                equation = equation + b + "x";
            }
        } else if (b < 0.0) {
            if (a != 0.0) {
                equation = equation + " - " + Math.abs(b) + "x";
            } else {
                equation = equation + " -" + Math.abs(b) + "x";
            }
        }

        if (c > 0.0) {
            equation = equation + " + " + c;
        } else if (c < 0.0) {
            equation = equation + " - " + c;
        }
        System.out.println("Equation: " + equation);

        r1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        r2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

        System.out.println();
        System.out.printf("Quadratic forumla result: r1 = %f, r2 = %f\n", r1, r2);
    }
}