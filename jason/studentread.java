package jason;
import com.google.gson.Gson;
import com.google.gson.internal.bind.util.ISO8601Utils;
import java.lang.reflect.Type;
public class studentread extends studentclas {

    public studentread(int sid, String sname, String branch) {
        super(sid, sname, branch);
    }
    public static void main(String[] args) {
//        String jsonText ="{\"sid\":111,\"sname\":\"zeeshan\",\"branch\":\"civil\"}";



//        String jsonText =  [  {\"sid\":111,\"sname\":\"zeeshan\",\"branch\":\"civil\"},
//            {\"sid\":222,\"sname\":\"moin\",\"branch\":\"mech\"},
//               {\"sid\":333,\"sname\":\"manu\",\"branch\":\"cs\"},
//                   {\"sid\":444,\"sname\":\"sham\",\"branch\":\"it\"},
//                       {\"sid\":555,\"sname\":\"shashi\",\"branch\":\"mining\"}]

//        String jsonText1="[{\"sid\":111,\"sname\":\"zeeshan\",\"branch\":\"civil\"},{\"sid\":222,\"sname\":\"moin\",\"branch\":\"mech\"}]";
        String j1="{\"sid\":111,\"sname\":\"zeeshan\",\"branch\":\"civil\"}";
        String j2="{\"sid\":222,\"sname\":\"moin\",\"branch\":\"cs\"}";
        String j3="{\"sid\":333,\"sname\":\"manu\",\"branch\":\"mech\"}";
        String j4="{\"sid\":444,\"sname\":\"sham\",\"branch\":\"it\"}";
        String j5="{\"sid\":555,\"sname\":\"adi\",\"branch\":\"mining\"}";

        Gson gson = new Gson();
        String[] j={j1,j2,j3,j4,j5};
        for (int i = 0; i < j.length; i++) {
            studentread student =  gson.fromJson(j[i], studentread.class);
            System.out.println("Student ID is: "+student.getSid()+",his name is :"+student.getSname()+", and his branch is :"+student.getBranch());
        }
    }
}

