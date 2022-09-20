package readcsvTEST3;
import java.io.IOException;
import java.util.Scanner;
public class readtablemain_01 {
    void callguid() throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter GUID Values");
        String myguid=sc.nextLine();
        System.out.println("Showing GUID Details");
        readtableclass_final ob=new readtableclass_final();
        ob.gettingguid(myguid);
    }
    void PNGM() throws IOException {
        readtableclass_editing ob1=new readtableclass_editing();
        ob1.readtablePNGM();

    }
    void Profile() throws IOException {
        readtableclass ob=new readtableclass();
        ob.sortprofile();
    }
    void name() throws IOException {
        readtableclass ob=new readtableclass();
        ob.sortname();
    }
    void group() throws IOException {
        readtableclass ob=new readtableclass();
        ob.group();
    }
}
