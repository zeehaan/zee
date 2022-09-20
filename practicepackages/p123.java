package practicepackages;
public class p123 {
    public static void main(String[] args) {
        Student ob= new Student("zee",25);
        ob.printinfo();
    }
}



class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void printinfo()
    {
        System.out.println("Student name is  : "+name);
        System.out.println("Age is : "+age);
    }
}
