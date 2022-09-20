package test1.training;

import java.util.Scanner;
public class scannerage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("print  the value of pound to convert");
        float b=(float)0.45359237*a;
        System.out.println(b);

    }
}
