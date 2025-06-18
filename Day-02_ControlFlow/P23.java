import java.util.Scanner;

public class P23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the years of service for the employee:");
        int yearsOfService = sc.nextInt();
        System.out.println("Enter the monthly salary of the employee:");
        double monthlySalary = sc.nextDouble();
        double bonus = 0;
        if (yearsOfService >= 5) {
            bonus = monthlySalary * 0.05; 
        } 
        System.out.println("The bonus for the employee is: " + bonus);   
    }
}
