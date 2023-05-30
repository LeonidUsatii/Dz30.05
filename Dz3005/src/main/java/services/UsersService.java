package services;

import models.People;

import java.util.ArrayList;
import java.util.List;

public interface UsersService {
    List<People> create(int size);
    People binarySearch(int size, int height);
    public People binarySearchComparator(int size, int height);
}
