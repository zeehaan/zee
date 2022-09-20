package demo;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Test2 {
    String str2;
    private int ch;

    public Test2(String str) {
        this.str2 = str;
    }

    public String RemoveSpaces() {
        System.out.println(str2);
        return str2.replaceAll("\\s", "");

    }

    public String RemoveNumbers() {
        return str2.replaceAll("\\d", "");
    }

    public int GetLengthOfCharater() {
//		 String str=RemoveSpaces();
//		 str.replaceAll(" ", "");
        return str2.length();

    }

    public void ArrangeAndPrint() {
//		 String str2=RemoveSpaces();
//		 int l=str.length();

////		 char c = str2.charAt(0);  // returns 'l'
////		 int[][] c_arr1 =    new int [5][5];
////		 char[] c_arr = str2.toCharArray();
////
//////		 for(char ch : str2.toCharArray()){
////		 for(int i=0;i<c_arr.length;i++) {
////			 for(int k=0;k<c_arr.length;k++)
////				 System.out.print(c_arr[i][k]+" ");
////		            System.out.println();
////		       }//
////	        System.out.print(Arrays.toString(splitToNChar(str2, 5)));
////	        System.out.println(Arrays.toString(splitToNChar(str2, 5)));
////	        System.out.println(Arrays.toString(splitToNChar(str2, 5)));
//	        String arr3=Arrays.toString(splitToNChar(str2, 5));
//	        for(String ch:arr3 ) {
//	        if ( ch < arr3.length()) {
//	        	arr3 = arr3 + "*****";
//	    }
//	 }
//	 }/
//	    private static String[] splitToNChar(String str2, int l) {
//	        List<String> parts = new ArrayList<>();
//
//	        int length = str2.length();
//	        for (int i = 0; i < length; i += l) {
//	            parts.add(str2.substring(i, Math.min(length, i + l)));
//	        }
//	        return parts.toArray(new String[0]);
        String str2 = RemoveSpaces();
        int strLen = str2.length();
        String fiveChars = "";
        int splitBetween = 5;
        for( ch=1;ch<=strLen;ch++){
            if(ch%splitBetween == 0){
                String c;
                fiveChars = fiveChars + ch;
                System.out.println((fiveChars));
                fiveChars = "";
            }
            else{
                char c = str2.charAt(ch - 1);
                fiveChars = fiveChars + c;
            }
        }
        if(fiveChars.length() <=5 && fiveChars.length() !=0){
            for(int i=0;i<splitBetween;i++){
                if (fiveChars.contains("")) {
                    fiveChars = fiveChars + "*";
                }
            }
            System.out.println(fiveChars);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String value");
        String str = sc.nextLine();
        Test2 ob = new Test2(str);
        System.out.println(str);
        System.out.println("String after removing numbers :" + ob.RemoveNumbers());
        System.out.println("String after spaces numbers :" + ob.RemoveSpaces());
        System.out.println("Length of the String :" + ob.GetLengthOfCharater());
        ob.ArrangeAndPrint();
        System.out.println(new  String().equals(ob));
    }
}









