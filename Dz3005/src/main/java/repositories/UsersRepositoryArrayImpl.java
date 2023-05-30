package repositories;

import models.People;

import java.util.List;

public class UsersRepositoryArrayImpl implements UsersRepository {
    private List<People> people;

    public UsersRepositoryArrayImpl() {
    }

    @Override
    public void selectionSort(List<People> array) {

        People currentMin;
        int indexOfCurrentMin;
        People temp;

        for (int i = 0; i < array.size(); i++) {
            currentMin = array.get(i);
            indexOfCurrentMin = i;

            for (int j = i + 1; j < array.size(); j++) {

                if (array.get(j).getHeight() < currentMin.getHeight()) {
                    currentMin = array.get(j);
                    indexOfCurrentMin = j;
                }
            }

            temp = array.get(i);
            People a = array.get(i);
            People b = array.get(indexOfCurrentMin);
            a = b;
            b = temp;

        }

    }

    @Override
    public int binarySearch(List<People> array, int height) {
        int counter = 0;
        int left = 0;
        int right = array.size() - 1;
        int middle = left + (right - left) / 2;

        while (left <= right) {
            counter++;
            if (height < array.get(middle).getHeight()) {
                right = middle - 1;
            } else if (height > array.get(middle).getHeight()) {
                left = middle + 1;
            } else {
                break;
            }
            middle = left + (right - left) / 2;
        }
        System.out.println("В binarySearch было сделано " + counter + " сравнений");
        return middle;
    }
}

    
