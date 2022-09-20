package test1;

public class second2 {
    private static String  getdurationstring(long sec)
    {
        if(sec<=0)
        {
            return "invald value";
        }
        else {
            long hour=sec/3600;
            long min=sec/60;
            long remainingsec=sec%60;
            return  hour+"hrs "+min+"min "+remainingsec+"sec ";
        }


    }

    private static String  getdurationstring(long sec,long min)
    {
        if(sec<=0)
        {
            return "invald value";
        }
        else {
            long hour=sec/3600;
             min=sec/60;
            long remainingsec=sec%60;
            return  hour+"hrs "+min+"min "+remainingsec+"sec ";
        }


    }
}
