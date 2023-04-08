public class NullPointerExceotion
{
    public static void main(String[] args) {
        try
        {
            String a= null;
            System.out.println(a.length());
        }
        catch(NullPointerException exception)
        {
            System.out.println("Null Point Exception");
        }
    }
}
