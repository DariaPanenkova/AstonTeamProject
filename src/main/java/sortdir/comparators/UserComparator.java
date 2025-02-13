package sortdir.comparators;

import dataclasses.User;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        Comparator<String> nullSafeStringComparator = Comparator
                .nullsFirst(String::compareTo);
        Comparator<User> comparator = Comparator
                .comparing(User::getName, nullSafeStringComparator)
                .thenComparing(User::getPassword, nullSafeStringComparator)
                .thenComparing(User::getMail, nullSafeStringComparator);

        return comparator.compare(o1, o2);

    }
}
