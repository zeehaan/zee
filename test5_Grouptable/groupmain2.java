package test5_Grouptable;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class groupmain2 {

    public static void main(String[] args) throws IOException {
        groupclass2 ob2=new groupclass2();
        ob2.readingTable2();
        Map<String, List<objectfile2>> finalVal1 =  ob2.groupingTable2();
        ob2.m1(finalVal1);
        ob2.sortbykey2();
        ob2.modifykey2();
        ob2.gettable2();


    }
}
