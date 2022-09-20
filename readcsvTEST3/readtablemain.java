package readcsvTEST3;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
public class readtablemain {
    public static void main(String[] args) throws IOException {

        readtablemain_01 rd = new readtablemain_01();
        while (true) {
            System.out.println("Please select the desired choice" + "\n" +"\n"+
                    "1. Search by GUID" + "\n" +
                    "2. To get values of Profile,Name,Grade,Mark" + "\n" +
                    "3. To get sorted profile" + "\n" +
                    "4. To get sorted name " + "\n" +
                    "5. To get grouped based on profile" + "\n" +
                    "6. To Exit" + "\n"
            );
            System.out.println(" ---------------------------------------------------------------------------------------------------------------------------------");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    rd.callguid();
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
                    break;

                case 2:
                    rd.PNGM();
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------");

                    break;

                case 3:
                    rd.Profile();
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------");

                    break;

                case 4:
                    rd.name();
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------");

                    break;

                case 5:
                    rd.group();
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------");

                    break;

                default:
                    System.out.println("Thank You For Using Our Service");
                    System.exit(0);
            }
        }
    }
}
















//        readtableclass ob=new readtableclass();
//        ob.getguid();
//        System.out.println("Enter guid");
//        String myguid=sc.nextLine();
//        readtableclass.fileobject ob7 = ob.gettingguid(myguid);    //1
//        readtableclass_editing ob1=new readtableclass_editing();                                       //2
//       ob1.readtablePNGM();
//        ob.sortprofile();                                                                              //3a
//          ob.sortname();                                                                                 //3b
//        ob.getsortednpm();                                                                             //3c
//        ob.group();
//       sortbyprofile ob2=new sortbyprofile();
//      ob2.profile();
//     ob2.name();
