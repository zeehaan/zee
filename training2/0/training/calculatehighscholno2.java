package test1.training;

public class calculatehighscholno2 {
   public static int calculatenumber(int score){
        if(score>1000)
            return 1;
        else if(score >=500 )
            return 2;
        else if(score>=100 )
            return 3;
        else
            return 4;
    }
    public static void displaystudentgrade(String studentname,int finalscoreno)
    {
        System.out.println("the student name is =" + studentname+ "his position is " + finalscoreno);
    }

    public static void main(String[] args) {
       int finalscoreno= calculatenumber(15);
        displaystudentgrade("smith",finalscoreno);
         finalscoreno= calculatenumber(900);
        displaystudentgrade("zee",finalscoreno);
         finalscoreno=calculatenumber(300);
        displaystudentgrade("shan",finalscoreno);
         finalscoreno=calculatenumber(50);
        displaystudentgrade("allen",finalscoreno);

    }

}
