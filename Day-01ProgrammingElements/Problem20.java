import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.print("Enter first number: ");
        float num1 = scanner.nextFloat();
        System.out.print("Enter second number: ");
        float num2 = scanner.nextFloat();

        float sum = num1 + num2;
        System.out.println("Sum: " + sum);
        

        float difference = num1 - num2;
        System.out.println("Difference: " + difference);
        
 
        float product = num1 * num2;
        System.out.println("Product: " + product);
        
   
        if (num2 != 0) {
            double quotient = (double) num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}
