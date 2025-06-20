import java.util.Scanner;

public class Problem17 {
     public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int o1 = a + b *c;
      int o2 = a * b + c;
      int o3 = c + a / b;
      int o4 = a % b + c;
      System.out.println("Output 1: " + o1);
      System.out.println("Output 2: " + o2);
      System.out.println("Output 3: " + o3);
      System.out.println("Output 4: " + o4);
    }
}
