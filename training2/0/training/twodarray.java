package test1.training;

import java.util.*;

public class twodarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] twod = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                twod[i][j] = scanner.nextInt();
            }
        }
//to print the 2d matrix
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                System.out.print(twod[i][j]+" ");
//            }
//            System.out.println(" ");
//        }
        int h = scanner.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if ((twod[i][j] == h) ) {
                    System.out.println("the index found at (" + i + "," + j + ")");

                } else {
                    System.out.println("the number is not found");
                    break;

                }
                System.out.println(">>>>>>>>>>");

            }

        }
    }
}
