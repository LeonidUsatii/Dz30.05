package models;

import java.util.Comparator;

public class People implements Comparable<People> {
    private String name;
    private int height;

    public People(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }


    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }



    @Override
    public int compareTo(People o) {
        if (o.getHeight()> this.getHeight()) {
            return 1;
        } else if (o.getHeight()< this.getHeight()) {
            return -1;
        }
      return 0;
    }
}
