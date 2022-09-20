package test1.training;

import java.util.Scanner;

public class arr1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");


        int size = sc.nextInt();
        int[] number = new int[size];
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();

        }

        int x = sc.nextInt();
        for (int i = 0; i < number.length; i++) {
            if (number[i] == x) {
                System.out.println("the index is " + i);
            }
        }
    }
}
