// Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка).

package Java.homework_1.task_3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет! Эта программа выводит все простые числа от 1 до 1000.\n");

        int count = 0;
        
        for(int i = 1; i < 1000; i++) {
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    count++;
                }
            }
            if(count == 2) {
                System.out.printf(i + " ");
            }
            count = 0;
        }
    }
}