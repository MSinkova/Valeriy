import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class SpeedElements {
    //public static void main(String[] args) {
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

    @Test
    void testAddArrayList() {
        int s = 100000;
        ArrayList<String> objectArrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < s; i++) {
            objectArrayList.add("Заполнен элемент "+ i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Тест на проверку работы метода add ArraytList с размером = 100000, время выполнения: " + (endTime - startTime));
    }

    @Test
    void testAddLinkedList() {
        int s = 100000;
        LinkedList<String> objectLinkedList = new LinkedList<>();
        long startTime = System.currentTimeMillis();
        for(int count = 0; count < s; count++) {
            objectLinkedList.add("Заполнен элемент "+ count);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Тест на проверку работы метода add LinkedList с размером = 100000, время выполнения: " + (endTime - startTime));
    }

    @Test
    void testAddIndexArrayList() {
        int s = 100000;
        ArrayList<String> objectArrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for(int count = 0; count < s; count++) {
            objectArrayList.add(count, "Заполнен элемент "+ count);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Тест на проверку работы метода add по index ArraytList с размером = 100000, время выполнения: " + (endTime - startTime));
    }

    @Test
    void testAddIndexLinkedList() {
        int s = 100000;
        LinkedList<String> objectLinkedList = new LinkedList<>();
        long startTime = System.currentTimeMillis();
        for(int count = 0; count < s; count++) {
            objectLinkedList.add(count,"Заполнен элемент "+ count);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Тест на проверку работы метода add по index LinkedList с размером = 100000, время выполнения: " + (endTime - startTime));
    }

    @Test
    void testSetArrayList() {
        int s = 100000;
        ArrayList<String> objectArrayList = new ArrayList<>();
        for(int count = 0; count < s; count++) {
            objectArrayList.add("Заполнен элемент "+ count);
        }
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < s; i++) {
            objectArrayList.set(i, "ArrayList " + i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Тест на проверку работы метода set ArrayList с размером = 100000, время выполнения: " + (endTime - startTime));
    }

    @Test
    void testSetLinkedList() {
        int s = 100000;
        LinkedList<String> objectLinkedList = new LinkedList<>();
        for(int i = 0; i < s; i++) {
            objectLinkedList.add("Заполнен элемент "+ i);
        }
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < s; i++) {
            objectLinkedList.set(i, " - элемент вставлен в список");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Тест на проверку работы метода set LinkedList с размером = 100000, время выполнения: " + (endTime - startTime));
    }

    @Test
    void testGetArrayList() {
        int s = 100000;
        ArrayList<String> objectArrayList = new ArrayList<>();
        for(int i = 0; i < s; i++) {
            objectArrayList.add("Заполнен элемент "+ i);
        }
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < s; i++) {
            objectArrayList.get(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Тест на проверку работы метода get ArrayList с размером = 100000, время выполнения: " + (endTime - startTime));
    }

    @Test
    void testGetLinkedList() {
        int s = 100000;
        LinkedList<String> objectLinkedList = new LinkedList<>();
        for(int i = 0; i < s; i++) {
            objectLinkedList.add("Заполнен элемент "+ i);
        }
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < s; i++) {
            objectLinkedList.get(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Тест на проверку работы метода get LinkedList с размером = 100000, время выполнения: " + (endTime - startTime));
    }

    @Test
    void testRemoveArrayList() {
        int s = 100000;
        ArrayList<String> objectArrayList = new ArrayList<>();
        for(int i = 0; i < s; i++) {
            objectArrayList.add("Заполнен элемент "+ i);
        }
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < s; i--) {
            objectArrayList.remove(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Тест на проверку работы метода remove ArrayList с размером = 100000, время выполнения: " + (endTime - startTime));
    }

    @Test
    void testRemoveLinkedList() {
        int s = 100000;
        LinkedList<String> objectLinkedList = new LinkedList<>();
        for(int i = 0; i < s; i++) {
            objectLinkedList.add("Заполнен элемент "+ i);
        }
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < s; i--) {
            objectLinkedList.remove(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Тест на проверку работы метода remove LinkedList с размером = 100000, время выполнения: " + (endTime - startTime));
    }
}
