package com.myzoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        // Додавання тварин до списку
        animals.add("Лев");
        animals.add("Зебра");
        animals.add("Слон");
        animals.add("Тигр");
        animals.add("Гепард");
        animals.add("Жираф");
        animals.add("Мавпа");
        animals.add("Крокодил");

        // Виведення списку тварин у консоль
        System.out.println("Список тварин у зоопарку:");
        for (String animal : animals) {
            System.out.println(animal);
        }

        // Видалення тварин 3, 5, 7 (індекси 2, 4, 6)
        animals.remove(6);
        animals.remove(4);
        animals.remove(2);

        // Дізнатися розмір списку
        int size = animals.size();

        System.out.println("\nСписок тварин після видалення:");
        for (String animal : animals) {
            System.out.println(animal);
        }

        System.out.println("\nРозмір списку: " + size);
    }
}
