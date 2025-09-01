public class IceCreamRush {
    IceCreamFlavor[] flavors = new IceCreamFlavor[8];

    IceCreamRush() {
        flavors[0] = new IceCreamFlavor("Vanilla", 120);
        flavors[1] = new IceCreamFlavor("Chocolate", 150);
        flavors[2] = new IceCreamFlavor("Strawberry", 90);
        flavors[3] = new IceCreamFlavor("Mango", 110);
        flavors[4] = new IceCreamFlavor("Butterscotch", 80);
        flavors[5] = new IceCreamFlavor("Pistachio", 70);
        flavors[6] = new IceCreamFlavor("Blackberry", 60);
        flavors[7] = new IceCreamFlavor("Coffee", 100);
    }

    void bubbleSort() {
        int n = flavors.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (flavors[j].sales < flavors[j + 1].sales) {
                    IceCreamFlavor temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;
                }
            }
        }
    }

    void display() {
        System.out.println("Ice Cream Flavours sorted by popularity (sales):");
        for (IceCreamFlavor flavor : flavors) {
            System.out.println(flavor.flavour + " - " + flavor.sales + " sales");
        }
    }

    public static void main(String[] args) {
        IceCreamRush icr = new IceCreamRush();
        icr.bubbleSort();
        icr.display();
    }
}