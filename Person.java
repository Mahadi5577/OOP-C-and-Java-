public class Person {
    private String name;
    private int id;

    public Person(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
    public void setName(String name)
    {
        this.name= name;

    }
    public void setid(int id)
    {
        this.id=id;
    }
    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }

    public static void main(String[] args) {
        Person obj=new Person("Mahadi",5577);
        System.out.println(obj.getName());
        System.out.println(obj.getId());

    }




}
