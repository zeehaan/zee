package test1;

import test1.training.speedconverter;

public class main {
    public static void main(String[] args) {
        long miles = speedconverter.tomilestokilometer(10.5);
        System.out.println(miles);
        speedconverter.printconversion(10.5);
    }
}
