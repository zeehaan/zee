package test1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;public class linkedmain { public static void main(String[] args) {
        LinkedList<String> placestovisit =new LinkedList<String>();
//        placestovisit.add("mysore");
//        placestovisit.add("bangalore");
//        placestovisit.add("goa");
//        placestovisit.add("hyderabad");
//        placestovisit.add("mumbai");
//        placestovisit.add("punjab");
//        placestovisit.add("delhi");
//        printlist(placestovisit);
//        placestovisit.add(1,"tumker");
//        printlist(placestovisit);
//        placestovisit.remove(4);
//        printlist(placestovisit);
    checkequal(placestovisit,"mysore");
    checkequal(placestovisit,"bangalore");
    checkequal(placestovisit,"goa");
    checkequal(placestovisit,"hyderabad");
    checkequal(placestovisit,"mumbai");
        checkequal(placestovisit,"punjab");
        checkequal(placestovisit,"delhi");
        printlist(placestovisit);
        checkequal(placestovisit,"himachal");
        checkequal(placestovisit,"delhi");
    }
     public static void printlist(LinkedList<String> linkedList)
     {
         Iterator<String> i= linkedList.iterator();
         while(i.hasNext())
         {
             System.out.println("now visiting :"+i.next());
         }
         System.out.println("============================");
     }

    private static  boolean checkequal(LinkedList<String> linkedlist, String newcity)
    {
        ListIterator<String> stringlistiterator=linkedlist.listIterator();
        while(stringlistiterator.hasNext())
        {
            int comparision=stringlistiterator.next().compareTo(newcity);
            if(comparision==0)
            {
                System.out.println(newcity+"is alreay included in record");
                return false;
            } else if (comparision<0) {
                stringlistiterator.previous();
                stringlistiterator.add(newcity);
                return true;
            }
            else {
                //move to next city
            }
        }
        stringlistiterator.add(newcity);
        return true;
    }

}
