package ro.ulbs.proiectaresoftware.lab1.Lab5.advanced;

public class DoubleCalculator extends ACalculator<Double> {



        @Override
        public DoubleCalculator init(Double initialValue) {
            this.state = initialValue;
            return this;
        }

        public DoubleCalculator add(Double v) {
            this.state += v; return this;
        }
        public DoubleCalculator subtract(Double v) {
            this.state -= v; return this;
        }
        public DoubleCalculator multiply(Double v) {
            this.state *= v; return this;
        }


}
