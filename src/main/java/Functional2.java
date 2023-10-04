public class Functional2 implements Functional {

    Func2 func2;

    public double start;
    public double end;

    @Override
    public double solve(Object function, double x) {
        func2 = (Func2) function;
        double solution;
        try {
            solution = Math.asin(x / func2.getA()) / func2.getB();
        } catch (IllegalArgumentException e){
            throw new IllegalArgumentException(e);
        }
        return solution;
    }

    public double getStart(double start) {
        return func2.solve(start);
    }

    public double getAver(double start, double end) {
        return func2.solve((end - start) / 2);
    }

    public double getEnd(double end) {
        return func2.solve(end);
    }

    public Functional2(double start, double end) {
        this.start = start;
        this.end = end;
    }

    public double integral() {
        double sum = 0;
        for (double i = start; i < end; i += 0.001) {
            sum += func2.solve(i) * 0.001;
        }
        return sum;
    }

}