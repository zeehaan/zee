package test1.training;

public class patterntriangle {
    public static void main(String[] args) {
        int row = 5;
        int col = 5;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if ((i+j)<=row-1) {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
