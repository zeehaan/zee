package test1;

class Student{
    int age;
    String name;
   public void printinfo(){
       System.out.println(this.name);
       System.out.println(this.age);
    }
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
public class oopspractice1 {
    public static void main(String[] args) {
        Student s1 = new Student(23, "zee");
        Student s2 = new Student(21, "manu");
        Student s3 = new Student(23, "sham");
        s1.printinfo();
        s2.printinfo();
        s3.printinfo();

    }
}
