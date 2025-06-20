import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of pens: ");
        int totalPens = scanner.nextInt();
        System.out.print("Enter the number of students: ");
        int totalStudents = scanner.nextInt();
        if (totalStudents == 0) {
            System.out.println("Number of students cannot be zero.");
            return;
        }
        int pensPerStudent = totalPens / totalStudents;
        int remainingPens = totalPens % totalStudents;
        System.out.println("Each student gets " + pensPerStudent + " pens.");
        System.out.println("Remaining pens: " + remainingPens);
    }
}
