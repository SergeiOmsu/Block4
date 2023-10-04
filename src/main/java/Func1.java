public class Func1 implements Function {
    private double A;
    private double B;

    private double start;
    private double end;

    @Override
    public double solve(double x) {
        return A * x + B;
    }

    public void setA(double A) {
        this.A = A;
    }

    public void setB(double B) {
        this.B = B;
    }

    public void setStart(double start) {
        this.start = start;
    }

    public void setEnd(double end) {
        this.end = end;
    }

    @Override
    public double getStart() {
        return start;
    }

    @Override
    public double getEnd() {
        return end;
    }

    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }
}
