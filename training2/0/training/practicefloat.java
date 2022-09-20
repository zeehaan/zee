package test1.training;

public class practicefloat {
//    public static void test1.main(String[] args) {
//        float f=34.7654f;
//        float b=;
//        System.out.println(%0.2f*2);
    public static void main(String[] args) {

        int sum = 0;
        int total = 0;
        int primeArr[] = new int[100];
        int num = 10;
        int count;


        for (int i = 2; i < num; i++) {
            count = 0;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 0) {
                total++;
                System.out.print(", " + i);
                sum = i + sum;
            }
        }
        System.out.println("\nTotal is: " + total);
        System.out.println("The sum of 100 prime number is:" + sum);
    }
}



//}
