package oopspractice;

public class inheritance2 extends inheritance {
    int b=80;
    void test2() {
        System.out.println("This is test2");
    }

    public static void main(String[] args) {
        inheritance2 ob = new inheritance2();
        ob.test1();
        ob.test2();
        System.out.println(ob.a());
        System.out.println(ob.b);
    }
}
