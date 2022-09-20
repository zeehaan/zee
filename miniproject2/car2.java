package miniproject2;
public class car2 {
    public static void main(String[] args) {
        car ob1=new car(111,"odi","white",1200000,15,250);
        car ob2=new car(222,"benz","black",2300000,20,180);
        car ob3=new car(333,"ferrari","green",4000000,24,140);
        car ob4=new car(444,"suzuki","red",7900000,25,230);
        car ob5=new car(555,"verna","pink",5500000,18,160);
        car ob6=new car(666,"scorpio","grey",1900000,14,95);
        car3 ob=new car3();
        car[] ob0={ob1,ob2,ob3,ob4,ob5,ob6};
        int n=ob0.length;
        System.out.println("Number of Objects in the file :"+n);
        System.out.println("=========================================================================================================================");

       for (int i = 0; i <n ; i++) {
            ob.addmodel(ob0[i]);
        }
        System.out.println("The model number 111 contains in the list :"+ob.ismodelcontins(111));
        System.out.println("=========================================================================================================================");

        System.out.println(ob.printmodeldetails(111));
        System.out.println("=========================================================================================================================");

        System.out.println("The colour before modification of model number 333 is "+ob3.colour);
        ob.modifymodelwithcolour(333,"purple");
        System.out.println("The modified colour of model number 333 is "+ob3.colour);
        System.out.println("=========================================================================================================================");

        int avg= ob.avgmileage(n);
        System.out.println("The Average Mileage of The Sum of Cars is :"+avg);
        System.out.println("=========================================================================================================================");

        int countofcars=ob.returncountofcars();
        System.out.println("Number of car before deleteingthemodel "+countofcars);
        ob.deletethemodel(444);
        countofcars=ob.returncountofcars();
        System.out.println("Number of car after deleteingthemodel "+countofcars);
        System.out.println("=========================================================================================================================");
    }
}
//    boolean flag=true;
//        int i=0;
//        while(flag){
//           System.out.println("Enter the value to add the object into the file :"+i);
//         if(ob0[i].equals(ob0[i])){
//           System.out.println("Enter valid value");
//          }
//          else if(i <n ) {
//               ob.addmodel(ob0[i]);
//               i++;
//           }
//           else{
//              flag=false;
//           }
//       }