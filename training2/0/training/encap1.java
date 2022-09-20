package test1.training;

import java.util.Scanner;

public class encap1  {
    public static void main(String[] args) {
        encap2 ob=new encap2();
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
