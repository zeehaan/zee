package practicepackages;

public class methodcallone {
    public static void main(String[] args) {
       tryblock();

    }
    public static void tryblock()
    {
        int[] array={1,2,3,4,5,6,7};
        try{
            System.out.println(array[11]);
        }
        catch(Exception e){

            System.out.println(" Executed the catch block ");
        }
        finally
        {
            System.out.println("finally is getting executed now ");
        }
    }
}
