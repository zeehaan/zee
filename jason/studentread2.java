package jason;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.internal.bind.util.ISO8601Utils;
import java.lang.reflect.Type;
import java.util.Map;


public class studentread2 extends studentclas {

    public studentread2(int sid, String sname, String branch) {
        super(sid, sname, branch);
    }

    public static void main(String[] args) {
//        String jsonText ="{\"sid\":111,\"sname\":\"zeeshan\",\"branch\":\"civil\"}";

//        String jsonText="[{\"sname\":\"zeeshan\",\"sid\":111,\"branch\":\"civil\"},{\"sname\":\"moin\",\"sid\":222,\"branch\":\"mech\"}]";




//        System.out.println("Student ID is: "+student.getSid()+",his name is :"+student.getSname()+", and his branch is :"+student.getBranch());

//        String jsonText =  [  {\"sid\":111,\"sname\":\"zeeshan\",\"branch\":\"civil\"},
//            {\"sid\":222,\"sname\":\"moin\",\"branch\":\"mech\"},
//               {\"sid\":333,\"sname\":\"manu\",\"branch\":\"cs\"},
//                   {\"sid\":444,\"sname\":\"sham\",\"branch\":\"it\"},
//                       {\"sid\":555,\"sname\":\"shashi\",\"branch\":\"mining\"}]

        String jsonText1="[{\"sid\":111,\"sname\":\"zeeshan\",\"branch\":\"civil\"},{\"sid\":222,\"sname\":\"moin\",\"branch\":\"mech\"}]";

        Gson gson = new Gson();
        studentread student =  gson.fromJson(jsonText1, studentread.class);


//        Gson gson = new GsonBuilder().create();
//        Map map = gson.fromJson(jsonText, Map.class);
//        System.out.println(map.);
//        System.out.println("Student ID is: "+map.get()+",his name is :"+student.getSname()+", and his branch is :"+student.getBranch());


        System.out.println("Student ID is: "+student.getSid()+",his name is :"+student.getSname()+", and his branch is :"+student.getBranch());

    }
}

