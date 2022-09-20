package test1;

import test1.training.inheritpractice;

public class inheritpractice3 extends test1.inheritpractice2 {
    public void test3(){
        System.out.println("from test3");
    }
    public static void main(String[] args) {
        inheritpractice ob=new test1.inheritpractice2();
        ob.test1();
        System.out.println("=====================");
        test1.inheritpractice2 ob1=new test1.inheritpractice2();
        ob1.test2();
        ob1.test1();

        inheritpractice3 ob2=new inheritpractice3();
        ob2.test3();
        ob2.test1();
        ob2.test1();
    }
}
