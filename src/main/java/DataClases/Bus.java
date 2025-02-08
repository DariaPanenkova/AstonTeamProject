package main.java.DataClases;

public class Bus {
    private Integer    num;
    private String     model;
    private Integer    mileage;

    public Bus(BusBuilder busBuilder) {
        this.num = busBuilder.num;
        this.model = busBuilder.model;
        this.mileage = busBuilder.mileage;
    }

    public Integer getNum() {
        return num;
    }

    public String getModel() {
        return model;
    }

    public Integer getMileage() {
        return mileage;
    }

    public static class BusBuilder {
        private Integer num;
        private String model;
        private Integer mileage;

        public BusBuilder setNum(Integer num) {
            this.num = num;
            return this;
        }

        public BusBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public BusBuilder setMileage(Integer mileage) {
            this.mileage = mileage;
            return this;
        }

        public Bus build() {
            return new Bus(this);
        }
    }
}
