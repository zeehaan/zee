package jason;
import com.google.gson.Gson;
import com.google.gson.internal.bind.util.ISO8601Utils;
import java.lang.reflect.Type;
import com.google.gson.Gson;
public class carmain extends carclass {
    public carmain(int modelnumber, String modelname, String colour, int price, int mileage, int cc) {
        super(modelnumber, modelname, colour, price, mileage, cc);
    }

    public static void main(String[] args) {
        String JsonText=   "[{\"modelnumber\":111,\"modelname\":\"odi\",\"colour\":\"white\",\"price\":1200000,\"mileage\":15,\"cc\":250},"+
                "{\"modelnumber\":222,\"modelname\":\"benz\",\"colour\":\"black\",\"price\":2300000,\"mileage\":20,\"cc\":180},"+
                "{\"modelnumber\":333,\"modelname\":\"ferrari\",\"colour\":\"green\",\"price\":4000000,\"mileage\":24,\"cc\":140},"+
                "{\"modelnumber\":444,\"modelname\":\"suzuki\",\"colour\":\"red\",\"price\":7900000,\"mileage\":25,\"cc\":230},"+
                "{\"modelnumber\":555,\"modelname\":\"verna\",\"colour\":\"pink\",\"price\":5500000,\"mileage\":18,\"cc\":160},"+
                "{\"modelnumber\":666,\"modelname\":\"scorpio\",\"colour\":\"grey\",\"price\":1900000,\"mileage\":14,\"cc\":95}]";
        Gson gson = new Gson();
        carmain student1 =  gson.fromJson(JsonText, carmain.class);
        System.out.println("the model number is :" + student1.getModelnumber() + "number is:" + student1.getModelname() +
                "colour is:" + student1.getColour()+"price is :"+student1.getPrice()+"mileage is:"+student1.getMileage()+"cc is:"+student1.getCc());
    }
}


