// Реализуйте очередь с помощью LinkedList со следующими методами:
// - enqueue() — помещает элемент в конец очереди,
// - dequeue() — возвращает первый элемент из очереди и удаляет его,
// - first() — возвращает первый элемент из очереди, не удаляя.

package Java.homework_4.task_2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Поместить элемент в конец очереди");
            System.out.println("2. Вернуть первый элемент из очереди и удалить его");
            System.out.println("3. Вернуть первый элемент из очереди не удаляя его");
            System.out.println("4. Выход\n");
            System.out.println("Выберите действие: ");
            int key = sc.nextInt();
            switch (key) {
                case 1:
                    System.out.println("Введите число: ");
                    int num = sc.nextInt();
                    enqueue(linList, num);
                    break;
                case 2:
                    if (!linList.isEmpty()) {
                        dequeue(linList);
                    } else {
                        System.out.println("\nОчередь пуста");
                    }
                    break;
                case 3:
                    if (!linList.isEmpty()) {
                        first(linList);
                    } else {
                        System.out.println("\nОчередь пуста");
                    }
                    break;
                case 4:
                    sc.close();
                    System.out.println(linList);
                    return;
            }
        }
    }

    public static void enqueue(LinkedList<Integer> list, int elem) {
        list.add(elem);
    }

    public static void dequeue(LinkedList<Integer> list) {
        System.out.println("\n" + list.removeFirst());
    }

    public static void first(LinkedList<Integer> list) {
        System.out.println("\n" + list.getFirst());
    }
}
