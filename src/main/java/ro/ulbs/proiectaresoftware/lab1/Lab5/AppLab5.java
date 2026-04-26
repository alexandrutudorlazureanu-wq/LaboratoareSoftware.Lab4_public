package ro.ulbs.proiectaresoftware.lab1.Lab5;


public class AppLab5 {
    public static void main(String[] args) {

        IntCalculator calculator = new IntCalculator(10);

        int result = calculator.add(5).subtract(3).multiply(2).result();

        System.out.println("a) " + result);


        AdvancedCalculator adv = new AdvancedCalculator(10);

        int advResult = adv.add(5).divide(3).power(2).result();

        System.out.println("b) " + advResult);

    }


    public static class IntCalculator {
        protected int state;

        public IntCalculator(int initialState) {
            this.state = initialState;
        }

        public IntCalculator add(int v) { this.state += v; return this; }
        public IntCalculator subtract(int v) { this.state -= v; return this; }
        public IntCalculator multiply(int v) { this.state *= v; return this; }

        public int result() { return this.state; }
        public IntCalculator clear() { this.state = 0; return this; }
    }


    public static class AdvancedCalculator extends IntCalculator {
        public AdvancedCalculator(int initialState) { super(initialState); }

        public AdvancedCalculator divide(int v) {
            if(v != 0) this.state /= v; return this;
        }
        public AdvancedCalculator power(int n) {
            this.state = (int) Math.pow(this.state, n); return this;
        }
        public AdvancedCalculator root(int n) {
            this.state = (int) Math.pow(this.state, 1.0/n); return this;
        }


        @Override public AdvancedCalculator add(int v) {
            super.add(v); return this;
        }
        @Override public AdvancedCalculator subtract(int v) {
            super.subtract(v); return this;
        }
        @Override public AdvancedCalculator multiply(int v) {
            super.multiply(v); return this;
        }
    }


}
