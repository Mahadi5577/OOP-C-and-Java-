public class Volvo extends Car
{
    double price;
    String ProductionYear ;

    String RegistrationNumber;
    Engine eng;
    DashBoard dboard;
    public Volvo(double price,String ProductionYear, String RegistrationNumber,Engine eng,DashBoard dboard)
    {
        this.price=price;
        this.ProductionYear=ProductionYear;
        this.RegistrationNumber=RegistrationNumber;
        this.eng=eng;
        this.dboard=dboard;
    }
    public void CheckBattery()
    {
        System.out.println("Checking Battery");
    }
    public void ChangeFuel()
    {
        System.out.println("Changing Fuel");
    }
}
