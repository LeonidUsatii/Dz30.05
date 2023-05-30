package services;
import models.People;
import repositories.UsersRepository;

import java.util.*;

public class UsersServiceImpl implements UsersService{
    private UsersRepository usersRepository;

    public UsersServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public List<People> create(int size) {
        Random random = new Random();
        List<People> people = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            people.add(new People("User" + i, random.nextInt(160, 220)));

        }
        return people;
    }

    @Override
    public People binarySearch(int size, int height) {
        int index;
        List<People> people = create(size);
        usersRepository.selectionSort(people);
        index = usersRepository.binarySearch(people, height);
        return people.get(index);
    }

    @Override
    public People binarySearchComparator(int size, int height) {
        int index;
        List<People> people = create(size);
        people.sort(new HeightComparator());
        index = usersRepository.binarySearch(people, height);
        return people.get(index);
    }


}
