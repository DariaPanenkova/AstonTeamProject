package binarysearch;

import java.util.Comparator;

public class BinarySearch {

    // Метод бинарного поиска
    public static <T> int binarySearch(T[] array, T key, Comparator<? super T> comparator) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int comparisonResult = comparator.compare(array[mid], key);

            // Проверяем, найден ли элемент
            if (comparisonResult == 0) {
                return mid; // Элемент найден
            }

            // Если элемент больше, то игнорируем левую половину
            if (comparisonResult < 0) {
                left = mid + 1;
            } else { // Если элемент меньше, то игнорируем правую половину
                right = mid - 1;
            }
        }

        return -1; // Элемент не найден
    }

    public static void main(String[] args) {
        // Пример использования
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer key = 5;

        // Сравнитель для Integer
        Comparator<Integer> comparator = Integer::compareTo;

        int index = binarySearch(numbers, key, comparator);

        if (index != -1) {
            System.out.println("Элемент " + key + " найден на индексе: " + index);
        } else {
            System.out.println("Элемент " + key + " не найден.");
        }
    }
}