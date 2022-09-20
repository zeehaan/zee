package test1;

public class isodd {
    public static void main(String[] args) {
        int num=4;
        int finishno=40;
        int evennofind=0;
        while(num <=finishno)
        {
            num++;
            if(!iseven(num))
            {
                continue;
            }

            if(evennofind==5)
            {
                break;
            }
            evennofind++;
            System.out.println("even no is "+ num);

        }
        System.out.println("even number finded is ="+ evennofind);


    }
    public static boolean iseven(int num)
    {
      if(num%2==0)
          return true;
      else
          return false;
    }
}
