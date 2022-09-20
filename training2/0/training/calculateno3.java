package test1.training;

public class calculateno3 {
    public static int calculatenumber(int score){
        int position =4;
        if(score>1000)
            position=1;
        else if(score >=500 )
            position=2;
        else if(score>=100 )
            position=3;
  return position;
    }
    public static void displaystudentgrade(String studentname,int finalscoreno)
    {
        System.out.println("the student name is =" + studentname+ "his position is " + finalscoreno);
    }

    public static void main(String[] args) {
        int position= calculatenumber(15);
        displaystudentgrade("smith",position);
        position= calculatenumber(900);
        displaystudentgrade("zee",position);
        position=calculatenumber(300);
        displaystudentgrade("shan",position);
        position=calculatenumber(50);
        displaystudentgrade("allen",position);

    }

}


