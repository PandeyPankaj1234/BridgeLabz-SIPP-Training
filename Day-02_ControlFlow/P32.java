import java.util.Scanner;

public class P32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to count its digits:");
        int number = sc.nextInt();
        int count = 0;
        if (number == 0) {
            count = 1;
        } else {
            while (number != 0) {
                number /= 10; 
                count++; 
            }
        }

        System.out.println("The number of digits is: " + count);
    }
}
