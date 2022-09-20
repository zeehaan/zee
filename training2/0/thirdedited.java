package test1;
import java.util.*;
public class thirdedited {
    public static void main(String[] args) {
        String arr1[] = {"AA", "ggg", "high", "ours", "2a", "710aa"};
        String arr2[] = {"AAad", "ggg", "high", "ours", "mop", "710aa", "de20"};
        String s1 = String.join(" ", arr1);
        String s2 = String.join(" ", arr2);
        String s3 = s1 + " " + s2;
        System.out.println("The array after concatenating  :" + s3);
        LinkedList<String> arr3 = new LinkedList<String>();
        for (int i = 0; i < arr2.length ; i++) {
            arr3.add(arr2[i]);
        }
        for (int j = 0; j < arr2.length ; j++) {
            arr3.add(arr1[j]);
        }
//
//        int arrlen=arr3.size();
//        Set<String> arr4 = new HashSet<>();


//        for (int k = 0; k < arr3.size() ; k++) {
//            for (int l = k + 1; l < arr3.size(); l++) {
//                if (arr3.get(k) == arr3.get(l)) {
//                    System.out.println("The array of deleted one:" + arr3.get(l));
//
//                    arr3.remove(arr3.get(l));
//                }
//                else {
//
//                  HashSet<String>  arr4 = new HashSet<>();
//                    arr4.add(arr3.get(l));
//                    System.out.println("the finalone"+arr4);
//                }
//            }
//        }
//        System.out.println(arr3);


//        System.out.println("The array after sorting :" + arr3);
        for (int i = 0, j = i + 1; i < arr3.size(); i++, j++) {
            if (Objects.equals(arr3.get(i), arr3.get(j))) {
                System.out.println("the final array to show :" + arr3);
                arr3.remove(arr3.get(i));

            }

        }
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