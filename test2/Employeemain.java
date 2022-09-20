package test2;

import test1.training.employee;
import java.math.BigInteger;
public class Employeemain {
    public static void main(String[] args) {
        Emp99 ob1=new Emp99(111,"Zee",5,12000,21,9692587771l);
        Emp99 ob2=new Emp99(222,"shan",9,25000,20,9877596202l);
        Emp99 ob3=new Emp99(333,"manu",7,30000,24,9859602106l);
        Emp99 ob4=new Emp99(444,"sham",6,40000,26,9876599256l);
        Emp99 ob5=new Emp99(555,"moin",10,16000,29,9879632589l);
        Emp99 ob6=new Emp99(666,"alia",8,19000,27,9954627107l);

        Employeefunction ob=new Employeefunction();
        ob.addemployee(ob1);
        ob.addemployee(ob2);
        ob.addemployee(ob3);
        ob.addemployee(ob4);
        ob.addemployee(ob5);
        ob.addemployee(ob6);

//        System.out.println(employeelist.get(i));
        System.out.println("The total sal is :"+ob.calctotalsal());
        System.out.println("==========================================================================");

        System.out.println("The Avg Experience of the employee is "+ob.CalavgExperienceOftheEmployee());
        System.out.println("==========================================================================");


        System.out.println("Experience Of Employee before changing was :"+ob1.exp);
        Emp99 ot1=ob.ModifyExpOfTheEmployee(111,20);
        System.out.println("Experience Of Employee After changing is :"+ot1.exp);
        System.out.println("==========================================================================");


        System.out.println("Name before changing is:"+ob6.name);
//        System.out.println(ob.ModifyNameOfTheEmployee("alia","Ana"));
       Emp99 ot2=  ob.ModifyNameOfTheEmployee("alia","ana");
        System.out.println("Name after changed is :"+ot2.name);
        System.out.println("==========================================================================");


        System.out.println("Objects before deleting :"+ob.returncounterinteger());
//        ob.DeleteAEmploye(111);
      ob.DeleteAEmploye(111);
//        System.out.println(a);
        System.out.println("Objects before deleting :"+ob.returncounterinteger());
//        ob.deletepart2(a);
          //int z=ob.DeleteAEmploy.
        System.out.println("==========================================================================");









//        System.out.println(ob2.empID);
//        System.out.println(ob2.exp);
//        System.out.println(ob.CalavgExperienceOftheEmployee());

    }
}
