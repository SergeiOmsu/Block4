public class Functional1 implements Functional {
    Func1 func1;

    public double start;
    public double end;

    @Override
    public double solve(Object function, double x) {
        func1 = (Func1) function;
        double solution;
        try {
            solution = (x - func1.getB()) / func1.getA();
        } catch (IllegalArgumentException e){
            throw new IllegalArgumentException(e);
        }
        return solution;
    }

    public double getStart(double start) {
        return func1.solve(start);
    }

    public double getAver(double start, double end) {
        return func1.solve((end - start) / 2);
    }

    public double getEnd(double end) {
        return func1.solve(end);
    }

    public Functional1(double start, double end) {
        this.start = start;
        this.end = end;
    }

    public double integral() {
        double sum = 0;
        for (double i = start; i < end; i += 0.001) {
            sum += func1.solve(i) * 0.001;
        }
        return sum;
    }


}
