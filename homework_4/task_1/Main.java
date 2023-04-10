// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.

package Java.homework_4.task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(reversArray(linList));
    }

    public static ArrayList<Integer> reversArray(LinkedList<Integer> list) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            array.add((Integer) list.get(i));
        }
        return array;
    }
}