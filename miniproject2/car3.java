package miniproject2;
import java.io.Serializable;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class car3 implements Serializable {
    LinkedList<car> carlist = new LinkedList<car>() {


////      public   void addmodel(car c) {
////         for (int i = 0; i < carlist.size(); i++) {
////             if (carlist.get(i) == c) {
////                 System.out.println("The ModelNumber Already exist please enter valid ModelNumber");
////             } else
//            {
////                carlist.add(c);
//            }
////         }
////          return null;
//        }

        boolean ismodelcontins(int modelnumber2) {
            for (int i = 0; i < carlist.size(); i++) {
                if (carlist.get(i).modelnumber == modelnumber2) {
                    return true;
                }
            }
            return false;
        }

        String printmodeldetails(int modelnumber2) {
            for (int i = 0; i < carlist.size(); i++) {
                if (carlist.get(i).modelnumber == modelnumber2) {
                    return "'The Model Number is':'" + carlist.get(i).modelnumber +
                            "',\n'Model name is':'" + carlist.get(i).modelname +
                            "',\n'Colour is':'" + carlist.get(i).colour +
                            "',\n'Price is':'" + carlist.get(i).price +
                            "',\n'Mileage is':'" + carlist.get(i).mileage +
                            "',\n'and cc is':'" + carlist.get(i).cc + "'.";
                }
            }
            return null;
        }

        String modifymodelwithcolour(int modelnumber2, String colour2) {
            for (int i = 0; i < carlist.size(); i++) {
                if (carlist.get(i).modelnumber == modelnumber2) {
                    carlist.get(i).colour = colour2;
                }
            }
            return colour2;
        }

        int avgmileage(int n) {
            int avgm = 0;
            for (int i = 0; i < carlist.size(); i++) {
                avgm += carlist.get(i).mileage;
            }
            return avgm / n;
        }

         public void deletethemodel(int modelnumber2) {
            for (int i = 0; i < carlist.size(); i++) {
                if (carlist.get(i).modelnumber == modelnumber2) {
                    carlist.remove(i);
                    break;
                }
            }
        }

        int returncountofcars() {
            return carlist.size();
        }
    }
;

    public void addmodel(car c) {
        carlist.add(c);
    }

    public boolean ismodelcontins(int modelnumber2) {
        for (int  i = 0; i < carlist.size(); i++) {
            if (carlist.get(i).modelnumber == modelnumber2) {
                return true;
            }
        }
        return false;
    }

    public String printmodeldetails(int modelnumber2) {
        for (int i = 0; i < carlist.size(); i++) {
            if (carlist.get(i).modelnumber == modelnumber2) {
                return "'The Model Number is':'" + carlist.get(i).modelnumber +
                        "',\n'Model name is':'" + carlist.get(i).modelname +
                        "',\n'Colour is':'" + carlist.get(i).colour +
                        "',\n'Price is':'" + carlist.get(i).price +
                        "',\n'Mileage is':'" + carlist.get(i).mileage +
                        "',\n'and cc is':'" + carlist.get(i).cc + "'.";
            }
        }
        return null;
    }

    String modifymodelwithcolour(int modelnumber2, String colour2) {
        for (int i = 0; i < carlist.size(); i++) {
            if (carlist.get(i).modelnumber == modelnumber2) {
                carlist.get(i).colour = colour2;
            }
        }
        return colour2;
    }

    int avgmileage(int n) {
        int avgm = 0;
        for (int i = 0; i < carlist.size(); i++) {
            avgm += carlist.get(i).mileage;
        }
        return avgm / n;
    }

    int returncountofcars() {
        return carlist.size();
    }

    public void deletethemodel(int modelnumber2) {
        for (int i = 0; i < carlist.size(); i++) {
            if (carlist.get(i).modelnumber == modelnumber2) {
                carlist.remove(i);
                break;
            }
        }
    }
}
