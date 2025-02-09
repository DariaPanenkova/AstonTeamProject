package SortDir.quickSorts;

import DataClasses.User;
import SortDir.QuickSort;
import SortDir.QuickSortStrategy;
import SortDir.comparators.UserComparator;

import java.util.Comparator;

public class QuickSortUser implements QuickSortStrategy<User> {
    @Override
    public User[] sort(User[] arr) {

        Comparator<User> comparator = new UserComparator();
        QuickSort<User> quickSort = new QuickSort<>(comparator);

        return quickSort.sort(arr);
    }
}
