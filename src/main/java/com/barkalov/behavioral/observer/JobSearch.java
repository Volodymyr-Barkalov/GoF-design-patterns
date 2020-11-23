package com.barkalov.behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JobSite jobSite = new JobSite();
        jobSite.addVacancy("Java developer");
        jobSite.addVacancy("C++ developer");

        Observer firstSubscriber = new Subscriber("John Snow");
        Observer secondSubscriber = new Subscriber("Ivan Ivanov");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Ruby developer");

        jobSite.removeVacancy("C++ developer");
    }
}
