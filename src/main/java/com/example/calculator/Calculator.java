package com.example.calculator;

/**
 * Простой калькулятор для демонстрации CI/CD
 */
public class Calculator {

    /**
     * Сложение двух чисел
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Вычитание двух чисел
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Умножение двух чисел
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Деление двух чисел
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль недопустимо");
        }
        return (double) a / b;
    }

    /**
     * Возведение в степень
     */
    public double power(int base, int exponent) {
        return Math.pow(base, exponent);
    }
}