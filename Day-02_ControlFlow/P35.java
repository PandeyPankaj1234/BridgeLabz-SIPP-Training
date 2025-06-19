import java.util.*;

public class P35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for Physics, Chemistry, and Mathematics:");

        double physics = sc.nextDouble();
        double chemistry = sc.nextDouble();
        double mathematics = sc.nextDouble();

        double totalMarks = physics + chemistry + mathematics;
        double averagePercentage = (totalMarks / 300) * 100;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");

        if (averagePercentage >= 60) {
            System.out.println("Grade: A");
        } else if (averagePercentage >= 50) {
            System.out.println("Grade: B");
        } else if (averagePercentage >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
    }
}

