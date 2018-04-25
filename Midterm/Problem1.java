public class Problem1 {
    public static void main(String[] args) {
        for (int i=10; i<15; i++) { System.out.print((i+1) + " "); }
        System.out.println();

        for (int i=10; i<=15; i++) { System.out.print((i+1) + " "); }
        System.out.println();

        for (int i=0; i<5; i++) { System.out.print((i-1) + " "); }
        System.out.println();
        
        for (int i=0; i<=5; i++) { System.out.print((i-1) + " "); }
        System.out.println();

        for (int i=5; i>=0; i--) { System.out.print(i + " "); }
        System.out.println();

        for (int i=5; i>=1; i--) { System.out.print(i + " "); }
        System.out.println();

        for (int i=5; i<=0; i--) { System.out.print((i+1) + " "); }
        System.out.println();

        int i = 1;
        while (i <= 10) {
            if(i % 3 == 0) System.out.print("a ");
            else if (i%5 == 0) System.out.print("b ");
            else System.out.print("c ");
            i++;
        }
        System.out.println();

        i = 1;
        while (i <= 10) {
            if (i%4 == 0) System.out.print("a ");
            if (i%7 == 0) System.out.print("b ");
            System.out.print("c ");
            i++;
        }
        System.out.println();
    }
}