package miniprojects;
import java.util.Scanner;
public class unaccountability1 {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your User Name :");
        String name = sc.nextLine();
        String id = sc.nextLine();
        bankAccount object = new bankAccount(name, id);
        object.menu();
    }
}
    class BankAccount{
        double balance;
        double pretrains;
         String Customer1;
         String Customers1;

          BankAccount(String Customer1, String Customers1) {
             this.Customer1 =Customer1;
             this.Customers1 =Customers1;
          }

        void deposit(double amount)
         {
             if(amount!=0){
                balance+=amount;
                pretrains =amount;
             }
         }
         void Withdraw(double amount)
         {
             if(amount!=0 && balance>=amount){
              balance-=amount;
              pretrains =amount;
             }
             else
             {
                 System.out.println("Bank Balance Insufficient ");
             }
         }
         void pretraining1()
         {
             if(pretrains >0){
                 System.out.println("Deposited :"+ pretrains);
             }
             else if(pretrains <0)
             {
                 System.out.println("Withdraw :"+Math.abs(pretrains));
             }
             else {
                 System.out.println("No transacton occured");
             }
         }


           void menu()
           {
           char option;
           double balance=0;
            Scanner sc=new Scanner((System.in));
           System.out.println("Your name is "+ Customer1);
          System.out.println("Your Id is :"+ Customers1);
          System.out.println("--------------------------------------------");
          System.out.println("press :");
          System.out.println("\n");
          System.out.println("a :Check balance");
          System.out.println("b  :Deposit Amount");
          System.out.println("c  :Withdraw Amount");
          System.out.println("d  :Check Previous Transaction");
          System.out.println("e  :Exit");
           do {
             System.out.println("+++++++++++++++++++");
             System.out.println("Choose your Option");
             option=sc.next().charAt(0);
             System.out.println("\n");


                   switch (option) {
                 case 'a':
                     System.out.println("Balance :"+balance);

                     case 'b':
                     System.out.println("Enter Amount of Deposit :");
                     double amount=sc.nextDouble();
                     deposit( amount);

                     case 'c':
                     System.out.println("Enter Amount to Withdraw :");
                      amount=sc.nextDouble();
                    Withdraw(amount);
                     break;

                     case 'd':
                     System.out.println("Previous Transaction :");
                    pretraining1();


                    case 'e':
                     System.out.println("*************************");
                     break;

                 default :

                     System.out.println("Enter valid option");
                     break;

             }
         }
         while(option !='e');
         System.out.println("THANK YOU FOR TRANSACTION....");
     }
}
