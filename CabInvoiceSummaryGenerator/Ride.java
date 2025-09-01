package CabInvoiceSummaryGenerator;

public class Ride {
    private double distance;
    private int time;
    private double costPerKm = 10.0;
    private double costPerMinute = 1.0;
    private double minimumFare = 5.0;

    public Ride(double distance, int time) {
        this.distance = distance;
        this.time = time;
    }

    public double calculateFare() {
        double fare = (distance * costPerKm) + (time * costPerMinute);
        return Math.max(fare, minimumFare);
    }

    public double getDistance() {
        return distance;
    }

    public int getTime() {
        return time;
    }
}