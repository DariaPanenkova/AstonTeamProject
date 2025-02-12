package arrays;

import classes.Bus;
import classes.Student;
import classes.User;

public class ArrayCheck {
    public static boolean isBusArray(Object[] array) {
        return array.getClass() == Bus[].class;
    }

    public static boolean isUsersArray(Object[] array) {
        return array.getClass() == User[].class;
    }

    public static boolean isStudentsArray(Object[] array) {
            return array.getClass() == Student[].class;
    }
}
