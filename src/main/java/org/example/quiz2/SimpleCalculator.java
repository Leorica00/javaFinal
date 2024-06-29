package org.example.quiz2;

import java.io.IOException;
import java.util.logging.*;

public class SimpleCalculator implements Calculator{
    private static final Logger logger = Logger.getLogger("QuizN2");

    public SimpleCalculator() {
        try {
            Handler fileHandler = new FileHandler("calculator.txt", true);
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            logger.log(Level.WARNING, "Error occurred during fileHandler initializing", e.getMessage());
        }
    }

    @Override
    public int add(int a, int b) {
        try {
            logger.log(Level.INFO, "addition was successful. result is - "+(a+b));
            return a+b;
        }catch (ArithmeticException e) {
            logger.log(Level.WARNING, "Error occurred during addition", e.getMessage());
        }
        return 0;
    }

    @Override
    public int subtract(int a, int b) {
        try {
            logger.log(Level.INFO, "subtraction was successful. result is - "+(a+b));
            return a-b;
        }catch (ArithmeticException e) {
            logger.log(Level.WARNING, "Error occurred during subtraction", e.getMessage());
        }
        return 0;
    }

    @Override
    public int multiply(int a, int b) {
        try {
            logger.log(Level.INFO, "multiplication was successful. result is - "+(a+b));
            return a*b;
        }catch (ArithmeticException e) {
            logger.log(Level.WARNING, "Error occurred during multiplication", e.getMessage());
        }
        return 0;
    }

    @Override
    public int divide(int a, int b) {
        try {
            logger.log(Level.INFO, "division was successful. result is - "+(a+b));
            return a/b;
        }catch (ArithmeticException e) {
            logger.log(Level.WARNING, "Error occurred during division", e.getMessage());
        }
        return 0;
    }
}
