public class ReverseQuiz {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 10};
        printArray(a);
        int[] b = reverseArray(a);
        printArray(b);
    }

    public static void printArray(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }
}