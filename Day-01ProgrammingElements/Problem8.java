import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the unit price of the first item: ");
        double price1 = sc.nextDouble();
        System.out.print("Enter the quantity of the  item: ");
        double quantity = sc.nextDouble();
        double totalPrice = price1 * quantity;
        System.out.println("The total price is: " + totalPrice + " If the buying price and quantity is this"); 
    }
}
