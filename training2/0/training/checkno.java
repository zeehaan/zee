package test1.training;

public class checkno {

    public static String  checkno(int num) {
        String a = "ZERO";
        if (num > 0)
        { a="positive";
            return a;      }
        else if (num < 0)
        {a="negative";
            return a;   }
        else

            return a;
    }













    public static void main(String[] args) {
        String result=checkno(12);
        System.out.println(result);


    }
}
