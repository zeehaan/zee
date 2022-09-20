package test1.training;

public class car1 {
    String modelname;
    String colour;
    double price;
    engine x;

    public car1(String modelname, String colour, double price, engine x) {
        this.modelname = modelname;
        this.colour = colour;
        this.price = price;
        this.x = x;
    }

    public static void main(String[] args) {
        engine e=new engine(12,76.98f,87.09f);
        car1 c1=new car1("matiz","white",23.908d,e);
        car1 c2=new car1("benz","red",23.856d,e);
        car1 c3=new car1("odi","black",23.8796d,e);

        System.out.println(c1.colour);
        System.out.println(c1.x.cc);
    }

}
