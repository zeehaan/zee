package practicepackages;

public class p3 {
    public static void main(String[] args) {
        char ch = 'A';
        System.out.println("@");
        for (int i = 5; i >= 1; i--) {
            System.out.print("@");

            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.println("@");
        }
        for (int j = 5; j > 0; j--) {
            System.out.print("@");
        }
    }
    }
