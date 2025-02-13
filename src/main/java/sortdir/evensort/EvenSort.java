package sortdir.evensort;

import sortdir.quicksorts.QuickSort;

import java.util.Arrays;
import java.util.stream.IntStream;

public class EvenSort {
    public static <T> T[] sort(T[] arr, EvenSortStrategy<T> strategy) {
        T[] result = Arrays.copyOf(arr, arr.length);

        //запоминаем индексы четных элементов
        int[] evenIndex = IntStream.range(0, arr.length)
                .filter(i -> strategy.getNumberField(arr[i]) % 2 == 0)
                .toArray();
        //запоминаем четные элементы
        T[] evenElem = Arrays.stream(evenIndex)
                .mapToObj(i -> arr[i])
                .toArray(size -> (T[]) new Object[size]);

        QuickSort<T> quickSort = new QuickSort<>(strategy.getComparator());

        evenElem = quickSort.sort(evenElem);

        for (int i = 0; i < evenIndex.length; i++) {
            result[evenIndex[i]] = evenElem[i];
        }

        return result;
    }
}
