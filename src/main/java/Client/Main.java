package Client;

import DataClasses.Bus;
import SortDir.quickSorts.QuickSortBus;

public class Main {
    public static void main(String[] args) {
        Bus b1 =  new Bus.BusBuilder().setMileage(1000).setModel("abcc").setNum(100).build();
        Bus b2 =  new Bus.BusBuilder().setMileage(100).setModel("abcc").setNum(100).build();
        Bus b3 =  new Bus.BusBuilder().setMileage(100).setModel("aabcc").setNum(100).build();
        Bus b4 =  new Bus.BusBuilder().setMileage(100).setModel("abcc").setNum(4).build();

        Bus[] buses = new Bus[]{b1,b2,b3,b4};

        new QuickSortBus().sort(buses);
        System.out.println();



    }
}