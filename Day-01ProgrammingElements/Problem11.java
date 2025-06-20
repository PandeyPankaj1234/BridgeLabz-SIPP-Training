import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int parameter = sc.nextInt();
        if (parameter <= 0) {
            System.out.println("Error: Parameter must be a positive integer.");
        } else {
            double side = parameter / 4.0;
            System.out.printf("The side of the square is: %.2f sq cm%n", side);
        }
    }
}
