package jason;
import com.google.gson.Gson;
public class jason2java2jason {



    static class Student {
        int age;
        String name;
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    public static void main(String[] args) {
        //from java to json
        Student student = new Student("zee", 25);
        Gson gson = new Gson();
        String json = gson.toJson(student);
        System.out.println(json);

////from jason to java
//          String jsonText="{\"name\":\"zee\",\"age\":\"25\"}";
//            Gson gson = new Gson();
//            Student student=gson.fromJson(jsonText,Student.class);
//           System.out.println("student name :"+student.name+"\n"+"Age is :"+student.age);
    }
}


