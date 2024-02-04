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
    //все операторы нам известны, я бы вынес их в константы
    private static final char ADDITION = '+';
    private final static char SUBTRACTION = '-';
    private final static char MULTIPLICATION = '*';
    private final static char DIVISION = '/';
    private final static char MODULUS = '%';

    public static void main(String[] args) {

        double operand1 = 10.0;
        double operand2 = 0.0;

        //и дальше бы делал так
        //char operation = DIVISION;
        char operation = DIVISION;
        calculate(operand1, operand2, operation);
    }

    //название isResult не очень отображает то что делает метод, притом is в названии отзначает что метод
    //возвращает boolean значение. а у тебя double. можно назвать как нить по другому типа calculate
    private static void calculate(double value1, double value2, char operation) {
        switch (operation) {
            case ADDITION -> System.out.println(addition(value1, value2));
            case SUBTRACTION -> System.out.println(subtraction(value1, value2));
            case MULTIPLICATION -> System.out.println(multiplication(value1, value2));
            case DIVISION -> System.out.println(division(value1, value2));
            case MODULUS -> System.out.println(modulus(value1, value2));
//            default -> throw new IllegalArgumentException("Invalid mathematical operation");
        }
        ;
    }

    //математические операции лучше вынести в отделные методы.
    private static double addition(double value1, double value2) {
        return value1 + value2;
    }

    private static double subtraction(double value1, double value2) {
        return value1 - value2;
    }

    private static double multiplication(double value1, double value2) {
        return value1 * value2;
    }

    //деление на 0? может упасть ошибка, я бы както обработал этот кейс
    private static double division(double value1, double value2) {
        double result = 0.0;
        if (value2 != 0) {
            result = value1 / value2;
        }
        return result;
    }

    private static double modulus(double value1, double value2) {
        return value1 % value2;
    }
}
