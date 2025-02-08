package main.java.DataClases;

public class Bus {
    private Integer    num;
    private String     model;
    private int    mileage;

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
