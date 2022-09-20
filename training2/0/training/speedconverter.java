package test1.training;

public class speedconverter {
    public static long tomilestokilometer(double kilometerperhour) {
        if (kilometerperhour < 0)
            return -1;
        else {
            return Math.round(kilometerperhour / 1.609);
        }

    }

    public static void printconversion(double kilometerperhour) {
        if (kilometerperhour < 0) {
            System.out.println("invalid value");
        } else {
            long milesperhour = tomilestokilometer(kilometerperhour);
            System.out.println(kilometerperhour + "km/hr" + milesperhour + "m/hr");
        }
    }
}
