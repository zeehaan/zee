package jason;
import com.google.gson.Gson;
public class studentmain {
    public static void main(String[] args) {
        studentclas S1=new studentclas(111,"zeeshan","civil");
        studentclas S2=new studentclas(222,"moin","mech");
        studentclas S3=new studentclas(333,"manu","cs");
        studentclas S4=new studentclas(444,"sham","it");
        studentclas S5=new studentclas(555,"shashi","mining");
        Gson gson=new Gson();
            studentclas[] s = {S1, S2, S3, S4, S5};
            for (int i = 0; i < s.length; i++) {
                String json = gson.toJson(s[i]);
                System.out.println(json);
            }
    }
}
