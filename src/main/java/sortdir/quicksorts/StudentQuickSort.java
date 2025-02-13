package sortdir.quicksorts;

import classes.Student;
import sortdir.comparators.StudentComparator;

import java.util.Comparator;

public class StudentQuickSort implements QuickSortStrategy<Student> {
    @Override
    public Student[] sort(Student[] arr) {

        Comparator<Student> comparator = new StudentComparator();
        QuickSort<Student> quickSort = new QuickSort<>(comparator);

        return quickSort.sort(arr);
    }
}
