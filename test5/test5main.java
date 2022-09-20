package test5;

import java.util.Scanner;


public class test5main {

    public static void main(String[] args) {
        test5class ob = new test5class();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=================================================================================================================================================================================================");
            System.out.println("1.To get Sorted  Location \n" +
                    "2.To get Sorted Place  \n" +
                    "3.To get Sorted Mark \n" +
                    "4.To get Max and Avg Records \n" +
                    "5.To get Mark Uniquely \n" +
                    "6.To Exit ");
            System.out.println("=================================================================================================================================================================================================");
            System.out.println("=================================================================================================================================================================================================");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ob.getuniquelLPN("select * from readcsv_sql1 order by location asc");
                    break;
                case 2:
                    ob.getuniquelLPN("select * from readcsv_sql1 order by profile asc");
                    break;
                case 3:
                    ob.getuniquelLPN("select * from readcsv_sql1 order by name asc");
                    break;

                case 4:
                    ob.getmaxavg("select profile,sum(weight),avg(weight) from readcsv_sql1 group by profile ");
                    break;

                case 5:
                    ob.getmarkunique("select distinct mark from readcsv_sql1");
                    break;
                case 6:
                    System.out.println("Thank you Sir for using your service");
                    System.exit(0);
            }
        }

    }
}

