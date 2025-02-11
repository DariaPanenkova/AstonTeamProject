package sortdir.evensort;

import java.util.Comparator;

public interface EvenSortStrategy<T> {
    Comparator<T> getComparator();

    int getNumberField(Object obj);
}
