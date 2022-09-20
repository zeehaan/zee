package filehandling;
import java.io.*;
import java.io.IOException;

public class deserialization {
        public static class dog1 {
            public static void main(String[] args) throws IOException, ClassNotFoundException {
                FileInputStream fs=new FileInputStream("pqr.txt");
                ObjectInputStream ob=new ObjectInputStream(fs);
                dog d=(dog)ob.readObject();
                System.out.println(d.legs);
                System.out.println(d.bread);
               }
        }
    }

