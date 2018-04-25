public class PrintShapesV2 {
    public static void main(String[] args) {
        int size = 10;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == i) {
                    System.out.print("X");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}