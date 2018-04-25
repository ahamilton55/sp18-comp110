public class Problem3b {
    public static void main(String[] args) {
        int[] a = {1, 5, 4, 10};
        int[] b = {7, 9, 2, 6, 4, 7};

        int[] c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            c[i+a.length] = b[i];
        }
        
        for (int i=0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
}