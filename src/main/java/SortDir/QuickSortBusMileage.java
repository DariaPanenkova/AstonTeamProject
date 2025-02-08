package SortDir;

import java.util.Arrays;
import java.util.Comparator;

public class QuickSortBusMileage implements QuickSortBusStrategy {
    @Override
    public void sort(Bus[] buses) {
        Comparator<Bus> comparator = Comparator.comparingInt(Bus::getMileage);
        QuickSort<Bus> quickSort = new QuickSort<>(comparator);

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(buses));

        quickSort.sort(buses);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(buses));
    }
}
