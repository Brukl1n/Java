// Пусть дан произвольный список целых чисел, удалить из него чётные числа

package Java.homework_3.task_1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10));
        }
        System.out.println("Произвольный список чисел: " + list);
        
        for (int i = list.size()-1; i >= 0; i--) {
                if (list.get(i)%2 == 0) {
                list.remove(i);
            }
        }
        System.out.println("Cписок c удаленными четными числами: " + list);
    }
}