import java.util.Scanner;

public class P19 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to find its greatest factor:");
        int number = sc.nextInt();
        int greatestFactor = 1; 
        for (int i = 1; i <= number / 2; i++) { 
            if (number % i == 0) { 
                greatestFactor = i; 
            }
        }
        System.out.println("The greatest factor of " + number + " is: " + greatestFactor);   
    }
}
