package sortdir.quicksorts;

import classes.Bus;
import sortdir.comparators.BusComparator;

import java.util.Comparator;

public class BusQuickSort implements QuickSortStrategy<Bus> {
    @Override
    public Bus[] sort(Bus[] arr) {

        Comparator<Bus> comparator = new BusComparator();
        QuickSort<Bus> quickSort = new QuickSort<>(comparator);

        return quickSort.sort(arr);
    }
}
