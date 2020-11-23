package com.barkalov.behavioral.strategy;

public class Developer {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void justDoIt() {
        activity.doAction();
    }
}
