import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter height in centimeters: ");
    double cm = scanner.nextDouble();
    int feet = (int) (cm / 30.48);
    int inches = (int) ((cm % 30.48) / 2.54);
    System.out.println(cm + " cm is approximately " + feet + " feet and " + inches + " inches.");
  } 
}
