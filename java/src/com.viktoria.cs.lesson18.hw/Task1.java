package com.viktoria.cs.lesson18.hw;
/**
 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 * <p>
 * Протестировать функцию в main.
 */
public class Task1 {
    public static void main(String[] args) {
        int minutes = 18;
        isQuarter(minutes);
    }

    public static void isQuarter(int value) {
        if (0 <= value && value <= 14) {
            System.out.println("Число " + value + " попадает в первую четверть часа.");
        } else if (15 <= value && value <= 29) {
            System.out.println("Число " + value + " попадает во вторую четверть часа.");
        } else if (30 <= value && value <= 44) {
            System.out.println("Число " + value + " попадает в третью четверть часа.");
        } else if (45 <= value && value <= 59) {
            System.out.println("Число " + value + " попадает в четвертую четверть часа.");
        } else {
            System.out.println("Некорректное значение числа.");
        }
    }
}
