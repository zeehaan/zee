package practiceproject;
public class parent {
    public int order=0;
    public static void main(String[] args) {
        int a=0;
//        protected int parentno=0;
//        private int parentstart=0;
        System.out.println("main has started ------------------");
        child1 ob1=new child1();
        ob1.talk();
        ob1.walk();
        System.out.println(ob1.grade);
        ob1.putchildgrade(2);
        System.out.println(ob1.grade);
        child2 ob2=new child2();
     System.out.println(ob1.grade);
        ob2.putchildgrade(3);
        System.out.println(ob2.grade);
        ob2.talk();
        ob2.walk();


    }
}
class child1 extends parent {
    int a=1;

    int order=1;
    int grade=1;
    int childno=1;
    String child1name="zee";

    parent ob=new parent();

    void walk(){
        System.out.println("childno is :"
                +childno+" name is :"+child1name+" " +
                "Child1 is walking");
    }
    void talk(){
        System.out.println("childno is :"
                +childno+" name is :"+child1name+" " +
                "Child1 is talking");
    }
    public  void putchildgrade(int grade ){
       this.grade=grade;
    }
}