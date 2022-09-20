package test1.training;

import java.util.Locale;

public class switchpractice {
    public static void main(String[] args) {
        String charvalue="ALLEN";
        switch(charvalue.toLowerCase(Locale.ROOT)){
            case "allen":
                System.out.println("its A");
                break;
            case "bob":
                System.out.println("its B");
                break;

            case "smith":
                System.out.println("its C");
                break;
            case"zee": case "shan": case "manu ":
                System.out.println("its D , E AND F");
                System.out.println("its " +  charvalue);
                break;
             default:
                System.out.println("its default");
                break;
        }
    }
}
