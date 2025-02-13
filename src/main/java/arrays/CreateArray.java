package arrays;

import classes.Bus;
import classes.Student;
import classes.User;

public class CreateArray {

    public static Object[] createArray(int type, int size) {
        if (type == 0) {
            return null;
        }
        if (type == 1) {
            System.out.println("Массив автобусов размером " + size + " успешно создан");
            return new Bus[size];
        }
        if (type == 2) {
            System.out.println("Массив студентов размером " + size + " успешно создан");
            return new Student[size];
        }
        if (type == 3) {
            System.out.println("Массив пользователей размером " + size + " успешно создан");
            return new User[size];
        }
        System.out.println("Массив не создан");
        return null;
    }
}
