package readcsvTEST3;

import java.io.IOException;

public class READMAIN {
    public static void main(String[] args) throws IOException {
        READCLASS ob=new READCLASS();
        ob.readfile();
//      ob.displaycompletefile();
        ob.modify();
        ob.displayfile();
    }
}
