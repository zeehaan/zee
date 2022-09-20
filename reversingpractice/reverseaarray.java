package reversingpractice;
import java.util.Arrays;
public class reverseaarray {
    public static void reverse(int[] x)
    {

        int[] rev=new int[x.length];
        for (int i = 0,j=x.length-1; i <x.length ; i++,j--) {
            rev[j]=x[i];
        }
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(rev));

    }
    public static void main(String[] args) {

//        for (int i = array.length-1; i >=0 ; i--) {
//            System.out.println(array[i]);
//        }
        int[] array={10,20,30,40,50};

        reverse(array);
    }
}
