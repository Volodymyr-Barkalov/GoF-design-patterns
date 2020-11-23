package com.barkalov.creational.builder;

public class SportCar {
    private String name;
    private int price;
    private int maxSpeed;

    public SportCar(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.maxSpeed = builder.maxSpeed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    static class Builder {
        private String name;
        private int price;
        private int maxSpeed;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;

        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public SportCar build() {
            return new SportCar(this);
        }
    }
}
