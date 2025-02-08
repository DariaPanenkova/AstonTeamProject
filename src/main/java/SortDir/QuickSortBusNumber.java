package SortDir;

import DataClasses.Bus;

import java.util.Arrays;
import java.util.Comparator;

public class QuickSortBusNumber implements QuickSortBusStrategy {
    @Override
    public void sort(Bus[] buses) {
        Comparator<Bus> comparator = Comparator.comparingInt(Bus::getNum);
        QuickSort<Bus> quickSort = new QuickSort<>(comparator);

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(buses));

        quickSort.sort(buses);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(buses));
    }
}
