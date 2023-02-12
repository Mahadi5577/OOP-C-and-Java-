public class Employee {
    int id;
    String name;

    public Employee(int a, String b) {
        this.id = a;
        this.name = b;
    }

    public void info()
    {
        System.out.println(" ID = "  +this.id + "\n" + "Name =" + this.name );
    }
    public static void main(String[] args) {
        Employee myobj = new Employee(5577, "Mahadi");
        System.out.println(myobj.id);
        System.out.println(myobj.name);
        myobj.info();
    }


}