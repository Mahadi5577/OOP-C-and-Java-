public class ArithmeticException {
    public static void main(String[] args) {
        try
        {
            int a=100/0;
        }
        catch(java.lang.ArithmeticException exception)

        {
            System.out.println("ARITHMETIC EXCEPTION");
        }
    }
}
