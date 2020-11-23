package com.barkalov.behavioral.state;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (activity instanceof Sleeping) {
            setActivity(new Working());
        } else if (activity instanceof Working) {
            setActivity(new Learning());
        } else if (activity instanceof Learning) {
            setActivity(new Sleeping());
        }
    }

    public void doAction() {
        activity.doAction();
    }
}
