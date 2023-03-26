// Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ).

package Java.homework_1.task_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет! Эта программа простой калькулятор.\n");

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        float number1 = scan.nextFloat();
        System.out.print("Введите знак: ");
        String symbol = scan.next();
        System.out.print("Введите второе число: ");
        float number2 = scan.nextFloat();

        float result = 0;

        if(symbol.equals("+")) {
            result = number1 + number2;
            System.out.printf("\nОтвет: " + result);
        }
        else if(symbol.equals("-")) {
            result = number1 - number2;
            System.out.printf("\nОтвет: " + result);
        }
        else if(symbol.equals("*")) {
            result = number1 * number2;
            System.out.printf("\nОтвет: " + result);
        }
        else if(symbol.equals("/")) {
            result = number1 / number2;
            System.out.printf("\nОтвет: " + result);
        }
        else {
            System.out.println("\nОшибка ввода");
        }
        scan.close();
    }
}