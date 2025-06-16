import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("num1 " + num1 + " is greater than num2 and num3 ");
        }
        else if(num2>num1 && num2>num3){
            System.out.println("num2 " + num2 + " is greater than num1 and num3");
        }
        else{
            System.out.println("num3 " + num3 + " is greater than num1 and num2");
        }
    }
}
