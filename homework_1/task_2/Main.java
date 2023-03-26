// Вычислить n! (произведение чисел от 1 до n).

package Java.homework_1.task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет! Эта программа вычисляет факториал n.\n");

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число n: ");
        int n = scan.nextInt();
        int geometricProgression = 1;
        
        for(int i = 2; i <= n; i++) {
            geometricProgression *= i;
        }
System.out.printf("\nСумма геометрической прогрессии: " + geometricProgression);

scan.close();
    }
}