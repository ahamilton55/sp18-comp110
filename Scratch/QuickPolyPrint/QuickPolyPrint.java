// Lab Exam?
//
// Could have them improve it
//   Don't print out double negatives
//   Don't print out 1 before a variable
//   Don't duplicate what is print
//
public class QuickPolyPrint {
  public static void main(String[] args) {
    double a, b, c = 0;
    String str = "";

    a = 1;
    b = -2;
    c = 3;

    if (a != 0) {
      if (a < 0) {
        str = "-" + a + "x2";
      } else {
        str = a + "x2";
      }
    }

    if (b != 0) {
      if (b < 0) {
        str = str + " - " + b + "x";
      } else {
        str = str + " + " + b + "x";
      }
    }

    if (c != 0) {
      if (c < 0) {
        str = str + " - " + c;
      } else {
        str = str + " + " + c;
      }
    }

    System.out.println(str);
  }
}
