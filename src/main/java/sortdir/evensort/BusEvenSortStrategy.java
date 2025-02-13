package sortdir.evensort;

import classes.Bus;

import java.util.Comparator;

public class BusEvenSortStrategy implements EvenSortStrategy<Bus> {
    @Override
    public Comparator<Bus> getComparator() {
        return Comparator.comparingInt(Bus::getNum);
    }

    @Override
    public int getNumberField(Object obj) {
        if (obj instanceof Bus) {
            return ((Bus) obj).getNum();
        } else {
            throw new IllegalArgumentException("Объект не является Bus");
        }
    }
}
