import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the basic salary: ");
        int bs = sc.nextInt();
        System.out.print("Enter the total bonus get by the employee: ");
        int bonus = sc.nextInt();
        int totaklSalary = bs + bonus;
        System.out.println("The total salary is: " + totaklSalary);
    }
}
