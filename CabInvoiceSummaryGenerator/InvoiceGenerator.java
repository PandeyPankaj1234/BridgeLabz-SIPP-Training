package CabInvoiceSummaryGenerator;

public class InvoiceGenerator {

    public double calculateFare(Ride ride) {
        return ride.calculateFare();
    }

    public InvoiceSummary calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += ride.calculateFare();
        }
        return new InvoiceSummary(rides.length, totalFare);
    }
}