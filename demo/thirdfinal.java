package demo;

import java.util.*;

public class thirdfinal {
    public static void main(String[] args) {
        String arr1[] = {"AA", "ggg", "high", "ours", "2a", "710aa"};
        String arr2[] = {"AAad", "ggg", "high", "ours", "mop", "710aa", "de20"};
        String s1 = String.join(" ", arr1);
        System.out.println("the first array :" + s1);
        String s2 = String.join(" ", arr2);
        System.out.println("the second array :" + s2);
        String s3 = s1 + " " + s2;
        System.out.println("The array after concatenating  :" + s3);
        System.out.println("============================================================================================");
        LinkedList<String> arr3 = new LinkedList<String>();
        for (int i = 0; i < arr2.length; i++) {
            arr3.add(arr2[i]);
        }
        for (int j = 0; j < arr2.length - 1; j++) {
            arr3.add(arr1[j]);
        }
        System.out.println("The array after sorting first :" + arr3);
        LinkedList<String> ls = new LinkedList<String>();
        for (int k = 0; k < arr3.size(); k++) {
            for (int l = k + 1; l < arr3.size(); l++) {
                if (arr3.get(k) == arr3.get(l)) {

                    System.out.println(arr3.get(k));
                    ls.add(arr3.get(k));
                    arr3.remove(arr3.get(l));
                    System.out.println("the verify 1" + ls);
                }
            }
        }
        System.out.println(" Arr3 contains " + arr3);
        System.out.println(" ls contains " + ls);
        for (int j = 0; j < arr3.size(); j++) {
            if (ls.contains(arr3.get(j))) {
                System.out.println("contains " + arr3.get(j));
                arr3.remove(arr3.get(j));
            }
        }
        System.out.println("remainied array is arr3" + arr3);
        for (int i = 0; i < arr3.size(); i++) {
            if (ls.contains(arr3.get(i))) {
                arr3.remove(arr3.get(i));
            }
        }
        LinkedList<String> ls1 = new LinkedList<String>();
        System.out.println("the resultent array is " + arr3);

        for (int i = 0; i < arr3.size(); i++) {
            for (int j = i+1; j < arr3.size(); j++) {
                if(arr3.get(i) == arr3.get(j)){
                    ls1.add(arr3.get(i));
                    arr3.remove(arr3.get(i));
                }
            }

        }
        System.out.println(ls1);
        System.out.println("the resultent array is " + arr3);
        if (arr3.contains(ls1.get(0))) {
            arr3.remove(ls1.get(0));
        }
        System.out.println(arr3);
    }
}


//		String  Array=s3;
//		System.out.println(Array);
//		LinkedHashSet<String> ls=new  LinkedHashSet<String>();
//		ls.addAll(ls);
//		System.out.println(ls);
//		for(String lhs:ls) {
//			System.out.println(lhs);

//        for(String s4:s3)
//            if(s3[i]==s3[j]) {


//    String[] arr1;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter first String");
//        String arr1 =sc;
//        System.out.println("Enter second string");
//        Scanner arr2=sc;


//    LinkedList<String> arr4 = new LinkedList<String>();
//                            for (int m = 0; m < arr3.size() ; i++) {
//                                arr4.add(arr3.get(m));
//                                {  arr4.remove(arr4.get(l));
//                                    System.out.println("the resultant array is :"+arr4);
//                                }
//                            }