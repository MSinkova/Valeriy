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
        testAddArrayList();
        testAddLinkedList();
        testAddIndexArrayList();
        testAddIndexLinkedList();
        testSetArrayList();
        testSetLinkedList();
        testGetArrayList();
        testGetLinkedList();
        testRemoveArrayList();
        testRemoveLinkedList();
    }

    public static void testAddArrayList() {
        ArrayList<String> objectArrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for(int count = 0; count < 100000; count++) {
            objectArrayList.add("Заполнен элемент "+ count);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Тест на проверку работы метода add ArraytList с размером = 100000, время выполнения: " + (endTime - startTime));
    }

    public static void testAddLinkedList() {
        LinkedList<String> objectLinkedList = new LinkedList<>();
        long startTime = System.currentTimeMillis();
        for(int count = 0; count < 100000; count++) {
            objectLinkedList.add("Заполнен элемент "+ count);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Тест на проверку работы метода add LinkedList с размером = 100000, время выполнения: " + (endTime - startTime));
    }

    public static void testAddIndexArrayList() {
        ArrayList<String> objectArrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for(int count = 0; count < 100000; count++) {
            objectArrayList.add(count, "Заполнен элемент "+ count);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Тест на проверку работы метода add по index ArraytList с размером = 100000, время выполнения: " + (endTime - startTime));
    }

    public static void testAddIndexLinkedList() {
        LinkedList<String> objectLinkedList = new LinkedList<>();
        long startTime = System.currentTimeMillis();
        for(int count = 0; count < 100000; count++) {
            objectLinkedList.add(count,"Заполнен элемент "+ count);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Тест на проверку работы метода add по index LinkedList с размером = 100000, время выполнения: " + (endTime - startTime));
    }

    public static void testSetArrayList() {
        ArrayList<String> objectArrayList = new ArrayList<>();
        for(int count = 0; count < 100000; count++) {
            objectArrayList.add("Заполнен элемент "+ count);
        }
        long startTime = System.currentTimeMillis();
        for(int count = 0; count < 100000; count++) {
            objectArrayList.set(count, "ArrayList " + count);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Тест на проверку работы метода set ArrayList с размером = 100000, время выполнения: " + (endTime - startTime));
    }

    public static void testSetLinkedList() {
        LinkedList<String> objectLinkedList = new LinkedList<>();
        for(int count = 0; count < 100000; count++) {
            objectLinkedList.add("Заполнен элемент "+ count);
        }
        long startTime = System.currentTimeMillis();
        for(int count = 0; count < 100000; count++) {
            objectLinkedList.set(count, " - элемент вставлен в список");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Тест на проверку работы метода set LinkedList с размером = 100000, время выполнения: " + (endTime - startTime));
    }

    public static void testGetArrayList() {
        ArrayList<String> objectArrayList = new ArrayList<>();
        for(int count = 0; count < 100000; count++) {
            objectArrayList.add("Заполнен элемент "+ count);
        }
        long startTime = System.currentTimeMillis();
        for(int count = 0; count < 100000; count++) {
            objectArrayList.get(count);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Тест на проверку работы метода get ArrayList с размером = 100000, время выполнения: " + (endTime - startTime));
    }

    public static void testGetLinkedList() {
        LinkedList<String> objectLinkedList = new LinkedList<>();
        for(int count = 0; count < 100000; count++) {
            objectLinkedList.add("Заполнен элемент "+ count);
        }
        long startTime = System.currentTimeMillis();
        for(int count = 0; count < 100000; count++) {
            objectLinkedList.get(count);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Тест на проверку работы метода get LinkedList с размером = 100000, время выполнения: " + (endTime - startTime));
    }

    public static void testRemoveArrayList() {
        ArrayList<String> objectArrayList = new ArrayList<>();
        for(int count = 0; count < 100000; count++) {
            objectArrayList.add("Заполнен элемент "+ count);
        }
        long startTime = System.currentTimeMillis();
        for(int count = 0; count < 50000; count++) {
            objectArrayList.remove(count);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Тест на проверку работы метода remove ArrayList с размером = 100000, время выполнения: " + (endTime - startTime));
    }

    public static void testRemoveLinkedList() {
        LinkedList<String> objectLinkedList = new LinkedList<>();
        for(int count = 0; count < 100000; count++) {
            objectLinkedList.add("Заполнен элемент "+ count);
        }
        long startTime = System.currentTimeMillis();
        for(int count = 0; count < 50000; count++) {
            objectLinkedList.remove(count);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Тест на проверку работы метода remove LinkedList с размером = 100000, время выполнения: " + (endTime - startTime));
    }
}
