package test2;
import java.util.ArrayList;
public class Employeefunction {
    ArrayList<Emp99> employeelist = new ArrayList<Emp99>();

    void addemployee(Emp99 e) {
        employeelist.add(e);
    }

    int returncounterinteger(){
        return employeelist.size();
    }
    int calctotalsal() {
        int totalsal = 0;

        for (int i = 0; i < employeelist.size(); i++) {
            totalsal += employeelist.get(i).sal;
        }
        return totalsal;
    }

    Emp99 GetEmployeedetails(int empID2) {
        boolean match = false;
        for (int i = 0; i < employeelist.size(); i++) {
            if (empID2 == employeelist.get(i).empID) {
                match = true;
                return employeelist.get(i);
            }
        }
        if (match) {
            return null;
        }

        return null;
    }

    double CalavgExperienceOftheEmployee() {
        int avgexp = 0;
        for (int i = 0; i < employeelist.size(); i++) {
            avgexp += employeelist.get(i).exp;
        }
        return avgexp / 6;
    }

    Emp99 ModifyExpOfTheEmployee(int empid2, int exp2) {
        boolean match1 = true;
        for (int i = 0; i < employeelist.size(); i++) {

            if (empid2 == employeelist.get(i).empID) {
                match1 = true;
                employeelist.get(i).exp = exp2;
                return employeelist.get(i);
            }
        }

        return null;
    }


    Emp99 ModifyNameOfTheEmployee(String name, String name2) {
        for (int i = 0; i < employeelist.size(); i++) {
//            System.out.println("inside loop :"+employeelist.get(i).name);
//            if( employeelist.get(i).name.equals(name)){
            if (name == employeelist.get(i).name) {

                employeelist.get(i).name = name2;
                return employeelist.get(i);
            }
        }
        return null;
    }

    void DeleteAEmploye(int eidID) {

//        Emp99 a;
        for (int i = 0; i < employeelist.size(); i++) {
            if (eidID == employeelist.get(i).empID) {
//            String ob12 = null;
//            employeelist.get(i).sal = Double.parseDouble(ob12);
//                 a =employeelist.get(i);
                 employeelist.remove(i);
                 break;

            }
        }

    }
//    void deletepart2(Emp99 a){
//        System.out.println(employeelist.contains(a));
//        System.out.println("a has:"+a.empID);
//        System.out.println(employeelist.contains(a));
//        if(a.empID==111){



//        }

    }






