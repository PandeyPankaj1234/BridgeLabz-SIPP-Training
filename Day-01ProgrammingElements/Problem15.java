import java.util.Scanner;

public class Problem15 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of people: ");
        int n = sc.nextInt();
        int maxHandshakes = n * (n - 1) / 2;
        System.out.println("The maximum number of handshakes possible is: " + maxHandshakes);
    }
}
