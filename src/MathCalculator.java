package src;

public class MathCalculator implements Calculator{
    public double add(double x, double y) {
        return x + y;
    }
    public double subtract(double x, double y) {
        return x - y;
    }
    public double divide(double x, double y) {
        return x / y;
    }
    public double multiply(double x, double y) {
        return x * y;
    }
}
