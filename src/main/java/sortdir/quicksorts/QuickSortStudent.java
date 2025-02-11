package sortdir.quicksorts;

import classes.Student;
import sortdir.comparators.StudentComparator;
import sortdir.QuickSort;
import sortdir.QuickSortStrategy;

import java.util.Comparator;

public class QuickSortStudent implements QuickSortStrategy<Student> {
    @Override
    public Student[] sort(Student[] arr) {

        Comparator<Student> comparator = new StudentComparator();
        QuickSort<Student> quickSort = new QuickSort<>(comparator);

        return quickSort.sort(arr);
    }
}
