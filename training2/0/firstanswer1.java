package test1;

import java.util.ArrayList;
import java.util.Arrays;

public class firstanswer1 {
    public static void main(String[] args) {
        int[] arr = {10, 35, 62, 45, 98, 87, 65, 34};
        for (int a : arr) {
            int k=isPrime(a);
            System.out.println(k);

        }

    }

    static int isPrime(int n) {



        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println(" ");
            } else {
                return n;
//                ArrayList<Integer> ar3=new ArrayList<Integer>();
//                ar3.add(n);


            }

        }
        return isPrime(n);

    }
}


