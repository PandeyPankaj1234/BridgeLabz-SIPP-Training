import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a value");
        int n=sc.nextInt();
        int fact=1;
        if(n<=0){
            System.out.println("Please enter a positive value");
            n=sc.nextInt();
        }
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial of a number " + n + " is " + fact);
        
    }
    
}
