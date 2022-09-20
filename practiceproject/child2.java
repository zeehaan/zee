package practiceproject;

import com.google.gson.internal.bind.util.ISO8601Utils;

public class child2 extends  parent {
    int grade=2;
    int order=2;
int childno=2;
int a=2;


    public static void main(String[] args) {
        child1 ob=new child1();
        System.out.println(ob.grade);
    }

String child2name="alia";

    void walk(){
        System.out.println("childno is :"+childno+"name is :"+child2name+"Child2 is walking");
    }
    void talk(){
        System.out.println("childno is :"+childno+"name is :"+child2name+"Child2 is talking");
    }

    public  void putchildgrade(int grade ){
        this.grade=grade;
    }
}
