import java.util.Scanner;

public class P22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want to print the multiplication table (6 to 9): ");
        int n = sc.nextInt();
        for(int i = 6 ; i <= 9 ; i++){
            System.out.println(n + "*" + i + " = " + (n * i));
        }
    }
}
