//package test2;
//import java.util.ArrayList;
//import java.util.Objects;
//public class firstans1 {
//    public boolean ReturnArray;
//    int[] myarray;
//    ArrayList<Integer> arr; //for removing duplicate values
//
//
//
//    public firstans1(int[] myarray, ArrayList<Integer> arr) {
//        this.myarray = myarray;
//       this.arr = arr;
//    }
//      public  int GetSumOfTheNumber(){
//        int sum=0;
//        for (int a:myarray) {
//            sum+=a;
//        }
//       return sum;
//    }
//    public  int  GetMiddleNumber(){
//        int num=myarray.length/2+1;
//        for (int i = 0; i < myarray.length; i++) {
//             if(myarray[i]==myarray[(myarray.length/2)]) {
//                 return myarray[i];
//                 break;
//             }
//        }
//
//      void RemoveNegativeNumbers(){
//        for (int i = 0; i < arr.size(); i++) {
//            if((arr.get(i)) <0)
//            {
//              arr.remove((i));
//            }
//        }
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.print("Array After Removing Negative Values :"+arr+" ");
//            break;
//        }
//
//    }
//    public ArrayList<Integer> ReturnArray(){
//        for (int i = 0; i < myarray.length; i++) {
//            System.out.println(" ");
//                    return arr;
//
//
//        }
//
//    }
//
//
//    void RemoveDuplicateNumbers() {
//        System.out.println(" ");
//        for (int i = 0; i < arr.size(); i++) {
//            for (int j = i + 1; j < arr.size(); j++) {
//                if (Objects.equals(arr.get(i), arr.get(j))) {
//                    arr.remove(j);
//                }
//            }
//        }
//        System.out.println("Array After Removing Duplicates :" + arr);
//    }
//
//}
//
//    public void RemoveDuplicateNumbers() {
//    }
//
//    public void RemoveNegativeNumbers() {
//    }
