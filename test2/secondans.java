package test2;

import java.util.Scanner;

public class secondans {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length of the Rectangle");
        int length=sc.nextInt();
        System.out.println("Enter Width of the Rectangle");
        int width=sc.nextInt();
        System.out.println("Enter Height of the Rectangle");
        int height=sc.nextInt();
        secondans2 ob=new secondans2(length,width,height);
        System.out.println("The Length of the rectangle is :"+ob.GetLength()+"\n"+
                "The Width is :"+ob.GetWidth()+
                        "\n"+"The Height is :"+ob.GetHeight()+"\n"+
                "The Volume is :"+ob.Getvolume());

        System.out.println("Enter Modified value :");
        int value=sc.nextInt();
        ob.ModifySizeOfTheRectangle(value);
        System.out.println("The Length is :"+ob.GetLength()+"\n"+
                "The Width is :"+ob.GetWidth()+
                "\n"+"The Height is :"+ob.GetHeight()+"\n"+
                "The Volume is :"+ob.Getvolume());
//       ob.Getvolume();
//        ob.GetLength();
//        ob.GetWidth();
//        ob.GetHeight();

    }

}




































