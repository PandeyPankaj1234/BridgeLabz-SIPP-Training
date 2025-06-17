import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0){
            System.out.println("n is zero");
        }
        else if(n<0){
            System.out.println("n is a negative number");

        }
        else{
            System.out.println("n is a positive number");
        }
    }
}
