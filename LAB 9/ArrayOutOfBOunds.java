public class ArrayOutOfBOunds {
    public static void main(String[] args) {
        try
        {
            int[] a= new int[5];
            System.out.println(a[6]);
        }
        catch(ArrayIndexOutOfBoundsException exception)
        {
            System.out.println("Array Index Out of Bounds Exception");
        }
    }
}
