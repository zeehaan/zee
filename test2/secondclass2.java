//package test2;
//
//import java.util.Scanner;
//
//public class secondclass2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Length of the Rectangle");
//        boolean flag1 = true;
//        boolean flag2=true;
//        boolean flag3=true;
//        int length;
//        int width;
//        int height;
//
//        while (flag1) {
//            System.out.println("Enter Length of the Rectangle");
//            int Length = sc.nextInt();
//            if (Length < 0) {
//                System.out.println("The Value of Length is :" + Length + "cm");
//                flag1 = false;
//                break;
//            } else {
//                System.out.println("Invalid Value Please enter Valid Length Value");
//                continue;
//            }
//             do{
//                 System.out.println("Enter Width of the Rectangle :");
//                  width=sc.nextInt();
//
//             }
//             while(width);
//                while (flag3) {
//                    System.out.println("Enter Height of the Rectangle");
//                    int Height = sc.nextInt();
//                    if (length < 0) {
//                        System.out.println("The Value of Width is :" + Height + "cm");
//                        flag3 = false;
//                        break;
//                    } else {
//                        System.out.println("Invalid Value Please enter Valid Height Value");
//                        continue;
//                    }
//                    secondclass21 ob = new secondclass21(length, width, height);
//                    ob.GetVolumeOfRectangle();
//                    ob.ModifySizeOfTheRectangle();
//                    ob.GetLength();
//                    ob.GetWidth();
//                    ob.GetHeight();
//
//                }
//
//            }
//        }
//    }
//}