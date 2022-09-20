package test1.training;

public class highscholscore {
    public static void calculatehighscholscore(String studentname,int score){
        if(score>1000)
            System.out.println("1");
        else if(score>500 && score<1000)
            System.out.println("2");
        else if(score>100 && score<500)
            System.out.println("3");
        else
            System.out.println("4");

    }
    public static void main(String[] args) {

        calculatehighscholscore("ravi",1500);
        calculatehighscholscore("suresh",50);
        calculatehighscholscore("zee",400);
        calculatehighscholscore("shan",900);



    }
}
