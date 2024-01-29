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
        CalculationQuarter(minutes);
    }


    //все методы которые относятся к логике только этого класса необходимо помечать private
    //у тебя сравнения повторяются. можно вынести эту логику в отдельный метод
    private static boolean isQuarter(int value, int begin, int endExcluded) {
        return begin <= value && value <= endExcluded;
    }

    private static void CalculationQuarter(int value){
        if(isQuarter(value, 0, 14)){
            System.out.println("Число " + value + " попадает в первую четверть часа.");
        }else if(isQuarter(value, 15, 29)){
            System.out.println("Число " + value + " попадает во вторую четверть часа.");
        } else if (isQuarter(value, 30, 44)) {
            System.out.println("Число " + value + " попадает в третью четверть часа.");
        } else if (isQuarter(value, 45, 59)) {
            System.out.println("Число " + value + " попадает в четвертую четверть часа.");
        } else {
            System.out.println("Некорректное значение числа.");
        }
    }
}
