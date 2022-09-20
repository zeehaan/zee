package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readingcsv1 {
    public static void main(String[] args) throws IOException {
        FileReader f11=new FileReader("C:\\DummyDir\\csv-3.csv\\");
        BufferedReader br1=new BufferedReader(f11);

        int j=0;
        while((j=br1.read())!=-1){

            System.out.println(br1.readLine());
//            System.out.println(j);
        }

        br1.close();
    }



//dation,Percentage,H41,Liabilities structure,Financial ratios,37,ANZSIC06 group H440 {first line 1st file}
//013,Level 3,ZZ11,Food product manufacturing,Percentage,H41,Liabilities structure,Financial ratios,46,"ANZSIC06 groups C111, C112, C113, C114, C115, C116, C117, C118, and C119"
//gible assets,950,DOLLARS(millions)
//021,all,All Industries,j_Grand_Total,Fixed tangible assets,591351,DOLLARS(millions)
}
