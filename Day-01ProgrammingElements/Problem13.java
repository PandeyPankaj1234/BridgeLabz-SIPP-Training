import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of side A: ");
        double a = sc.nextDouble();
        System.out.print("Enter the length of side B: ");
        double b = sc.nextDouble();
        System.out.print("Enter the length of side C: ");
        double c = sc.nextDouble();
        
        double perimeter = a + b + c;
        System.out.println("Enter the distance travelled by the athlete: ");
        double distance = sc.nextDouble();
        double rounds = distance / perimeter;
        System.out.println("the total rounds covered by the athlete is : " + rounds);
    }
}
