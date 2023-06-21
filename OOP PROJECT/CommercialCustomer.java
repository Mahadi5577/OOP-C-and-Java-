class CommercialCustomer implements Customer {
    private String name;
    private String ID;
    private int unitConsumed;

    public CommercialCustomer(String name, String ID, int unitConsumed)
    {
        this.name = name;
        this.ID = ID;
        this.unitConsumed = unitConsumed;
    }
    public String getName()
    {
        return name;
    }
    public String getID() {
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
            ratePerUnit = 2.50;              //used random value for unit mesuremeants//
        } else if (unitConsumed <= 300) {
            ratePerUnit = 3.50;
        } else if (unitConsumed <= 500) {
            ratePerUnit = 4.50;
        } else {
            ratePerUnit = 6.00;
        }
        return unitConsumed * ratePerUnit;
    }

    public boolean processPayment(double paymentAmount, double billAmount) {
        return paymentAmount >= billAmount;
    }
}