public class Quiz3Check {
  public static void main(String[] args) {
    int a, b, c = 0;

    a = 2;
    b = 3;
    c = 4;

    System.out.println(a + " " + b + " " + c);

    a = a + 6;
    b = c + 3 * 4;
    c = 15 % 4;

    System.out.println(a + " " + b + " " + c);

    a = a++;
    b += 4;
    c = ++c;

    System.out.println(a + " " + b + " " + c);

    boolean x, y, z;

    x = a > b;
    y = c != b;
    z = a > b && c != b;

    System.out.println(x + " " + y + " " + z);
  }
}
