// Вычислить n-ое треугольного число (сумма чисел от 1 до n).

package Java.homework_1.task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет! Эта программа вычисляет n-ое треугольное число.\n");

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число n: ");
        int n = scan.nextInt();
        int arithmeticProgression = 1;

        for(int i = 2; i <= n; i++) {
            arithmeticProgression += i;
        }
System.out.print("\nСумма арифметической прогрессии: " + arithmeticProgression);

scan.close();
    }
}