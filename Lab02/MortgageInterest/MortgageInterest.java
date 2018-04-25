import java.util.*;

public class MortgageInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double p, rate, mrate, years, months, payments;

        System.out.println();
        System.out.println("Mortgage Payment Calculator");
        System.out.println();

        System.out.print("What is the principal? ");
        p = in.nextDouble();

        System.out.print("What is the annual rate? ");
        rate = in.nextDouble();

        System.out.print("What is the term of the loan? ");
        years = in.nextDouble();

        months = years * 12.0;
        mrate = rate / 12.0;

        payments = (p * mrate) / (1 - Math.pow(1+mrate, -months));

        System.out.println();
        System.out.printf("The monthly payment is $%.2f\n", payments);
    }
}
