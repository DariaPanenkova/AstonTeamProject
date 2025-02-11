package sortdir.quicksorts;

import classes.Bus;
import sortdir.QuickSort;
import sortdir.QuickSortStrategy;
import sortdir.comparators.BusComparator;

import java.util.Arrays;
import java.util.Comparator;

public class BusSortEvenNum implements QuickSortStrategy<Bus> {
    @Override
    public Bus[] sort(Bus[] arr) {
        Bus[] result = Arrays.copyOf(arr, arr.length);

        Comparator<Bus> comparator = Comparator.comparingInt(Bus::getNum);
        QuickSort<Bus> quickSort = new QuickSort<>(comparator);

        int[] evenIndices = new int[arr.length];
        int evenCount = 0;

        //запоминаем индексы четных элементов
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getNum() % 2 == 0) {
                evenIndices[evenCount] = i;
                evenCount++;
            }
        }

        Bus[] evenBuses = new Bus[evenCount];
        for (int i = 0; i < evenCount; i++) {
            evenBuses[i] = arr[evenIndices[i]];
        }

        evenBuses = quickSort.sort(evenBuses);


        for (int i = 0; i < evenCount; i++) {
            result[evenIndices[i]] = evenBuses[i];
        }

        return result;
    }
}
