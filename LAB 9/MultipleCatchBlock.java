public class MultipleCatchBlock {
    public static void main(String[] args) {
        try
        {
           int[] array= new int[-6];
        }
        catch(NegativeArraySizeException exception)
        {
            System.out.println("Negative Array Exception");

        }
        catch(NumberFormatException exception)
        {
            System.out.println("Number Format Exception");
        }


        catch(ArrayIndexOutOfBoundsException exception)
        {
            System.out.println("Array Index Out of Bounds Exception");
        }
        System.out.println("SYSTEM RUNNING PROPERLY");
    }
}
