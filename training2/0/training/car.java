package test1.training;

public class car{

    String modelname;
    String colour;
    double price;
    compengine x;

    public void printinfo(){
        System.out.println(" the car is "+this.modelname+" the colour is "+this.colour+" and its price is "+this.price+" its power is"+this.x.cc+"its mileage is "+this.x.mileage+"its power is "+this.x.power);
    }


    public car(String modelname, String colour, double price, compengine x) {
        this.modelname = modelname;
        this.colour = colour;
        this.price = price;
        this.x=x;
    }

    public static void main(String[] args) {
        compengine e=new compengine( 21,34,78);
        car c1=new car("odi","white",230.987,e);
        car c2=new car("verna","green",232.987,e);
        car c3=new car("matiz","black",233.987,e);
        car c4=new car("benz","brown",238.987,e);

        c1.printinfo();
        c2.printinfo();
        c3.printinfo();
        c4.printinfo();
    }

}
