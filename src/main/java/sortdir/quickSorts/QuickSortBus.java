package sortdir.quickSorts;

import classes.Bus;
import sortdir.comparators.BusComparator;
import sortdir.QuickSort;
import sortdir.QuickSortStrategy;

import java.util.Comparator;

public class QuickSortBus implements QuickSortStrategy<Bus> {
    @Override
    public Bus[] sort(Bus[] arr) {

        Comparator<Bus> comparator = new BusComparator();
        QuickSort<Bus> quickSort = new QuickSort<>(comparator);

        return quickSort.sort(arr);
    }
}
