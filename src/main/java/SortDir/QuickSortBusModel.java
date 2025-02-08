package SortDir;

import DataClasses.Bus;

import java.util.Arrays;
import java.util.Comparator;

public class QuickSortBusModel implements QuickSortBusStrategy {
    @Override
    public void sort(Bus[] buses) {
        Comparator<Bus> comparator = Comparator.comparing(Bus::getModel);
        QuickSort<Bus> quickSort = new QuickSort<>(comparator);

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(buses));

        quickSort.sort(buses);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(buses));
    }
}
