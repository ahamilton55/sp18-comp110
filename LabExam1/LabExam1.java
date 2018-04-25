public class LabExam1 {
  public static void main(String[] args) {
    int[] check = {2, 5, 7, 9, 9, 10, 6, 4, 3, 2, 5};
    int max = 0;
    int min = Integer.MAX_VALUE;
    int avg = 0;
    int sum = 0;

    for (int i = 0; i < check.length; i++) {
      if (check[i] > max) {
        max = check[i];
      }
      if (check[i] < min) {
        min = check[i];
      }
      sum += check[i];
    }

    avg = sum / check.length;

    System.out.println("Maximum: " + max);
    System.out.println("Minimum: " + min);
    System.out.println("Average: " + avg);
  }
}


