public class Functional4 implements Functional {

    Func4 func4;

    public double start;
    public double end;

    @Override
    public double solve(Object function, double x) {
        func4 = (Func4) function;
        double solution;
        try {
            solution = Math.log1p((x - func4.getB()) / func4.getA());
        } catch (IllegalArgumentException e){
            throw new IllegalArgumentException(e);
        }
        return solution;
    }

    public double getStart(double start) {
        return func4.solve(start);
    }

    public double getAver(double start, double end) {
        return func4.solve((end - start) / 2);
    }

    public double getEnd(double end) {
        return func4.solve(end);
    }

    public Functional4(double start, double end) {
        this.start = start;
        this.end = end;
    }

    public double integral() {
        double sum = 0;
        for (double i = start; i < end; i += 0.001) {
            sum += func4.solve(i) * 0.001;
        }
        return sum;
    }

}