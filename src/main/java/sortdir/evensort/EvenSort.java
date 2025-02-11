package sortdir.evensort;

import classes.Bus;
import sortdir.QuickSort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class EvenSort {
    public static Object[] sort(Object[] arr, EvenSortStrategy strategy) {
        Object[]  result = Arrays.copyOf(arr, arr.length);

        //запоминаем индексы четных элементов
        int[] evenIndex = IntStream.range(0, arr.length)
                            .filter(i -> strategy.getNumberField(arr[i]) % 2 == 0)
                            .toArray();
        //запоминаем четные элементы
        Object[] evenElem = Arrays.stream(evenIndex)
                .mapToObj(i -> arr[i])
                .toArray();

        QuickSort<Object> quickSort = new QuickSort<>(strategy.getComparator());

        evenElem = quickSort.sort(evenElem);


        for (int i = 0; i < evenIndex.length; i++) {
            result[evenIndex[i]] = evenElem[i];
        }

        return result;
    }
}
