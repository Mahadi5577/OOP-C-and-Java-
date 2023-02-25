public class PersonProtected {
    protected String name;
    protected int id;
    public PersonProtected(String name,int id)
    {
      this.name= name;
      this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setid(int name)
    {
        this.id=id;
    }
    public String getname()
    {
        return name;
    }
    public int getid()
    {
        return id;
    }

    public static void main(String[] args) {
        PersonProtected obj= new PersonProtected("Mahadi",5577);
        System.out.println(obj.getname());
        System.out.println(obj.getid());
    }

}
