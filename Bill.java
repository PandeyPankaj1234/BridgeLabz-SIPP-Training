package Workshop;

public class Bill implements Payable {
    private double baseCharges;
    private double taxes;
    private double discounts;

    public Bill(double baseCharges) {
        this.baseCharges = baseCharges;
        this.taxes = 0.0;
        this.discounts = 0.0;
    }

    public void addTax(double taxPercent) {
        taxes += (baseCharges * taxPercent / 100);
    }

    public void applyDiscount(double discountPercent) {
        discounts += (baseCharges * discountPercent / 100);
    }

    public double computeTotal() {
        return baseCharges + taxes - discounts;
    }

    @Override
    public double calculatePayment() {
        return computeTotal();
    }
}
