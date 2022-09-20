package test1.training;

import java.util.Scanner;

public class arraypractice {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] finalarray = getintegers(4);
        for (int i = 0; i < finalarray.length; i++) {
            System.out.println(finalarray[i]);
        }
    }

    public static int[] getintegers(int number) {
        System.out.println("Enter the " + number + " values.\r");
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;

    }
}
