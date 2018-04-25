public class AddOne {
    public static void main(String[] args) {
        int a = 1;
        int b = a++;
        int c = ++a;

        System.out.println(a + " " + b + " " + c);
    }
}