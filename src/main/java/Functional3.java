public class Functional3 implements Functional {

    Func3 func3;

    public double start;
    public double end;

    @Override
    public double solve(Object function, double x) {
        func3 = (Func3) function;
        double solution;
        try {
            solution = (func3.getB() - x * func3.getD()) / (x * func3.getC() - func3.getA());
        } catch (IllegalArgumentException e){
            throw new IllegalArgumentException(e);
        }
        return solution;
    }

    public double getStart(double start) {
        return func3.solve(start);
    }

    public double getAver(double start, double end) {
        return func3.solve((end - start) / 2);
    }

    public double getEnd(double end) {
        return func3.solve(end);
    }

    public Functional3(double start, double end) {
        this.start = start;
        this.end = end;
    }

    public double integral() {
        double sum = 0;
        for (double i = start; i < end; i += 0.001) {
            sum += func3.solve(i) * 0.001;
        }
        return sum;
    }

}