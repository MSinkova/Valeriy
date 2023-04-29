import java.util.ArrayList;
import java.util.LinkedList;

public class SpeedElements {
    public static void main(String[] args) {
       /*
       Задача: Написать код с замером скорости для 100_000 элеметов с использованием ArrayList и LinkedList
       сравнить результаты.
       Если отличий нет, увеличивать количество элементов х2.
       Что сравнить:
       - Всавка элементов в середину
       - Добавление элемента
       - Удаление элемента
       - Присваевание элемента
       - Получение элемента
       Входные данные:
       - Массив 100000 элементов
       - Коллекция 100000 элементов
       Выходные данные:
       -вставка
       -добавление
       -удаление
       -присвоение
       -получение
        */
        int count;
        ArrayList<String> speedArrayList = new ArrayList<String>(100000);
        LinkedList<String> speedLinkedList = new LinkedList<String>();
        long t1 = System.currentTimeMillis();

        //Добавление элемента в конец списка
        for(count = 0; count < 100000; count++) {
            speedArrayList.add("Добавление элемента" + count);
        }
        long t2 = System.currentTimeMillis();
        System.out.println("array add " + count + "：" + (t2 - t1));

        for(count = 0; count < 100000; count++) {
            speedLinkedList.add("Добавление элемента" + count);
        }
        long t3 = System.currentTimeMillis();
        System.out.println("linked add " + count + "：" + (t3 - t2));
        if(t2 - t1 > t3 - t2) {
            System.out.println("LinkedList is faster");
        } else {
            System.out.println("ArrayList is faster");
        }
        System.out.println();

        //Вставка элемента по индексу
        for(count = 0; count < 100000; count++) {
            speedArrayList.add(count,"вставили элемент по индексу: " + count);
        }
        long t4 = System.currentTimeMillis();
        System.out.println("array add index " + count + "：" + (t4 - t3));

        for(count = 0; count < 100000; count++) {
            speedLinkedList.add(count,"вставили элемент по индексу: " + count);
        }
        long t5 = System.currentTimeMillis();
        System.out.println("linked add index " + count + "：" + (t5 - t4));
        if(t4 - t3 > t5 - t4) {
            System.out.println("LinkedList is faster");
        } else {
            System.out.println("ArrayList is faster");
        }
        System.out.println();

        //Удаление элемента
        for (count = 0; count < 100000; count++) {
            speedArrayList.remove(count);
        }
        long t6 = System.currentTimeMillis();
        System.out.println("array remove " + count + "：" + (t6 - t5));

        for (count = 0; count < 100000; count++) {
            speedLinkedList.remove(count);
        }
        long t7 = System.currentTimeMillis();
        System.out.println("linked remove " + count + "：" + (t7 - t6));
        if(t6 - t5 > t7 - t6) {
            System.out.println("LinkedList is faster");
        } else {
            System.out.println("ArrayList is faster");
        }
        System.out.println();

        //Присвоение элемента
        for (count = 0; count < 100000; count++) {
            speedArrayList.set(count, "вставили элемент по индексу: " + count);
        }
        long t8 = System.currentTimeMillis();
        System.out.println("array set " + count + "：" + (t8 - t7));

        for (count = 0; count < 100000; count++) {
            speedLinkedList.set(count, "вставили элемент по индексу: " + count);
        }
        long t9 = System.currentTimeMillis();
        System.out.println("linked set " + count + "：" + (t9 - t8));
        if(t8 - t7 > t9 - t8) {
            System.out.println("LinkedList is faster");
        } else {
            System.out.println("ArrayList is faster");
        }
        System.out.println();

        //Получение элемента
        for (count = 0; count < 100000; count++) {
            speedArrayList.get(count);
        }
        long t10 = System.currentTimeMillis();
        System.out.println("array get " + count + "：" + (t10 - t9));

        for (count = 0; count < 100000; count++) {
            speedLinkedList.get(count);
        }
        long t11 = System.currentTimeMillis();
        System.out.println("linked get " + count + "：" + (t11 - t10));
        if(t10 - t9 > t11 - t10) {
            System.out.println("LinkedList is faster");
        } else {
            System.out.println("ArrayList is faster");
        }
    }
}
