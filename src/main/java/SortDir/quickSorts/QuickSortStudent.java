package SortDir.quickSorts;

import DataClasses.Student;
import SortDir.comparators.SrudentComparator;
import SortDir.QuickSort;
import SortDir.QuickSortStrategy;

import java.util.Comparator;

public class QuickSortStudent implements QuickSortStrategy<Student> {
    @Override
    public Student[] sort(Student[] arr) {

        Comparator<Student> comparator = new SrudentComparator();
        QuickSort<Student> quickSort = new QuickSort<>(comparator);

        return quickSort.sort(arr);
    }
}
