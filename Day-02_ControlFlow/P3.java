import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum1 = 0;
        if (n == 0) {
            System.out.println("The number " + n + " is not a natural number");
        }
        if (n > 0) {
            sum1 = n * (n + 1) / 2;

        }
        int i = 1;
        int sum2 = 0;
        while (i <= n) {
            sum2 = sum2 + i;
            i++;
        }
        if (n != 0 && sum1 == sum2) {
            System.out.println("The sum of " + n + " natural numbers is " + sum1);
        }

    }
}
