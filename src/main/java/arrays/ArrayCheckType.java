package arrays;

import dataclasses.Bus;
import dataclasses.Student;
import dataclasses.User;

public class ArrayCheckType {
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
