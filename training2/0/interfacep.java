package test1;

import test1.training.i11;
import test1.training.i2;
import test1.training.i3;

public class interfacep implements i11, i2, i3 {
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
        interfacep i=new interfacep();
        i.test1();
        i.test2();
        i.test3();
        System.out.println("==============");


    }
}
