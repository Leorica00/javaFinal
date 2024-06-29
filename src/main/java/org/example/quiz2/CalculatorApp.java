package org.example.quiz2;

public class CalculatorApp {
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        System.out.println(simpleCalculator.add(4, 7));
        System.out.println(simpleCalculator.subtract(14, 7));
        System.out.println(simpleCalculator.multiply(3, 4));
        System.out.println(simpleCalculator.divide(7, 0));
    }
}
