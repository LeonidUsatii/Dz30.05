package main.java.app;

import models.People;
import repositories.UsersRepository;
import repositories.UsersRepositoryArrayImpl;
import services.UsersService;
import services.UsersServiceImpl;

import java.util.Scanner;

/*
Необходимо создать массив из 1000 людей (каждый человек это имя и рост).
Необходимо изменить методы selectionSort и binarySearch таким образом,
чтобы они работали с массивом людей (поиск и сортировка по росту)
Используйте comparable/comparator
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UsersRepository usersRepository = (UsersRepository) new UsersRepositoryArrayImpl();
        UsersService usersService = (UsersService) new UsersServiceImpl(usersRepository);

        long before, after;

        System.out.println("Сортировка и поиск по росту");
        System.out.println("Введите искомый рост");

        int height = scanner.nextInt();
        scanner.nextLine();

        before = System.currentTimeMillis();

        People people = usersService.binarySearch(1000, height);
        System.out.println(people + " - " + people.getHeight());

        after = System.currentTimeMillis();

        System.out.println("Поиск занял - " + ((after - before) / 1000.0));

        System.out.println("Сортировка и поиск по росту с использованием comparator");
        System.out.println("Введите искомый рост");

        before = System.currentTimeMillis();

        people = usersService.binarySearchComparator(1000, height);
        System.out.println(people + " - " + people.getHeight());

        after = System.currentTimeMillis();

        System.out.println("Поиск занял - " + ((after - before) / 1000.0));

        System.out.println("Comparator быстрей.)");

    }
}
