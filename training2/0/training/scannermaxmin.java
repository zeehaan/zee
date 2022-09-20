package test1.training;

import java.util.Scanner;

public class scannermaxmin {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        boolean first=true;
        while(true)
        {
            System.out.println("enter number : ");
            boolean isanint=scanner.hasNextInt();
            if(isanint)
            {  int number= scanner.nextInt();
                if(first)
                {   first=false;
                    max=number;
                    min=number;
                }
                if(number>max)
                {
                    max=number;
                }
                if(number<min)
                {
                    min=number;
                }
            }
            else
            {
                break;
            }
        }
        System.out.println("Min ="+min + " Max ="+max);
        scanner.close();
    }
}
