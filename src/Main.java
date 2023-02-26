import java.util.* ;
public class Main {
    public static void main(String[] args)
    {
        Scanner obj= new Scanner(System.in);

        Vehicle vehicle=new Vehicle();
        vehicle.run();

        int a=obj.nextInt();
        Bike bike=new Bike();
        bike.speed=a;
        bike.run();


        int b=obj.nextInt();
        Car car=new Car();
        car.speed=b;
        car.run();


    }
}