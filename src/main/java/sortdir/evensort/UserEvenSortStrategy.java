package sortdir.evensort;

import classes.Bus;
import classes.User;

import java.util.Comparator;

public class UserEvenSortStrategy implements EvenSortStrategy{
    @Override
    public Comparator<User> getComparator() {
        Comparator<User> comparator = Comparator.comparingInt(user -> user.getPassword().length());
        return comparator;
    }

    @Override
    public int getNumberField(Object obj) {
        if (obj instanceof User) {
            return ((User) obj).getPassword().length();
        }
        else {
            throw new IllegalArgumentException("Объект не является User");
        }
    }
}
