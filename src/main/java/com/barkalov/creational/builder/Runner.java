package com.barkalov.creational.builder;

public class Runner {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar.Builder().setPrice(1000).build();
        SC sc = SC.builder().maxSpeed(200).build();
        System.out.println(sportCar);
        System.out.println(sc);
    }
}
