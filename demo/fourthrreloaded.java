package demo;
import java.util.Scanner;
public class fourthrreloaded {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.length());
        int strLen = str.length();
        String fiveChars = "";
        int splitBetween = 6;
        for (int ch = 1; ch <= strLen; ch++) {
            if (ch % splitBetween == 0) {
                char c = str.charAt(ch - 1);
                fiveChars = fiveChars + c;
                System.out.println((fiveChars));
                fiveChars = "";
            } else {
                char c = str.charAt(ch - 1);
                fiveChars = fiveChars + c;
            }
        }
        if (fiveChars.length() <= 5 && fiveChars.length() != 0) {
            for (int i = fiveChars.length(); i < splitBetween; i++) {
                if (fiveChars.contains("")) {
                    fiveChars = fiveChars + "*";
                }
            }
            System.out.println(fiveChars);
        }
    }
    }