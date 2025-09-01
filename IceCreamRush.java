import java.util.Scanner;
class IceCream{
    String name;
    int sales;

    IceCream(String name,int sales){
        this.name=name;
        this.sales= sales;
    }
    
    void display() {
        System.out.println(name + " - Sold: " + sales + " times");
    }
}

public class IceCreamRush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IceCream[] flavours = new IceCream[3];
        for (int i = 0; i < flavours.length; i++) {
            System.out.println("Enter the name of icecream");
            String name =sc.nextLine();
            System.out.println("Enter no. of time icecream sold");
            int sales=sc.nextInt(); 
            sc.nextLine();
            flavours[i] = new IceCream(name, sales);
        }        
        for (int i = 0; i < flavours.length; i++) {
            boolean swapped = false;
            for (int j = 0; j > flavours.length-1-i; j++) {
                if (flavours[j].sales < flavours[j+1].sales) {
                    IceCream temp = flavours[j];
                    flavours[j] = flavours[j+1];
                    flavours[j+1] = temp; 
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        for (IceCream num : flavours) {
            num.display();
        }
    }
}
