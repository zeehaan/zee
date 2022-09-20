package test2;

import java.util.ArrayList;

public class firstans3main {
    public static void main(String[] args) {
        int[] array={2,1,9,-7,3,6,4,1,8,36,1,1,-1,9,9,9,10};
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++)
        {
            arr.add(i,array[i]);
        }
       firstans3 ob= new firstans3(array,arr);
//       System.out.println("returning array"+ob.ReturnArray());
//        System.out.println("Sum "+ob.GetSumOfTheNumber());
//        System.out.println( "Get Middle array :"+ob.GetMiddleNumber());
//        System.out.println("Array of removed negative value"+ob.RemoveNegativeNumbers());
//        System.out.println("Array removing duplicate "+ob.RemoveDuplicateNumbers());
//        System.out.println("Get Middle array :"+ob.GetMiddleNumber());

//        System.out.println("returning array"+ob.ReturnArray());
//        System.out.println("Get Middle array :"+ob.GetMiddleNumber());


        ob.GetSumOfTheNumber();
        ob.ReturnArray();
        ob.GetMiddleNumber();
        ob.RemoveNegativeNumbers();
        ob.GetMiddleNumber();
        ob.RemoveDuplicateNumbers();
        ob.GetMiddleNumber();

    }
}
