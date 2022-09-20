package roundanumber;


import java.math.RoundingMode;
import java.text.DecimalFormat;

public class one {
    public static void main(String[] args) {

        double num = 234561.87677777;

        DecimalFormat df = new DecimalFormat("#.#####");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println(df.format(num));


//       double num = 1.34567;
//
//        System.out.format("%.4f", num);



        }

    }

