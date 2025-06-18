import java.util.Scanner;

public class P25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the first friend:");
        int age1 = sc.nextInt();    
        System.out.println("Enter the age of the second friend:");        
        int age2 = sc.nextInt();
        System.out.println("Enter the age of the third friend:");   
        int age3 = sc.nextInt();
        System.out.println("Enter the hieght of the first friend:");
        double height1 = sc.nextDouble();
        System.out.println("Enter the hieght of the second friend:");   
        double height2 = sc.nextDouble();
        System.out.println("Enter the hieght of the third friend:");
        double height3 = sc.nextDouble();
        if(age1 < age2 && age1 < age3){
            System.out.println("The youngest friend is the first one with age: " + age1 + " and height: " + height1);
        } else if(age2 < age1 && age2 < age3) {
            System.out.println("The youngest friend is the second one with age: " + age2 + " and height: " + height2);
        } else if(age3 < age1 && age3 < age2) {
            System.out.println("The youngest friend is the third one with age: " + age3 + " and height: " + height3);
        } else {
            System.out.println("There is a tie in ages among the friends.");
        }
        if(height1 > height2 && height1 > height3) {
            System.out.println("The tallest friend is the first one with height: " + height1);
        } else if(height2 > height1 && height2 > height3) {
            System.out.println("The tallest friend is the second one with height: " + height2);
        } else if(height3 > height1 && height3 > height2) {
            System.out.println("The tallest friend is the third one with height: " + height3);
        } else {
            System.out.println("There is a tie in heights among the friends.");
        }
    }
}
