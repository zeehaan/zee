package test1.training;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
//        int i=4;
//        System.out.println(i%10);


        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your birth date :");
        boolean hasNextint=scanner.hasNextInt();
        if(hasNextint)
        {
            int birthyear= scanner.nextInt();
            scanner.nextLine();
            System.out.println("enter your name :");
            int age=2022-birthyear;

            String name=scanner.nextLine();
            if(age>=0 && age<100){
                System.out.println("your name is : "+name +" and your "+ age +" years old");}
            else {
                System.out.println("invalid date of birth");
            }
        }
        else {
            System.out.println("unable to parse year of birth");
        }

        scanner.close();

//String myname="zeeshan";
//
//for(int i=0;i<7;i++)
//{
//    System.out.print(myname+" " );
//}

//        String[] str={"zee","shaan","mohammed"};
//        for(String i:str) {
//            System.out.print(i);
//        }



//        String Stringtoint ="2019";
//        System.out.println("stringtoint is = "+Stringtoint);
//        int num=Integer.parseInt(Stringtoint);
//        System.out.println( "num is = " + num);
//        Stringtoint +=1;
//        num +=1;
//        System.out.println(Stringtoint);
//        System.out.println(num);
    }
}
