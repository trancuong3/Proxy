package src;

import java.util.Scanner;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MathCalculatorProxy proxy = new MathCalculatorProxy() {
            @Override
            public double sub(double first, double second) {
                return 0;
            }
        };

        double result = proxy.add(1, 2);
        System.out.println("1 + 2 = " + result);

        try {
            result = proxy.add(2, Double.MAX_VALUE);
            System.out.println("2 + Double.MAX_VALUE = " + result); // Should throw exception
        } catch (RuntimeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
