public class PrintShapesV3 {
    public static void main(String[] args) {
        int size = 10;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == i) {
                    System.out.print("X");
                } else if (j == (size - 1) - i){
                    System.out.print("X");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}