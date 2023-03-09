public class Main {
    public static void main(String[] args)
    {
        Addressinfo addressinfo= new Addressinfo("YKSG1_GATE_8","Ashulia","Savar",5577);
        Insuranceinfo insuranceinfo=new Insuranceinfo("Insurace",15);
        Employee emp=new Employee("Mahadi",addressinfo,insuranceinfo);
        emp.display();

    }
}