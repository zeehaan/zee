//package test2;
//
//import java.util.Scanner;
//
//public class third3main {
//    public static void main(String[] args) {
//        third3class ob1=new third3class(111, "zeeshan", 10, 10000, 25, 958746321);
//        third3class ob2=new third3class(222, "manohar", 25, 25000, 40, 963258771);
//        third3class ob3=new third3class(333, "Sham", 15, 15000, 30, 986574123);
//        third3class ob4=new third3class(444, "Alia", 20, 20000, 35, 987654321);
//        int totalsal=0;
//        int totalexp=0;
//        int n=0;
//        third3class[] ob={ob1,ob2,ob3,ob4};
//
//         n = ob.length;
//
//        for (int i = 0; i < ob.length; i++) {
//            totalsal+=ob[i].sal;
//        }
//        System.out.println("the Total Salary of the employee is :"+totalsal);
//
//        System.out.println("================================================");
//
//        for (int j = 0; j < ob.length; j++) {
//            totalexp +=ob[j].Exp;
//        }
//        System.out.println("The Average Experience of the employee is :"+totalexp/4);
//        System.out.println("================================================");
//
//        third3class ob5=new third3class(totalsal,totalexp,n);
//        for (int k = 0; k < ob.length; k++) {
////            ob[k].CalculateTheTotalSalary();
//            ob[k].GetEmployeedDetails();
////           ob[k].CalcAvgExperienceOfTheEmployees();
//
//
//
//
//            third3class[] ob0={ob1,ob2,ob3,ob4};
//            System.out.println("Enter The Employee To be Updated :");
//            Scanner sc=new Scanner(System.in);
//            int i=sc.nextInt();
//            System.out.println("New EmployeeID Of The Employee is :"+ob[i].EmpID);
//            System.out.println("New Experience Of The Employee is :"+ob[i].Exp);
//            System.out.println("Name Of The Employee is :"+ob[i].Name);
//            System.out.println("Salary Of the Employee is :"+ob[i].sal);
//            System.out.println("Age Of The Employee is :"+ob[i].age);
//            System.out.println("MobileNumber Of The Employee is :"+ob[i].MobileNumber);
//
//
////            System.out.println("Enter Your New Employee Id :");
////            int empid2=sc.nextInt();
////            System.out.println("Enter Your New Experience :");
////            int exp2=sc.nextInt();
////            ob1.ModifyExpAndEmpid( empid2, exp2);
//        }
//    }
//}
