package test1.training;
import java.util.Scanner;
public class enter
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the value of length");
        double length =sc.nextDouble();
//        System.out.println("Enter the ratio size of the cube :");
//        double length= sc.nextDouble();
        secondanswer ob=new secondanswer(length);
        ob.length=5;
        System.out.println("The volume of the cube is :"+ob.getvolumeofthecube());
        System.out.println("After doubling the size of the cube :"+ob.doublethesizeofthecube());
        System.out.println("The Surface of the cube is :"+ob.getsurfaceareaofthecube());
//        System.out.println("After changing the vertex length of the cube we get....");
//        ob.modifyveertexlength();
//        System.out.println("The volume of the cube is :"+ob.getvolumeofthecube());
//        System.out.println("After doubling the size of the cube :"+ob.doublethesizeofthecube());
//        System.out.println("The Surface of the cube is :"+ob.getsurfaceareaofthecube());
    }
} class secondanswer {
    double length;
    //creation of cube
    //lengthofsideofacube=length;
    //modifiedvertexlength=b;
    public secondanswer(double length)
    {
        this.length = length;
    }
    public double getvolumeofthecube() {
         return length*length*length;
    }

    public double doublethesizeofthecube() {
        return 2*length*length*length ;
    }
    public double getsurfaceareaofthecube() {
        return 6*length*length ;

    }

    public void modifyveertexlength () {
         length=length;

    }

}
