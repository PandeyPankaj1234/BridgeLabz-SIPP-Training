package CabInvoiceSummaryGenerator;

public class Main {
    public static void main(String[] args) {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        Ride ride1 = new Ride(2.0, 5);
        double fare1 = invoiceGenerator.calculateFare(ride1);
        System.out.println("Fare for single ride: " + fare1);

        Ride[] rides = {
                new Ride(2.0, 5),
                new Ride(0.5, 1),
                new Ride(5.0, 10)
        };
        InvoiceSummary summary = invoiceGenerator.calculateFare(rides);
        System.out.println("Invoice Summary:");
        System.out.println("Total Rides: " + summary.getTotalRides());
        System.out.println("Total Fare: " + summary.getTotalFare());
        System.out.println("Average Fare per Ride: " + summary.getAverageFare());
    }
}
