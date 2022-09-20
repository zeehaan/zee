//package test2;
//import java.util.ArrayList;
//import java.util.Objects;
//public class firstansclass {
//    int[] myarray;
//    ArrayList<Integer> arr;
////    ArrayList<Integer> arr2; //for removing negative values
//    public firstansclass(int[] myarray, ArrayList<Integer> arr) {
//        this.myarray = myarray;
//        this.arr = arr;
//    }
//    //    public void  firstansclass(int[] myarray, ArrayList<Integer> arr2) {
////        this.myarray = myarray;
////        this.arr2 = arr2;
////    }
//    public  void GetSumOfTheNumber(){
//        int sum=0;
//        for (int a:myarray) {
//            sum+=a;
//        }
//        System.out.println("The Sum of the Array is :"+sum);
//    }
//    public  void GetMiddleNumber(){
//        int num=myarray.length/2+1;
//        for (int i = 0; i < myarray.length; i++) {
//            if(myarray[i]==myarray[(myarray.length/2)]) {
//                System.out.println("The Middle Value is :"+myarray[i]);
//                break;
//            }
//        }
//    }
//    public   void RemoveNegativeNumbers(){
//        System.out.print("The Negative values are:");
//
//        for (int i = 0; i < arr.size(); i++) {
//            if(myarray[i] <0)
//            {
//                System.out.print(arr.get(i)+" ");
////                arr.remove(i);
//            }
//        }
////        for (int i = 0; i < arr.size(); i++) {
////            System.out.print("Array After Removing Neagtive Values :"+arr+" ");
////            break;
////        }
//
//      }
////    public  void ReturnArray(){
////        for (int i = 0; i < myarray.length; i++) {
////            System.out.print("The Final Array is :"+myarray+" ");
////            break;
////        }
////    }
//    void RemoveDuplicateNumbers(){
//        System.out.println(" ");
//        for (int i = 0; i < arr.size(); i++) {
//            for (int j = i+1; j < arr.size(); j++) {
//                if(Objects.equals(arr.get(i), arr.get(j)))
//                {
//                    arr.remove(i);
//                }
//            }
//        }
//        System.out.println("Array After Removing Duplicates :"+arr);
//    }
//
//}
