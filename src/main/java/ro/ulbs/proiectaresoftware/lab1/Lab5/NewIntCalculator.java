package ro.ulbs.proiectaresoftware.lab1.Lab5;

import ro.ulbs.proiectaresoftware.lab1.Lab5.advanced.ACalculator;

public class NewIntCalculator extends ACalculator<Integer> {


    @Override
    public NewIntCalculator init(Integer initialValue) {
        this.state = initialValue;
        return this;
    }

    public NewIntCalculator add(Integer v) {
        this.state += v; return this;
    }
    public NewIntCalculator subtract(Integer v) {
        this.state -= v; return this;
    }
    public NewIntCalculator multiply(Integer v) {
        this.state *= v; return this;
    }

}
