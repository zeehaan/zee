package test1.training;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int strLen = str.length();
        String fiveChars = "";
        int splitBetween = 5;
        for(int ch=1;ch<=strLen;ch++){
            if(ch%splitBetween == 0){
                char c = str.charAt(ch - 1);
                fiveChars = fiveChars + c;
                System.out.println((fiveChars));
                fiveChars = "";
            }
            else{
                char c = str.charAt(ch - 1);
                fiveChars = fiveChars + c;
            }
        }
        if(fiveChars.length() <=5 && fiveChars.length() !=0){
            for(int i=0;i<splitBetween;i++){
                if (fiveChars.contains("")) {
                    fiveChars = fiveChars + "*";
                }
            }
            System.out.println(fiveChars);
        }
    }
}
