package ro.ulbs.proiectaresoftware.lab1.Lab5.advanced;

import ro.ulbs.proiectaresoftware.lab1.Lab5.NewIntCalculator;

public class Lab5Adv {


    public static void main(String[] args) {

        NewIntCalculator intCalc = new NewIntCalculator();
        int resInt = intCalc.init(10).add(5).subtract(3).multiply(2).result();
        System.out.println("Integer Calc Result: " + resInt);


        DoubleCalculator doubleCalc = new DoubleCalculator();
        double resDouble = doubleCalc.init(10.0).add(5.0).subtract(3.3).multiply(2.2).result();
        System.out.println("Double Calc Result: " + resDouble);
    }

}
