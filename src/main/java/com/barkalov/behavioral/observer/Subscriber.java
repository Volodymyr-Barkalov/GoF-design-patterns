package com.barkalov.behavioral.observer;

import java.util.List;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancacies) {
        System.out.println("Dear " + name + "\nwe hava some changes in vacancies:\n" + vacancacies
        + "\n====================================================\n");
    }
}
