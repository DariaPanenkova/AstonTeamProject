package sortdir.evensort;

import classes.User;

import java.util.Comparator;

public class UserEvenSortStrategy implements EvenSortStrategy<User> {
    @Override
    public Comparator<User> getComparator() {
        return Comparator.comparingInt(user -> user.getPassword().length());
    }

    @Override
    public int getNumberField(Object obj) {
        if (obj instanceof User) {
            return ((User) obj).getPassword().length();
        } else {
            throw new IllegalArgumentException("Объект не является User");
        }
    }
}
