package test1.training;

public class employee {
    String ename;
    int eid;
    double sal;

    public employee(String ename, int eid, double sal) {
        this.ename = ename;
        this.eid = eid;
        this.sal = sal;
    }
    public void work(){}
    public void display(){
        System.out.println(" Ename ="+this.ename+"eid ="+this.eid+"sal ="+this.sal);
    }
}

