package oopspractice;

public class polymorphysm1 {
    public static void main(String[] args) {
       p1 ob1=new p1("black","puma",123);
        p1 ob2=new p1("white","samsung",193);
        p1 ob3=new p1("brown","lg",198);
        p1[] ob={ob1,ob2,ob3};
        for (int i = 0; i <3; i++) {
            System.out.println((ob[i].brand + " "+ob[i].colour+ " " + ob[i].size+ " " ));
        }
    }
}
class p1{
    String colour;
    String brand;
    int size;
    p1(String colour, String brand, int size){
        this.colour = colour;
        this.brand = brand;
        this.size = size;
    }
}

