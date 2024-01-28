package com.viktoria.cs.lesson18.hw;

/**
 * Даны 3 переменные:
 * <p>
 * - operand1 (double)
 * - operand2 (double)
 * - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
 * <p>
 * Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 * Протестировать функцию в main.
 * <p>
 * Например:
 * Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
 * Результат: 34.5 (24.4 + 10.1)
 */
public class Task2 {
    public static void main(String[] args) {
        double operand1 = 10.0;
        double operand2 = -5.0;
        char operation = '/';
        System.out.println(isResult(operand1, operand2, operation));
    }

    public static double isResult(double value1, double value2, char operation) {
        double result;
        if (operation == '+') {
            result = value1 + value2;
            return result;
        } else if (operation == '-') {
            result = value1 - value2;
            return result;
        } else if (operation == '*') {
            result = value1 * value2;
            return result;
        } else if (operation == '/') {
            result = value1 / value2;
            return result;
        } else if (operation == '%') {
            result = value1 % value2;
            return result;
        } else {
            return result = 0.0;//возвращает при некорректно введенном operation, например operation == ')'.
                                //Наверняка есть более правильное решение такого исхода,
                                // т.к. result = 0.0 может быть и при корректно введенном operation.

        }
    }
}
