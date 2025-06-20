import java.util.*;
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int birthYear = sc.nextInt();
        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = sc.nextInt();
        System.out.print("Enter your birth day (1-31): ");
        int birthDay = sc.nextInt();
        System.out.print("Enter the current year: ");
        int currentYear = sc.nextInt();
        System.out.print("Enter the current month (1-12): ");
        int currentMonth = sc.nextInt();
        System.out.print("Enter the current day (1-31): ");
        int currentDay = sc.nextInt();
        int age = currentYear - birthYear;
        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age--;
        }
        System.out.println("Your age is: " + age + " years.");
        if (age < 0) {
            System.out.println("Invalid date of birth entered.");
        } else if (age < 18) {
            System.out.println("You are a minor.");
        } else if (age < 60) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }
    }
}   
