package services;

import models.People;

import java.util.Comparator;

public class HeightComparator implements Comparator<People> {
    @Override
    public int compare(People o1, People o2) {
        return Integer.compare(o1.getHeight(), o2.getHeight());
    }
}
