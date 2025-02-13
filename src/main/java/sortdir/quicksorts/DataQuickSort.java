package sortdir.quicksorts;

import dataclasses.Bus;
import dataclasses.Student;
import dataclasses.User;

public class DataQuickSort<T> {

    public static <T> T[] sort(T[] arr) {
        if (arr instanceof Bus[]) {
            return (T[]) (new BusQuickSort()).sort((Bus[]) arr);
        } else if (arr instanceof Student[]) {
            return (T[]) (new StudentQuickSort()).sort((Student[]) arr);
        } else if (arr instanceof User[]) {
            return (T[]) (new UserQuickSort()).sort((User[]) arr);
        }
        return arr;

    }
}
