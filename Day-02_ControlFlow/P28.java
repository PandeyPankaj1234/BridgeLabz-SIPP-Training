import java.util.Scanner;

public class P28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight in kg:");
        double weight = sc.nextDouble();
        System.out.println("Enter your height in meters:");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 24.9) {
            category = "Normal weight";
        } else if (bmi < 29.9) {
            category = "Overweight";
        } else {
            category = "Obesity";
        }
        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("You are classified as: " + category);
    }
}
