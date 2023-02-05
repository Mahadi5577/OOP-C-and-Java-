public class Main {
   int x=5;
   void sum()
   {
       x=x+5;
       System.out.println(x);
   }
   void display()
   {
       System.out.println(x);
   }

    public static void main(String[] args) {
        /*Main obj= new sum();
        System.out.println("Hello World");
        System.out.println(obj.x);
        obj.display();*/
        Student obj= new Student();
        obj.name="Mahadi";
        obj.age=20;
        obj.cgpa=3.5F;
        obj.display();

    }

}