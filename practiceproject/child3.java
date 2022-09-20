package practiceproject;

public class child3 extends child2{
    int childno=4;
  static int a=3;
    int order =3;
   String childname="4thone";




    public static void main(String[] args) {
        child3 ob7=new child3();
        System.out.println(ob7.order);
        System.out.println(a);
    }
    child3(){
        System.out.println("he is calling child4");
    }
}
