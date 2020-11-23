package com.barkalov.behavioral.chain;

public class SimpleReportNotifier extends Notifier {

    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Simple report: " + message);
    }
}
