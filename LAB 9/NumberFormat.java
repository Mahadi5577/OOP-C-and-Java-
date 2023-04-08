public class NumberFormat {
    public static void main(String[] args) {
        {
            try
            {
                String s="MAHADI";
                int n=Integer.parseInt(s);

            }
            catch(NumberFormatException exception)
            {
                System.out.println("Number Format Exception");
            }
        }
    }
}
