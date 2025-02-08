package SortDir.QuickSorts;

import DataClasses.Student;
import SortDir.Comparators.SrudentComparator;
import SortDir.QuickSort;
import SortDir.QuickSortStrategy;

import java.util.Comparator;

public class QuickSortStudent implements QuickSortStrategy {
    @Override
    public Object[] sort(Object[] arr) {
        Comparator<Student> comparator = new SrudentComparator();
        QuickSort<Student> quickSort = new QuickSort<>(comparator);

        quickSort.sort((Student[])arr);


        return new Object[0];
    }
}
