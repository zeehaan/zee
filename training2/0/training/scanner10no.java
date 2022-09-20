package test1.training;

import java.util.Scanner;

public class scanner10no {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int counter=0;
        int sum=0;

        while(counter<10)
        {
            int order=counter+1;
            System.out.println("Enter number #"+order+":");

            boolean isanint= scanner.hasNextInt();
            if(isanint)
            {
                int number=scanner.nextInt();
                counter++;
                sum+=number;


            }
            else {
                System.out.println("invalid number");

            }

        }
        System.out.println("sum :"+ sum);
scanner.close();

    }
}
