public class Tracing {
    public static void main(String[] args) {
        int i = 1;
        int j = 4;
        int k = 0;

        System.out.println(i + " " + j + " " + k);

        k = i + j;
        j = k / i;
        i = 5;

        System.out.println(i + " " + j + " " + k);

        i = 6 + i;
        j = i + j;
        k = i - k;

        System.out.println(i + " " + j + " " + k);
    }
}