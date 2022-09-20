package test1;

public class second {
    private static final String INVALID_MESSAGE ="invalid message";
    public static void main(String[] args) {
        System.out.println(getdurationstring(-69,45));
        System.out.println(getdurationstring(3945));
    }
    public static String getdurationstring(long min,long sec){
        if((min <=0)||(sec<0)||(sec>59)){
            return INVALID_MESSAGE;
        }
        else
        {
          long hour=min/60;
          long remainingmin= min%60;

          String stringhour=hour +"h";
          if(hour<10)
          {
              stringhour="0"+stringhour;
          }
            String stringmin=hour +"m";
            if(hour<10)
            {
                stringmin="0"+stringmin;
            }
            String stringsec=hour +"s";
            if(hour<10)
            {
                stringsec="0"+stringsec;
            }
            return stringhour+" "+stringmin+" "+stringsec+" ";
        }

    }


    private static String  getdurationstring(long sec)
    {
        if(sec<=0)
        {
            return INVALID_MESSAGE;
        }
        else {

            long min=sec/60;
            long remainingsec=sec%60;
            return getdurationstring( min,remainingsec);
        }
    }
}
