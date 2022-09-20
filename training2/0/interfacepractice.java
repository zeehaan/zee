package test1;

interface i1{
    void test11();
    void test2();
}
public class interfacepractice implements i1 {
    public void test11(){
        System.out.println("from test11");
    }
    public void test2(){
        System.out.println("from test11");
    }
    public static void main(String[] args) {
        interfacepractice ob=new interfacepractice();
        ob.test11();
        ob.test2();
    }
}
