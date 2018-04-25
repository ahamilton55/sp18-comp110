public class FlimFlamV1 {
    public static void main(String[] args) {
        int size = 100;
        for (int i = 1; i <= 100; i++) {
            String out = "";
            if (i % 3 == 0) {
                out += "Flim";
            }
            if (i % 5 == 0) {
                out += "Flam";
            }

            if (out.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(out);
            }
        }
    }
}