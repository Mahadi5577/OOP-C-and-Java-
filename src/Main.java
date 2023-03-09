public class Main {
    public static void main(String[] args)
    {
        Engine eng=new Engine(234);
        DashBoard dboard=new DashBoard(5.5);
        Volvo volvo=new Volvo(50000,"2023","ASDFGHJKL",eng,dboard);
        volvo.drive();
        volvo.stop();
        volvo.ChangeFuel();
        volvo.CheckBattery();
        volvo.model="CBB";
        volvo.company="Volvo";
        
    }
}