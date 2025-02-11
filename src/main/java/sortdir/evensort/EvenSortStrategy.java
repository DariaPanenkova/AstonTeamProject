package sortdir.evensort;

import java.util.Comparator;

public interface EvenSortStrategy<T> {
    Comparator<Object> getComparator();

    int getNumberField(Object obj);
}
