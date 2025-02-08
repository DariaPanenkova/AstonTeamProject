package SortDir.QuickSorts;

import DataClasses.Bus;
import SortDir.Comparators.BusComparator;
import SortDir.QuickSort;
import SortDir.QuickSortStrategy;

import java.util.Comparator;

public class QuickSortBus implements QuickSortStrategy {
    @Override
    public Object[] sort(Object[] arr) {

        Comparator<Bus> comparator = new BusComparator();
        QuickSort<Bus> quickSort = new QuickSort<>(comparator);

        quickSort.sort((Bus[])arr);


        return arr;
    }
}
