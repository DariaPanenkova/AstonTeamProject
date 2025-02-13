package sortdir.quicksorts;

import dataclasses.User;
import sortdir.comparators.UserComparator;

import java.util.Comparator;

public class UserQuickSort implements QuickSortStrategy<User> {
    @Override
    public User[] sort(User[] arr) {

        Comparator<User> comparator = new UserComparator();
        QuickSort<User> quickSort = new QuickSort<>(comparator);

        return quickSort.sort(arr);
    }
}
