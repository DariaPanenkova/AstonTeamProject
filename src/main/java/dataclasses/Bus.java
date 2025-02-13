package dataclasses;

import java.util.Objects;

public class Bus {
    private final int num;
    private final String model;
    private final int mileage;

    public Bus(BusBuilder busBuilder) {
        this.num = busBuilder.num;
        this.model = busBuilder.model;
        this.mileage = busBuilder.mileage;
    }

    public int getNum() {
        return num;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bus bus)) {
            return false;
        }
        return num == bus.num
                && Objects.equals(model, bus.model)
                && mileage == bus.mileage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, model, mileage);
    }

    @Override
    public String toString() {
        return "Номер автобуса: " + num + " Модель: " + model + " Пробег: " + mileage;
    }


    public static class BusBuilder {
        private int num;
        private String model;
        private int mileage;

        public BusBuilder setNum(int num) {
            this.num = num;
            return this;
        }

        public BusBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public BusBuilder setMileage(int mileage) {
            this.mileage = mileage;
            return this;
        }

        public Bus build() {
            return new Bus(this);
        }
    }
}
