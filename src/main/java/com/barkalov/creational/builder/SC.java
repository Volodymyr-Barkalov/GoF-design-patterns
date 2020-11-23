package com.barkalov.creational.builder;

import lombok.ToString;

@ToString
public class SC {
    private String name;
    private int price;
    private int maxSpeed;

    SC(String name, int price, int maxSpeed) {
        this.name = name;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    public static SCBuilder builder() {
        return new SCBuilder();
    }

    public static class SCBuilder {
        private String name;
        private int price;
        private int maxSpeed;

        SCBuilder() {
        }

        public SCBuilder name(String name) {
            this.name = name;
            return this;
        }

        public SCBuilder price(int price) {
            this.price = price;
            return this;
        }

        public SCBuilder maxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public SC build() {
            return new SC(name, price, maxSpeed);
        }
    }
}
