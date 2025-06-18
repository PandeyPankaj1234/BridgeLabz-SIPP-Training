import java.util.Scanner;

public class P30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an abundant number:");
        int number = sc.nextInt();
        int sumOfFactors = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfFactors += i;
            }
        }
        if (sumOfFactors > number) {
            System.out.println(number + " is an abundant number.");
        } else {
            System.out.println(number + " is not an abundant number.");
        }
    }
}
