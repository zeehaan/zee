package test1.training;

public class accountserver {
    public static void main(String[] args) {

       Acount zeeaccount=new Acount("12345",523.2500,"zee shan","zeesh@job","3456789");
        System.out.println(zeeaccount.getCustomername());
        zeeaccount.withdrw(100);
        zeeaccount.deposit(200);
        zeeaccount.withdrw(100);


//        Acount zeeaccount1=new Acount();
//        System.out.println(zeeaccount.getCustomername());

Acount zeeacount =new Acount("zee","zeeshan@huy7658","12345");
        System.out.println(zeeaccount.getCustomername());



    }
}
