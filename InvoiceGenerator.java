package Workshop;

import java.util.Scanner;
// STEP 1
class CabInvoice {
    static final double MINIMUM_FARE = 5;
    static final double COST_PER_KM = 10;
    static final double COST_PER_MIN = 1;
    double Distance;
    double Time;
    CabInvoice(double Distance, double Time){
        this.Distance=Distance;
        this.Time=Time;
    } 
    public double totalFare() {
        double Total = (Distance * COST_PER_KM) + (Time * COST_PER_MIN);
        return (Total < MINIMUM_FARE) ? MINIMUM_FARE : Total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in km ");
        double distance = sc.nextDouble();
        System.out.println("Enter the time in Min ");
        double time = sc.nextDouble();
        CabInvoice cb=new CabInvoice(distance, time);
        System.out.println("TotalFare :" + cb.totalFare());
        
    }
}
// STEP 2
public class InvoiceGenerator{
    static String UserId;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rides");
        int n=sc.nextInt();
        CabInvoice rides[] = new CabInvoice[n];
        double Total_Rides_Fare=0;
        for(int i=0;i<n;i++){
            System.out.println("Enter the distance of " + (i+1) + " ride ");
            double dist=sc.nextDouble();
            System.out.println("Enter the time of " + (i+1) + " ride ");
            double time=sc.nextDouble();
            rides[i]=new CabInvoice(dist,time);
            double Fare=rides[i].totalFare();
            Total_Rides_Fare +=Fare;
        }
        System.out.println("Total Fare Of " + n + " rides are : "+Total_Rides_Fare);
        // STEP 3 
        System.out.println("Average Fare of the " + n + " rides is: "+Total_Rides_Fare/n );
    }
}
