package repositories;

import models.People;

import java.util.List;

public interface UsersRepository {
    void selectionSort(List<People> array);
    int binarySearch(List<People> array, int height);

}
