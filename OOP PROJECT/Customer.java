interface Customer {
    String getName();
    String getID();
    int getUnitConsumed();
    double calculateBillAmount();
    boolean processPayment(double paymentAmount, double billAmount);
}