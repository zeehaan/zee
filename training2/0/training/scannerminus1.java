package test1.training;

import java.util.Scanner;

public class scannerminus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String sc1 = sc.next();
        sc1.toCharArray();
        int len = sc1.length();
        for (int i = len - 1; i > 0; i--) {

            String str = sc1.substring(0, sc1.length() - 1);
            sc1 = str;
            System.out.println(sc1);


        }
    }
}
//        String sc2=sc1.substring(0,sc1.length()-1);
//        String sc3=sc2.substring(0,sc2.length()-1);
//        String sc4=sc3.substring(0,sc3.length()-1);
//        String sc5=sc4.substring(0,sc4.length()-1);
//        String sc6=sc5.substring(0,sc5.length()-1);
//        System.out.println(sc1);
//        System.out.println(sc2);
//        System.out.println(sc3);
//        System.out.println(sc4);
//        System.out.println(sc5);
//        System.out.println(sc6);



//    }
//}
