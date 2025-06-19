
import java.util.*;

public class P34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an Armstrong number:");
        int number = sc.nextInt();
        while (number != 0) {
            int originalNumber = number;
            int sum = 0;
            int count = 0;
            while (originalNumber != 0) {
                originalNumber /= 10;
                count++;
            }
            originalNumber = number;
            while (originalNumber != 0) {
                int digit = originalNumber % 10;
                sum += Math.pow(digit, count);
                originalNumber /= 10;
            }
            if (sum == number) {
                System.out.println(number + " is an Armstrong number.");
                break;
            } else {
                System.out.println(number + " is not an Armstrong number.");
                break;
            }
        }
    }
}