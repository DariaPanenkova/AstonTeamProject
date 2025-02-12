package sortdir.quicksorts;

import classes.Bus;
import classes.Student;
import classes.User;
import sortdir.QuickSort;
import sortdir.QuickSortStrategy;
import sortdir.comparators.BusComparator;
import sortdir.comparators.StudentComparator;
import sortdir.comparators.UserComparator;

import java.util.Comparator;

public class QuickSortData<T> implements QuickSortStrategy<T> {
    @Override
    public T[] sort(T[] arr) {
        if (arr instanceof Bus[]) {
            Comparator<Bus> comparator = new BusComparator();
            QuickSort<Bus> quickSort = new QuickSort<>(comparator);
            return (T[]) quickSort.sort((Bus[]) arr);
        } else if (arr instanceof Student[]) {
            Comparator<Student> comparator = new StudentComparator();
            QuickSort<Student> quickSort = new QuickSort<>(comparator);
            return (T[]) quickSort.sort((Student[]) arr);
        } else if (arr instanceof User[]) {
            Comparator<User> comparator = new UserComparator();
            QuickSort<User> quickSort = new QuickSort<>(comparator);
            return (T[]) quickSort.sort((User[]) arr);
        }
        return arr;

    }
}
