package sortdir.evensort;

import classes.Bus;
import classes.Student;
import classes.User;

public class EvenSortData {
    public static<T> T[] sort(T[] array){
        if (array instanceof Bus[]) {
            return (T[]) EvenSort.sort((Bus[]) array,  new BusEvenSortStrategy());
        } else if (array instanceof Student[]){
            return (T[]) EvenSort.sort((Student[]) array,  new StudentEvenSortStrategy());
        }
        else if (array instanceof User[]){
            return (T[]) EvenSort.sort((User[]) array,  new UserEvenSortStrategy());
        }

        return array;
    }
}
