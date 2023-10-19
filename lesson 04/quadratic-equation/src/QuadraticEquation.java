public class QuadraticEquation {
    private double a, b, c;
    public QuadraticEquation() {
    }
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    private double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / ( 2 * a);
    }

    private double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    private boolean isDeltaEqual0 () {
        return (getDiscriminant() == 0);
    }

    private boolean isDeltaLess0 () {
        return (getDiscriminant() < 0);
    }

    public void calculateResult() {
        if (isDeltaLess0()) {
            System.out.println("No real roots");
        } else if (isDeltaEqual0()) {
            System.out.println("One real root: " + getRoot1());
        } else {
            System.out.println("Two real roots: " + getRoot1() + " and " + getRoot2());
        }
    }
}
