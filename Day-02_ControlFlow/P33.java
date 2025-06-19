import java.util.*;
public class P33{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int temp=n;
        while(n>0){
            int r = n%10;
            sum = sum+r;
            n = n/10;

        }
        if(temp%sum==0){
            System.out.println(temp + " is a Harshad number");
        }
        else{
            System.out.println(temp + " is not a Harshad number");
        }    
    }
}