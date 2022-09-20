//package test2;
//
//import java.math.BigInteger;
//
//public class thirdans2main {
//    private final int totalexp;
//    private final int  totalsal;
//
//    private int n;
//
////
//
//    public thirdans2main(int totalsal, int totalexp, int n) {
//        this.totalsal=totalsal;
//        this.totalexp=totalexp;
//        this.n=n;
//    }
//    public thirdans2main(int empID, String name, Integer exp, double sal, Integer age, int MobileNumber, int totalexp, int totalsal) {
//        this.empID = empID;
//        this.Name = name;
//        this.Exp = exp;
//        this.sal = sal;
//        this.age = age;
//        this.MobileNumber = BigInteger.valueOf(MobileNumber);
//        this.totalexp = totalexp;
//        this.totalsal = totalsal;
//
//    }
//
//
//    public static void main(String[] args) {
//
//        int totalsal = 0;
//        int totalexp = 0;
//
//        thirdans2main ob1 = new thirdans2main(111, "zeeshan", 10, 10000, 25, 958746321, totalexp, totalsal);
//        thirdans2main ob2 = new thirdans2main(222, "manohar", 25, 25000, 40, 963258771, totalexp, totalsal);
//        thirdans2main ob3 = new thirdans2main(333, "Sham", 15, 15000, 30, 986574123, totalexp, totalsal);
//        thirdans2main ob4 = new thirdans2main(444, "Alia", 20, 20000, 35, 987654321, totalexp, totalsal);
//
//
//        thirdans2main[] ob = {ob1, ob2, ob3,ob4};
//        int n = ob.length;
//
//        for (int i = 0; i < ob.length; i++) {
//            totalsal+=ob[i].sal;
//        }
//
//        for (int i = 0; i < ob.length; i++) {
//            totalexp += ob[i].exp;
//        }
//        thirdans2main ob5 = new thirdans2main(totalsal, totalexp, n);
//
//        for (int i = 0; i <ob.length ; i++) {
//            ob[i].CalculateTheTotalSalary();
//            ob[i].GetEmployeedDetails();
//            ob[i].CalcAvgExperienceOfTheEmployees();
//        }
//
//    }
//
//
//
//
//}