public class ReverseString {
  public static void main(String[] args) {
    String str = "test";

    String[] strArr = str.split("");

    for(int i=0; i < strArr.length; i++) {
      System.out.println(strArr[i]);
    }
  }
}
