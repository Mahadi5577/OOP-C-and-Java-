public class NegativeArray {
    public static void main(String[] args) {
             try
             {
                 int[] a= new int[-5];

             }
             catch(NegativeArraySizeException exception)
             {
                 System.out.println("Negative Array Exception");
             }
    }
}
