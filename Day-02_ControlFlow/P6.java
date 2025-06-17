import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Double total=0.0;
        System.out.println("Enter numbers to add (enter 0 to stop):");
        Double n = sc.nextDouble();
        while(n!=0){
            total=total+n;
            System.out.println("Enter another number (0 to stop):");
            n = sc.nextDouble();

        }
        System.out.println("result"+ total);

    }
}
