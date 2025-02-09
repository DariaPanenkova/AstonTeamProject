package SortDir;

import java.util.Comparator;

public class QuickSort<T> {

    private Comparator<T> comparator;

    public QuickSort(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public T[] sort(T[] array) {
        quickSort(array, 0, array.length-1);
        return array;
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
    /*public static void main(String[] args) {
        Bus[] buses = {new Bus.BusBuilder().setNum(3).setModel("A").setMileage(1000).build(),
                new Bus.BusBuilder().setNum(4).setModel("D").setMileage(1200).build(),
                new Bus.BusBuilder().setNum(2).setModel("C").setMileage(800).build(),
                new Bus.BusBuilder().setNum(1).setModel("B").setMileage(900).build()};

        Comparator<Bus> comparator = Comparator.comparingInt(Bus::getMileage);
        QuickSort<Bus> quickSort = new QuickSort<>(comparator);

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(buses));

        quickSort.sort(buses);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(buses));
        QuickSortBusNumber quickSortBusNumber = new QuickSortBusNumber();
        quickSortBusNumber.sort(buses);
    }*/
}
