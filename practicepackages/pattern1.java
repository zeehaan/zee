package practicepackages;

public class pattern1 {
    public static void main(String[] args) {
        char ch='A';
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(ch++);
            }
            for (int k = 5; k >i; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
