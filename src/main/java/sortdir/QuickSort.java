package sortdir;

import java.util.Arrays;
import java.util.Comparator;

public class QuickSort<T> {

    private Comparator<T> comparator;

    public QuickSort(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public T[] sort(T[] array) {
        T[] copy = Arrays.copyOf(array, array.length);
        quickSort(copy, 0, copy.length-1);
        return copy;
    }

    private void quickSort(T[] array, int low, int high) {
        if(low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex-1);
            quickSort(array, pivotIndex+1, high);
        }
    }

    private  int partition(T[] array, int low, int high) {
        T pivot = array[high];
        int i = (low-1);
        for(int j = low; j < high; j++) {
            if(comparator.compare(array[j],pivot) <= 0) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i+1, high);
        return i+1;
    }

    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
