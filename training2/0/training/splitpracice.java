package test1.training;

public class splitpracice {
    public static void main(String[] args) {

        String str="my name is zeeshan";
        String finalstring= "";
        String[] str2=str.split("\\s");
        for (int i = str2.length-1; i >=0 ; i--) {

            System.out.println(str2[i]);
            finalstring=finalstring+str2[i]+" ";
        }
        System.out.println(finalstring);
    }
}
