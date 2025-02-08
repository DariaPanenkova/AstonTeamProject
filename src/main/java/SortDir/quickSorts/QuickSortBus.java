package SortDir.quickSorts;

import DataClasses.Bus;
import SortDir.comparators.BusComparator;
import SortDir.QuickSort;
import SortDir.QuickSortStrategy;

import java.util.Comparator;

public class QuickSortBus implements QuickSortStrategy<Bus> {
    @Override
    public Bus[] sort(Bus[] arr) {

        Comparator<Bus> comparator = new BusComparator();
        QuickSort<Bus> quickSort = new QuickSort<>(comparator);

        quickSort.sort((Bus[])arr);


        return arr;
    }
}
