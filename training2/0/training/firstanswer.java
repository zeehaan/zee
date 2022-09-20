package test1.training;

public class firstanswer {
    public static void main(String args[]) {
        int[] arr = {1, 25, 80, 71, 88, 7, 3, 31, 560, 23};
        for (int n : arr) {
            int i, m = 0, flag = 0;
            int sum = 0;
            m = n / 2;
            if (n == 0 || n == 1) {
                System.out.println(n + " is not prime number");

            } else {
                for (i = 2; i <= m; i++) {
                    if (n % i == 0) {
                        System.out.println(n + " is not prime number");
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println(n + " is prime number");
                    sum = sum + n;
                }

            }
        }
    }


}
