package SortDir.comparators;

import DataClasses.Bus;

import java.util.Comparator;

public class BusComparator implements Comparator<Bus> {
    @Override
    public int compare(Bus o1, Bus o2) {
        if (o1.getNum()-o2.getNum()!=0)
            return o1.getNum()-o2.getNum();
        else if ((o1.getModel().compareTo(o2.getModel())!=0))
            return o1.getModel().compareTo(o2.getModel());
        else return o1.getMileage() - o2.getMileage();
    }
}
