package test1.training;

import java.util.Scanner;

public abstract class abstract1 {
    public abstract void getbalance();
    public abstract void deposit();
    public abstract void withdraw();

    public static void main(String[] args) {
        abstract2 ob=new abstract2();
        ob.getbalance();
        ob.getbalance();
        Scanner scanner=new Scanner(System.in) ;
        int amount= scanner.nextInt();
        ob.deposite( amount);
        ob.getbalance();
        amount= scanner.nextInt();
        ob.withdraw(amount);
        ob.getbalance();
    }




}
