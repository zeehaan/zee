package test1;

public class outsidethebloack {
    public static void main(String[] args) {
        boolean gameover = true;
        int score = 800;
        int levelcomplet = 5;
        int bonus = 100;
        if (gameover) {
            int finalscore = score + (levelcomplet * bonus);
            finalscore += 1000;


            int a = getbonus(false, 10000, 8, bonus);
            System.out.println(a);
            getbonus(true, 800, 6, 300);
            getbonus(true, 4000, 5, 800);


            System.out.println(finalscore);
        }
//        boolean newGameover=true;
//        int newScore = 10000;
//        int newLevelcomplet = 8;
//        int newBonus = 200;
//        if (newGameover){
//            int Finalscore=newScore+(newLevelcomplet * newBonus);
//            System.out.println(Finalscore);
//        }


    }
//    public static void getbonus()
//    {
//        boolean gameover=true;
//        int score=10000;
//        int levelcomplet=8;
//        int bonus=200;
//        if(gameover)
//        {
//            int finalscore=score+(levelcomplet *bonus);
//            System.out.println(finalscore);
//        }

    public static int getbonus(boolean gameover, int score, int levelcomplet, int bonus) {

        if (gameover) {
            int finalscore = score + (levelcomplet * bonus);
            System.out.println(finalscore);
            return finalscore;
        } else {
            return -1;
        }
    }

}
