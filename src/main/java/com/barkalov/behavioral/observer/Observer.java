package com.barkalov.behavioral.observer;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> vacancacies);
}
