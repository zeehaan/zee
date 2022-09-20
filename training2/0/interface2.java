package test1;

interface  interface11{
    void test1();
    void test2();
}
public class interface2 implements interface11 {
    public void test1(){
        System.out.println("from test1");
    }
    public void test2(){
        System.out.println("from test2");
    }
    public void test3(){
        System.out.println("from test3");
    }

    public static void main(String[] args) {
        interface2 inter=new interface2();
       inter.test1();
        inter.test2();
        inter.test3();



    }
}
