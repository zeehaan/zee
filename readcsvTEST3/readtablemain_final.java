package readcsvTEST3;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class readtablemain_final {
    public static void main(String[] args) throws IOException {

        System.out.println("Kindly Enter Your Operation"+"\n"+
                "1. To Get Details By entering guid"+"\n"+
                "2. To Get Values of Profile,Name,Grade,Mark"+"\n"+
                "3. To Get Sorted Profile"+"\n"+
                "4. To Get Sorted Name "+"\n"+
                "5. To Get Grouped Based On Profile"+"\n"+
                "6. To Exit");



//        readtableclass_final ob=new readtableclass_final();
//        ob.gettingguid("guid:104b0a86-2b30-4da7-92e5-7f87eae22933");
        readtableclass_editing ob1=new readtableclass_editing();
        ob1.readtablePNGM();
//        sortbyprofile ob2=new sortbyprofile();
//      ob2.profile();
//     ob2.name();
//     ob2.mark();

    }
}