package test1.training;

import java.util.Scanner;

public class abstract2 {
    Scanner scanner =new Scanner(System.in);
    private double balance=scanner.nextDouble();
    public void getbalance(){
        System.out.println(this.balance );
    }
    public void deposite(int amount){
        this.balance=this.balance+amount;
    }
    public void withdraw(int amount){
        this.balance=this.balance-amount;
    }
}






