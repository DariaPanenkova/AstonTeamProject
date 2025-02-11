package sortdir.evensort;

import classes.Bus;

import java.util.Comparator;

public class BusEvenSortStrategy implements EvenSortStrategy{
    @Override
    public Comparator getComparator() {
        Comparator<Bus> comparator = Comparator.comparingInt(Bus::getNum);
        return comparator;
    }

    @Override
    public int getNumberField(Object obj) {
        if (obj instanceof Bus) {
            return ((Bus) obj).getNum();
        }
        else {
            throw new IllegalArgumentException("Объект не является Bus");
        }
    }
}
