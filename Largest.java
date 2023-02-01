//without java 8 
public class Largest {
  public static void main(String[] args) {
    int[] arr = {10, 20, 25, 40, 50, 60};
    int max1 = Integer.MIN_VALUE;
    int max2 = Integer.MIN_VALUE;
    for (int n : arr) {
      if (n > max1) {
        max2 = max1;
        max1 = n;
      } else if (n > max2 && n != max1) {
        max2 = n;
      }
    }
    System.out.println("Second largest number is: " + max2);
  }
}