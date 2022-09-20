package test1.training;

public class calfeetinchcm {
    public static void main(String[] args) {
        calcfeetinchcentimete(2,0);

    }
    public static void calcfeetinchcentimete(double feet ,double inches){
        if((feet<0)||(inches<0)||(inches>12)){
            System.out.println("invalid value");

        }
        else {
            double centimeter=(feet*12)*2.54;
            System.out.println(feet +"feet,"+ inches + " inches= "+centimeter+"cm");


        }
    }
}
