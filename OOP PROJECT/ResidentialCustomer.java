class ResidentialCustomer implements Customer {
    private String name;
    private String ID;
    private int unitConsumed;
    public ResidentialCustomer(String name, String ID, int unitConsumed) {
        this.name = name;
        this.ID = ID;
        this.unitConsumed = unitConsumed;
    }
    public String getName()
    {
        return name;
    }
    public String getID()
    {
        return ID;
    }
    public int getUnitConsumed()
    {
        return unitConsumed;
    }
    public double calculateBillAmount() {
        double ratePerUnit;
        int unitConsumed = getUnitConsumed();
        if (unitConsumed <= 100) {
            ratePerUnit = 1.20;
        } else if (unitConsumed <= 300) {
            ratePerUnit = 2.00;
        } else if (unitConsumed <= 500) {
            ratePerUnit = 3.00;
        } else {
            ratePerUnit = 4.00;
        }
        return unitConsumed * ratePerUnit;
    }
    public boolean processPayment(double paymentAmount, double billAmount) {
        return paymentAmount >= billAmount;
    }
}