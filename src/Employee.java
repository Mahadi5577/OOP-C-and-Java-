public class Employee {
    String name;
   Addressinfo addressinfo;
   Insuranceinfo insuranceinfo;
    public Employee(String name,Addressinfo addressinfo,Insuranceinfo insuranceinfo)
    {
        this.name=name;
        this.addressinfo=addressinfo;
        this.insuranceinfo=insuranceinfo;

    }
    public void display()
    {
        System.out.println("Name of employee ="+this.name);
        System.out.println("Address of employee ="+addressinfo.street+"."+addressinfo.city+","+addressinfo.state+","+addressinfo.postalcode);
        System.out.println("Insurance Info ="+insuranceinfo.policyid+","+insuranceinfo.policyname);
    }
}
