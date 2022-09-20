package test1;

import java.util.Scanner;

public class firstfinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[10];
        int count = 0;
        System.out.println("enter 10 interger values");
        for (int i = 0; i < 10; i++) {
            ar[i] = sc.nextInt();

            for (int j = 0; j < 10; j++) {
                for (int k = 1; k <= ar[j]; k++) {
                    if (ar[j] % k == 0) {
                        count++;
                    }

                }
                if (count == 2) {
                    int[] ar2=new int[ar.length];
                    for (int l = 0; l < ar.length; l++) {
                        ar[l]=ar[j];
                        count = 0;
                    }
                    System.out.println(ar2.toString());
                }
            }
        }
    }

    }