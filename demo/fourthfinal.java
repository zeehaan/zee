package demo;

import java.util.Scanner;

public class fourthfinal {

    String ename;
    public fourthfinal(String ename) {
        this.ename = ename;
    }
    public String RemoveNumber() {
        return ename.replaceAll("\\d", " ");
    }
    public String RemoveStaces() {
        return ename.replaceAll(" ", "");
    }
    public int GetTheLengthOfCharacter() {
        String ename = RemoveStaces();
        ename.replaceAll(" ", "");
        return ename.length();
    }
    public void ArrangeAndPrint() {
        String ename = RemoveStaces();
        int l = (ename.length());
        int m = l % 5;
        boolean flag=true;
        if(flag)
        {
            for (int i = 0, j = 5; i < l / 2 + 20; i++, j++) {
                if(l<=5) {
                    ename = ename + "******";
                    System.out.println(ename.subSequence(0, 5));
                    break;
                }
                else if((l>5)&&(l<10)) {
                    ename = ename + "******";
                    System.out.println(ename.subSequence(0, 5));
                    System.out.println(ename.subSequence(5,10));
                    break;
                }
                else if((l>10)&&(l<15)) {
                    ename = ename + "******";
                    System.out.println(ename.subSequence(0, 5));
                    System.out.println(ename.subSequence(5,10));
                    System.out.println(ename.subSequence(10,15));
                    break;
                }
                else if((l>15)&&(l<20)) {
                    ename = ename + "******";
                    System.out.println(ename.subSequence(0, 5));
                    System.out.println(ename.subSequence(5,10));
                    System.out.println(ename.subSequence(10,15));
                    System.out.println(ename.subSequence(15,20));
                    break;
                }
                System.out.print(ename.subSequence(i, j));
                System.out.println(" ");
                i += 4;
                j += 4;
                if (j < ename.length()) {
                    ename = ename + "*****";
                }
                if(ename=="****")
                {
                   flag=false;
                }
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String value");
        String str = sc.nextLine();
        fourthfinal ob = new fourthfinal(str);
        System.out.println("String after removing numbers :" + ob.RemoveNumber());
        System.out.println("String after removing numbers :" + ob.RemoveStaces());
        System.out.println("Length of the String :" + ob.GetTheLengthOfCharacter());
        ob.ArrangeAndPrint();
    }
}