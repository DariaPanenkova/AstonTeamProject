package client;

import arrays.Manual;
import binarysearch.DataBinarySearch;
import dataclasses.Bus;
import dataclasses.Student;
import dataclasses.User;

import java.util.Scanner;

public class BinarySearchLoop<T> {

    public int search(T[] array) {
        Scanner console = new Scanner(System.in);

        if (array instanceof Bus[]) {
            Bus key = Manual.manualCreateBus();
            return DataBinarySearch.binarySearch(array, key);
        }

        if (array instanceof Student[]) {
            Student key = Manual.manualCreateStudent();
            return DataBinarySearch.binarySearch(array, key);
        }

        if (array instanceof User[]) {
            User key = Manual.manualCreateUser();
            return DataBinarySearch.binarySearch(array, key);
        }

        return -10;
    }
}
