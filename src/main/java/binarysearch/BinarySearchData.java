package binarysearch;

import classes.Bus;
import classes.Student;
import classes.User;
import sortdir.comparators.BusComparator;
import sortdir.comparators.StudentComparator;
import sortdir.comparators.UserComparator;

public class BinarySearchData {
    public static <T> int binarySearch(T[] array, T key) {
        int index = -1;
        if (array instanceof Bus[]) {
            index = BinarySearch.binarySearch((Bus[]) array, (Bus) key, new BusComparator());
        } else if (array instanceof Student[])
            index = BinarySearch.binarySearch((Student[]) array, (Student) key, new StudentComparator());
        else if (array instanceof User[])
            index = BinarySearch.binarySearch((User[]) array, (User) key, new UserComparator());
        if (index != -1) {
            System.out.println("Элемент " + key + " найден на индексе: " + index);
        } else {
            System.out.println("Элемент " + key + " не найден.");
        }
        return index;

    }
}
