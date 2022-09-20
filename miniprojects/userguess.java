package miniprojects;

import java.util.Scanner;

public class userguess {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int mynumber=((int)(Math.random()*100));
        int usernumber=0;

        do{
            System.out.println("Guess Your Number :");
            usernumber=sc.nextInt();
            if(usernumber==mynumber)
            {
                System.out.println("oohooo  YOU GOT THE NUMBER CONGRADULATION");
                break;
            }
            else if(usernumber > mynumber)
            {
                System.out.println("Your Number is too large");
                continue;
            }
            else {
                System.out.println("Your Number is Too Small");
                continue;
            }
        }
        while(usernumber>0);

        System.out.println("Your number is :");
        System.out.println(mynumber);
    }
}
